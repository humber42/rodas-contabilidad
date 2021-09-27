package cu.hash.rodascontabilidad.services;

import cu.hash.rodascontabilidad.dto.ActividadDto;
import cu.hash.rodascontabilidad.models.ActividadEntity;
import cu.hash.rodascontabilidad.repository.ActividadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ActividadService {

    @Autowired
    private ActividadRepository repository;
    @Autowired
    private TipoActividadService tipoActividadService;
    @Autowired
    private UnidadMedidaService unidadMedidaService;
    @Autowired
    private ListResolvers listResolvers;

    public List<ActividadDto> findAll() {
        return repository.findAll()
                .stream()
                .map(this::mappearActividad)
                .collect(Collectors.toList());
    }

    public List<ActividadDto> findAllByIdTipoActividad(Long idTipoActividad) {
        return repository.findAllByIdTipoActividad(idTipoActividad)
                .stream()
                .map(this::mappearActividad)
                .collect(Collectors.toList());
    }

    public Optional<ActividadDto> findById(Long id) {
        return repository.findById(id).map(this::mappearActividad);
    }

    public Optional<ActividadDto> findByIdAndCodigo(Long id, String codigo) {
        return repository.findByIdAndCodigo(id, codigo).map(this::mappearActividad);
    }

    public ActividadDto addActividad(ActividadEntity actividadEntity) {
        return this.mappearActividad(repository.save(actividadEntity));
    }

    public ActividadDto updateOrDeleteActividad(ActividadEntity actividadEntity) {
        return this.mappearActividad(repository.saveAndFlush(actividadEntity));
    }

    public void deleteById(long id){
        repository.deleteById(id);
    }

    private ActividadDto mappearActividad(ActividadEntity entity) {
        return ActividadDto.builder()
                .id(entity.getId())
                .codigo(entity.getCodigo())
                .idTipoActividad(entity.getIdTipoActividad())
                .nombre(entity.getNombre())
                .idUnidadMedida(entity.getIdUnidadMedida())
                .descripcion(entity.getDescripcion())
                .tipoActividad(tipoActividadService.findById(entity.getIdTipoActividad()).get())
                .unidadMedida(unidadMedidaService.findById(entity.getIdUnidadMedida()).get())
                .planProduccionList(listResolvers.getPlanProduccionActividad(entity.getId()))
                .ordenTrabajoList(listResolvers.getOrdenTrabajoActividad(entity.getId()))
                .build();


    }
}
