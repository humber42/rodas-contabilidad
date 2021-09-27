package cu.hash.rodascontabilidad.services;

import cu.hash.rodascontabilidad.dto.TipoActividadDto;
import cu.hash.rodascontabilidad.models.TipoActividadEntity;
import cu.hash.rodascontabilidad.repository.TipoActividadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class TipoActividadService {
    @Autowired
    private TipoActividadRepository repository;

    public List<TipoActividadDto> findAll() {
        return repository.findAll()
                .stream()
                .map(this::mapear)
                .collect(Collectors.toList());
    }

    public void deleteById(long id){
        repository.deleteById(id);
    }
    public Optional<TipoActividadDto> findById(Long id) {
        return repository.findById(id).map(this::mapear);
    }

    public TipoActividadDto findByIdAndCodigo(Long id, String codigo) {
        return this.mapear(repository.findByIdAndCodigo(id, codigo));
    }

    public TipoActividadDto findByIdAndNombre(Long id, String nombre) {
        return this.mapear(repository.findByIdAndNombre(id, nombre));
    }

    public TipoActividadDto addTipoActividad(TipoActividadEntity tipoActividadEntity) {
        return this.mapear(repository.save(tipoActividadEntity));
    }

    public TipoActividadDto updateOrDeleteTipoActividad(TipoActividadEntity tipoActividadEntity) {
        return this.mapear(repository.saveAndFlush(tipoActividadEntity));
    }

    private TipoActividadDto mapear(TipoActividadEntity entity) {
        return TipoActividadDto.builder()
                .id(entity.getId())
                .codigo(entity.getCodigo())
                .nombre(entity.getNombre())
                .descripcion(entity.getDescripcion())
                .build();
    }
}
