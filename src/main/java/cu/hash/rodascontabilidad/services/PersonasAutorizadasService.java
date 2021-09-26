package cu.hash.rodascontabilidad.services;

import cu.hash.rodascontabilidad.models.PersonasAutorizadasEntity;
import cu.hash.rodascontabilidad.repository.PersonasAutorizadasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonasAutorizadasService {
    @Autowired
    private PersonasAutorizadasRepository repository;

    public List<PersonasAutorizadasEntity> findAll(){
        return repository.findAll();
    }

    public Optional<PersonasAutorizadasEntity> findById(Long id){
        return repository.findById(id);
    }

    public List<PersonasAutorizadasEntity> findAllByIdCargo(Long idCargo){
        return repository.findAllByIdCargo(idCargo);
    }

    public PersonasAutorizadasEntity findByIdUsuario(String userID){
        return repository.findByIdUsuario(userID);
    }

    public PersonasAutorizadasEntity addPersonaAutorizada(PersonasAutorizadasEntity personasAutorizadasEntity){
        return repository.save(personasAutorizadasEntity);
    }

    public PersonasAutorizadasEntity updateOrDeletePersonaAutorizada(PersonasAutorizadasEntity personasAutorizadasEntity){
        return repository.saveAndFlush(personasAutorizadasEntity);
    }
}
