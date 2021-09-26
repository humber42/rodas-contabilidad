package cu.hash.rodascontabilidad.services;

import cu.hash.rodascontabilidad.models.ClienteEntity;
import cu.hash.rodascontabilidad.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteService {
    @Autowired
    private ClienteRepository repository;

    public List<ClienteEntity> findAll(){
        return repository.findAll();
    }

    public Optional<ClienteEntity> findById(Long id){
        return repository.findById(id);
    }

    public ClienteEntity findByIdAndNombre(Long id, String nombre){
        return repository.findByIdAndNombre(id, nombre);
    }

    public ClienteEntity findByNombre(String nombre){
        return repository.findByNombre(nombre);
    }

    public ClienteEntity addCliente(ClienteEntity clienteEntity){
        return repository.save(clienteEntity);
    }

    public ClienteEntity updateOrDeleteCliente(ClienteEntity clienteEntity){
        return repository.saveAndFlush(clienteEntity);
    }
}
