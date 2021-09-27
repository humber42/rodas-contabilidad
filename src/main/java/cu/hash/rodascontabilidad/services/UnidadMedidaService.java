package cu.hash.rodascontabilidad.services;

import cu.hash.rodascontabilidad.dto.UnidadMedidaDto;
import cu.hash.rodascontabilidad.models.UnidadMedidaEntity;
import cu.hash.rodascontabilidad.repository.UnidadMedidaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class UnidadMedidaService {
    @Autowired
    private UnidadMedidaRepository repository;

    public List<UnidadMedidaDto> findAll() {
        return repository.findAll()
                .stream()
                .map(this::mapear)
                .collect(Collectors.toList());
    }
    public void deleteById(long id){
        repository.deleteById(id);
    }

    public Optional<UnidadMedidaDto> findById(Long id) {
        return repository.findById(id).map(this::mapear);
    }

    public UnidadMedidaDto findByIdAndNombre(Long id, String nombre) {
        return this.mapear(repository.findByIdAndNombre(id, nombre));
    }

    public UnidadMedidaDto findByCodigoUnidadMedida(String codigo) {
        return this.mapear(repository.findByCodigoUnidadMedida(codigo));
    }

    public UnidadMedidaDto addUM(UnidadMedidaEntity unidadMedidaEntity) {
        return this.mapear(repository.save(unidadMedidaEntity));
    }

    public UnidadMedidaDto updateOrDeleteUM(UnidadMedidaEntity unidadMedidaEntity) {
        return this.mapear(repository.saveAndFlush(unidadMedidaEntity));
    }

    private UnidadMedidaDto mapear(UnidadMedidaEntity entity) {
        return UnidadMedidaDto.builder()
                .id(entity.getId())
                .codigoUnidadMedida(entity.getCodigoUnidadMedida())
                .nombre(entity.getNombre())
                .descripcion(entity.getDescripcion())
                .build();
    }
}
