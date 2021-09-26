package cu.hash.rodascontabilidad.services;

import cu.hash.rodascontabilidad.models.TipoActividadEntity;
import cu.hash.rodascontabilidad.repository.TipoActividadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TipoActividadService {
    @Autowired
    private TipoActividadRepository repository;

    public List<TipoActividadEntity> findAll(){
        return repository.findAll();
    }

    public Optional<TipoActividadEntity> findById(Long id){
        return repository.findById(id);
    }

    public TipoActividadEntity findByIdAndCodigo(Long id, String codigo){
        return repository.findByIdAndCodigo(id, codigo);
    }

    public TipoActividadEntity findByIdAndNombre(Long id, String nombre){
        return repository.findByIdAndNombre(id, nombre);
    }

    public TipoActividadEntity addTipoActividad(TipoActividadEntity tipoActividadEntity){
        return repository.save(tipoActividadEntity);
    }

    public TipoActividadEntity updateOrDeleteTipoActividad(TipoActividadEntity tipoActividadEntity){
        return repository.saveAndFlush(tipoActividadEntity);
    }
}
