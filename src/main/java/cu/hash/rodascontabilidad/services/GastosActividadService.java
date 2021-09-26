package cu.hash.rodascontabilidad.services;

import cu.hash.rodascontabilidad.models.GastosActividadEntity;
import cu.hash.rodascontabilidad.repository.GastosActividadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GastosActividadService {
    @Autowired
    private GastosActividadRepository repository;

    public List<GastosActividadEntity> findAll(){
        return repository.findAll();
    }

    public List<GastosActividadEntity> findAllByIdActividad(Long idActividad){
        return repository.findAllByIdActividad(idActividad);
    }

    public Optional<GastosActividadEntity> findById(Long id){
        return repository.findById(id);
    }

    public GastosActividadEntity addGastosActividad(GastosActividadEntity gastosActividadEntity){
        return repository.save(gastosActividadEntity);
    }

    public GastosActividadEntity updateOrDeleteGastosActividad(GastosActividadEntity gastosActividadEntity){
        return repository.saveAndFlush(gastosActividadEntity);
    }
}
