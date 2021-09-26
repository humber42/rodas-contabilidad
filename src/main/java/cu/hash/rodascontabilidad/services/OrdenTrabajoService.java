package cu.hash.rodascontabilidad.services;

import cu.hash.rodascontabilidad.models.OrdenTrabajoEntity;
import cu.hash.rodascontabilidad.repository.OrdenTrabajoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrdenTrabajoService {
    @Autowired
    private OrdenTrabajoRepository repository;

    public List<OrdenTrabajoEntity> findAll(){
        return repository.findAll();
    }

    public Optional<OrdenTrabajoEntity> findById(Long id){
        return repository.findById(id);
    }

    public OrdenTrabajoEntity addOrdenTrabajo(OrdenTrabajoEntity ordenTrabajoEntity){
        return repository.save(ordenTrabajoEntity);
    }

    public OrdenTrabajoEntity updateOrDeleteOrdenTrabajo(OrdenTrabajoEntity ordenTrabajoEntity){
        return repository.saveAndFlush(ordenTrabajoEntity);
    }
}
