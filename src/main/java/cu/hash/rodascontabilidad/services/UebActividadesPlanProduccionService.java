package cu.hash.rodascontabilidad.services;

import cu.hash.rodascontabilidad.dto.UebActividadesPlanProduccionDto;
import cu.hash.rodascontabilidad.models.UebActividadesPlanProduccionEntity;
import cu.hash.rodascontabilidad.repository.UebActividadesPlanProduccionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class UebActividadesPlanProduccionService {
    @Autowired
    private UebActividadesPlanProduccionRepository repository;

    @Autowired
    private ActividadService actividadService;
    @Autowired
    private PlanProduccionService planProduccionService;

    public List<UebActividadesPlanProduccionDto> findAll() {
        return repository.findAll().stream().map(this::mapper).collect(Collectors.toList());
    }

    public void deleteByIdActividadAndIdPlanProduccion(long idActiviad, long idPlanProduccion) {
        Optional<UebActividadesPlanProduccionEntity> entity = repository.getByIdActividadAndIdPlanProduccion(idActiviad, idPlanProduccion);
        entity.ifPresent(p ->
                this.deleteById(p.getId())
        );
    }

    public Optional<UebActividadesPlanProduccionDto> findById(Long id) {
        return repository.findById(id).map(this::mapper);
    }
    public void deleteById(long id){
        repository.deleteById(id);
    }

    public UebActividadesPlanProduccionDto addUebActividadPlanProduccion(UebActividadesPlanProduccionEntity uebActividadesPlanProduccionEntity) {
        return this.mapper(repository.save(uebActividadesPlanProduccionEntity));
    }

    public UebActividadesPlanProduccionDto updateOrDeleteUebActividadPlanProduccion(UebActividadesPlanProduccionEntity uebActividadesPlanProduccionEntity) {
        return this.mapper(repository.saveAndFlush(uebActividadesPlanProduccionEntity));
    }

    private UebActividadesPlanProduccionDto mapper(UebActividadesPlanProduccionEntity entity) {
        return UebActividadesPlanProduccionDto.builder()
                .id(entity.getId())
                .idActividad(entity.getIdActividad())
                .idPlanProduccion(entity.getIdPlanProduccion())
                .planProduccion(planProduccionService.findByIdToListResolver(entity.getIdPlanProduccion()).get())
                .actividad(actividadService.findByIdToListResolver(entity.getIdActividad()).get())
                .build();
    }
}
