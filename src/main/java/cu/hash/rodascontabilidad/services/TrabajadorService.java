package cu.hash.rodascontabilidad.services;

import cu.hash.rodascontabilidad.models.TrabajadorEntity;
import cu.hash.rodascontabilidad.repository.TrabajadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TrabajadorService {
    @Autowired
    private TrabajadorRepository repository;

    public List<TrabajadorEntity> findAll(){
        return repository.findAll();
    }

    public Optional<TrabajadorEntity> findById(Long id){
        return repository.findById(id);
    }

    public TrabajadorEntity findFirstByNombre(String nombre){
        return repository.findFirstByNombre(nombre);
    }

    public List<TrabajadorEntity> findAllByNombre(String nombre){
        return repository.findAllByNombre(nombre);
    }

    public List<TrabajadorEntity> findAllByIdUeb(Long idUEB){
        return repository.findAllByIdUeb(idUEB);
    }

    public List<TrabajadorEntity> findAllByIdCargoAndIdUeb(Long idCargo, Long idUEB){
        return repository.findAllByIdCargoAndIdUeb(idCargo, idUEB);
    }

    public TrabajadorEntity addTrabajador(TrabajadorEntity trabajadorEntity){
        return repository.save(trabajadorEntity);
    }

    public TrabajadorEntity updateOrDeleteTrabajador(TrabajadorEntity trabajadorEntity){
        return repository.saveAndFlush(trabajadorEntity);
    }
}
