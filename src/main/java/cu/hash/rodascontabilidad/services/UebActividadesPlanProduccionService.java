package cu.hash.rodascontabilidad.services;

import cu.hash.rodascontabilidad.models.UebActividadesPlanProduccionEntity;
import cu.hash.rodascontabilidad.repository.UebActividadesPlanProduccionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UebActividadesPlanProduccionService {
    @Autowired
    private UebActividadesPlanProduccionRepository repository;

    public List<UebActividadesPlanProduccionEntity> findAll(){
        return repository.findAll();
    }

    public Optional<UebActividadesPlanProduccionEntity> findById(Long id){
        return repository.findById(id);
    }

    public UebActividadesPlanProduccionEntity addUebActividadPlanProduccion(UebActividadesPlanProduccionEntity uebActividadesPlanProduccionEntity){
        return repository.save(uebActividadesPlanProduccionEntity);
    }

    public UebActividadesPlanProduccionEntity updateOrDeleteUebActividadPlanProduccion(UebActividadesPlanProduccionEntity uebActividadesPlanProduccionEntity){
        return repository.saveAndFlush(uebActividadesPlanProduccionEntity);
    }
}
