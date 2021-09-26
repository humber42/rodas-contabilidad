package cu.hash.rodascontabilidad.services;

import cu.hash.rodascontabilidad.models.PlanProduccionEntity;
import cu.hash.rodascontabilidad.repository.PlanProduccionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PlanProduccionService {
    @Autowired
    private PlanProduccionRepository repository;

    public List<PlanProduccionEntity> findAll(){
        return repository.findAll();
    }

    public List<PlanProduccionEntity> findAllByIdUeb(Long idUEB){
        return repository.findAllByIdUeb(idUEB);
    }

    public Optional<PlanProduccionEntity> findById(Long id){
        return repository.findById(id);
    }

    public PlanProduccionEntity addPlanProduccion(PlanProduccionEntity planProduccionEntity){
        return repository.save(planProduccionEntity);
    }

    public PlanProduccionEntity updateOrDeletePlanProduccion(PlanProduccionEntity planProduccionEntity){
        return repository.saveAndFlush(planProduccionEntity);
    }
}
