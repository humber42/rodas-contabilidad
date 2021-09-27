package cu.hash.rodascontabilidad.services;

import cu.hash.rodascontabilidad.dto.TrabajadorDto;
import cu.hash.rodascontabilidad.models.TrabajadorEntity;
import cu.hash.rodascontabilidad.repository.TrabajadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class TrabajadorService {
    @Autowired
    private TrabajadorRepository repository;
    @Autowired
    private UebService uebService;
    @Autowired
    private CargoService cargoService;
    @Autowired
    private ListResolvers listResolvers;

    public List<TrabajadorDto> findAll() {
        return repository.findAll().stream()
                .map(this::mapper)
                .collect(Collectors.toList());
    }
    public void deleteById(long id){
        repository.deleteById(id);
    }

    public Optional<TrabajadorDto> findById(Long id) {
        return repository.findById(id).map(this::mapper);
    }

    public TrabajadorDto findFirstByNombre(String nombre) {
        return this.mapper(repository.findFirstByNombre(nombre));
    }

    public List<TrabajadorDto> findAllByNombre(String nombre) {
        return repository.findAllByNombre(nombre).stream()
                .map(this::mapper)
                .collect(Collectors.toList());
    }

    public List<TrabajadorDto> findAllByIdUeb(Long idUEB) {
        return repository.findAllByIdUeb(idUEB).stream()
                .map(this::mapper)
                .collect(Collectors.toList());
    }

    public List<TrabajadorDto> findAllByIdCargoAndIdUeb(Long idCargo, Long idUEB) {
        return repository.findAllByIdCargoAndIdUeb(idCargo, idUEB).stream()
                .map(this::mapper)
                .collect(Collectors.toList());
    }

    public TrabajadorDto addTrabajador(TrabajadorEntity trabajadorEntity) {
        return this.mapper(repository.save(trabajadorEntity));
    }

    public TrabajadorDto updateOrDeleteTrabajador(TrabajadorEntity trabajadorEntity) {
        return this.mapper(repository.saveAndFlush(trabajadorEntity));
    }

    private TrabajadorDto mapper(TrabajadorEntity entity) {
        return TrabajadorDto.builder()
                .id(entity.getId())
                .nombre(entity.getNombre())
                .idCargo(entity.getIdCargo())
                .idUeb(entity.getIdUeb())
                .cargoDto(cargoService.findById(entity.getIdCargo()).get())
                .ueb(uebService.findById(entity.getIdUeb()).get())
                .reporteDiarioLaboralList(listResolvers.getReporteDiarioLaboralByTrabajador(entity.getId()))
                .build();
    }
}
