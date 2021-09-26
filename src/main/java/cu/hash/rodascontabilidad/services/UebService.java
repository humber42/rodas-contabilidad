package cu.hash.rodascontabilidad.services;

import cu.hash.rodascontabilidad.models.UebEntity;
import cu.hash.rodascontabilidad.repository.UEBRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UebService {
    @Autowired
    private UEBRepository repository;

    public List<UebEntity> findAll(){
        return repository.findAll();
    }

    public Optional<UebEntity> findById(Long id){
        return repository.findById(id);
    }

    public UebEntity findByCodigoUeb(String codigo){
        return repository.findByCodigoUeb(codigo);
    }

    public UebEntity findByIdAndNombreUeb(Long id, String nombre){
        return repository.findByIdAndNombreUeb(id, nombre);
    }

    public UebEntity addUEB(UebEntity ueb){
        return repository.save(ueb);
    }

    public UebEntity updateOrDeleteUEB(UebEntity ueb){
        return repository.saveAndFlush(ueb);
    }
}
