package cu.hash.rodascontabilidad.services;

import cu.hash.rodascontabilidad.models.ActividadEntity;
import cu.hash.rodascontabilidad.repository.ActividadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ActividadService {
    @Autowired
    private ActividadRepository repository;

    public List<ActividadEntity> findAll(){
        return repository.findAll();
    }

    public List<ActividadEntity> findAllByIdTipoActividad(Long idTipoActividad){
        return repository.findAllByIdTipoActividad(idTipoActividad);
    }

    public Optional<ActividadEntity> findById(Long id){
        return repository.findById(id);
    }

    public  Optional<ActividadEntity> findByIdAndCodigo(Long id, String codigo){
        return repository.findByIdAndCodigo(id, codigo);
    }

    public ActividadEntity addActividad(ActividadEntity actividadEntity){
        return repository.save(actividadEntity);
    }

    public ActividadEntity updateOrDeleteActividad(ActividadEntity actividadEntity){
        return repository.saveAndFlush(actividadEntity);
    }
}
