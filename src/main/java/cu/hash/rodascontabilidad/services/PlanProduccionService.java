package cu.hash.rodascontabilidad.services;

import cu.hash.rodascontabilidad.dto.PlanProduccionDto;
import cu.hash.rodascontabilidad.models.PlanProduccionEntity;
import cu.hash.rodascontabilidad.repository.PlanProduccionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class PlanProduccionService {
    @Autowired
    private PlanProduccionRepository repository;
    @Autowired
    private UebService uebService;
    @Autowired
    private ListResolvers listResolvers;

    public List<PlanProduccionDto> findAll() {
        return repository.findAll()
                .stream().map(this::mapper)
                .collect(Collectors.toList());
    }
    public void deleteById(long id){
        repository.deleteById(id);
    }

    public List<PlanProduccionDto> findAllByIdUeb(Long idUEB) {
        return repository.findAllByIdUeb(idUEB).stream().map(this::mapper)
                .collect(Collectors.toList());
    }

    public Optional<PlanProduccionDto> findById(Long id) {
        return repository.findById(id).map(this::mapper);
    }

    public PlanProduccionDto addPlanProduccion(PlanProduccionEntity planProduccionEntity) {
        return this.mapper(repository.save(planProduccionEntity));
    }

    public PlanProduccionDto updateOrDeletePlanProduccion(PlanProduccionEntity planProduccionEntity) {
        return this.mapper(repository.saveAndFlush(planProduccionEntity));
    }

    private PlanProduccionDto mapper(PlanProduccionEntity entity) {
        return PlanProduccionDto.builder()
                .id(entity.getId())
                .idUeb(entity.getIdUeb())
                .ueb(uebService.findById(entity.getIdUeb()).get())
                .actividadDtoList(listResolvers.getActividadesByPlanProduccion(entity.getId()))
                .normasConsumoList(listResolvers.getNormasConsumoByPlanProduccion(entity.getId()))
                .build();
    }
}
