package cu.hash.rodascontabilidad.services;

import cu.hash.rodascontabilidad.dto.CargoDto;
import cu.hash.rodascontabilidad.dto.classesWhithoutCollections.CargoWithoutList;
import cu.hash.rodascontabilidad.models.CargoEntity;
import cu.hash.rodascontabilidad.repository.CargoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class CargoService {
    @Autowired
    private CargoRepository repository;
    @Autowired
    private ListResolvers listResolvers;

    public List<CargoDto> findAll() {
        return repository.findAll()
                .stream()
                .map(this::mapear)
                .collect(Collectors.toList());
    }
    public void deleteById(long id){
        repository.deleteById(id);
    }

    public Optional<CargoDto> findById(Long id) {
        return repository.findById(id).map(this::mapear);
    }

    public Optional<CargoWithoutList> findByIdToListResolvers(long id) {
        return repository.findById(id).map(this::mappearToListResolvers);
    }

    public CargoDto findByNombre(String nombre) {
        return this.mapear(repository.findByNombre(nombre));
    }

    public CargoDto findByIdAndNombre(Long id, String nombre) {
        return this.mapear(repository.findByIdAndNombre(id, nombre));
    }

    public CargoDto addCargo(CargoEntity cargoEntity) {
        return this.mapear(repository.save(cargoEntity));
    }

    public CargoDto updateOrDeleteCargo(CargoEntity cargoEntity) {
        return this.mapear(repository.saveAndFlush(cargoEntity));
    }

    private CargoDto mapear(CargoEntity entity) {
        return CargoDto.builder()
                .id(entity.getId())
                .nombre(entity.getNombre())
                .descripcion(entity.getDescripcion())
                .salarioBasicoMinimo(entity.getSalarioBasicoMinimo())
                .salarioBasicoMaximo(entity.getSalarioBasicoMaximo())
                .salarioMinimoMlc(entity.getSalarioMinimoMlc())
                .salarioMaximoMlc(entity.getSalarioMaximoMlc())
                .personasAutorizadasList(listResolvers.getPersonasAutorizadasByCargo(entity.getId()))
                .build();
    }

    private CargoWithoutList mappearToListResolvers(CargoEntity entity) {
        return CargoWithoutList.builder()
                .id(entity.getId())
                .nombre(entity.getNombre())
                .descripcion(entity.getDescripcion())
                .salarioBasicoMinimo(entity.getSalarioBasicoMinimo())
                .salarioBasicoMaximo(entity.getSalarioBasicoMaximo())
                .salarioMinimoMlc(entity.getSalarioMinimoMlc())
                .salarioMaximoMlc(entity.getSalarioMaximoMlc())
                .build();
    }
}
