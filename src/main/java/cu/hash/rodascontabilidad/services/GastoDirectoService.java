package cu.hash.rodascontabilidad.services;

import cu.hash.rodascontabilidad.models.GastoDirectoEntity;
import cu.hash.rodascontabilidad.repository.GastoDirectoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GastoDirectoService {
    @Autowired
    private GastoDirectoRepository repository;

    public List<GastoDirectoEntity> findAll(){
        return repository.findAll();
    }

    public Optional<GastoDirectoEntity> findById(Long id){
        return repository.findById(id);
    }

    public GastoDirectoEntity findByNombre(String nombre){
        return repository.findByNombre(nombre);
    }

    public GastoDirectoEntity findByCodigoAndNombre(String codigo, String nombre){
        return repository.findByCodigoAndNombre(codigo, nombre);
    }

    public GastoDirectoEntity findByIdAndCodigo(Long id, String codigo){
        return repository.findByIdAndCodigo(id, codigo);
    }

    public GastoDirectoEntity addGD(GastoDirectoEntity gastoDirectoEntity){
        return repository.save(gastoDirectoEntity);
    }

    public GastoDirectoEntity updateOrDeleteGD(GastoDirectoEntity gastoDirectoEntity){
        return repository.saveAndFlush(gastoDirectoEntity);
    }
}
