package cu.hash.rodascontabilidad.services;

import cu.hash.rodascontabilidad.models.GastoIndirectoEntity;
import cu.hash.rodascontabilidad.repository.GastoIndirectoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GastoIndirectoService {
    @Autowired
    private GastoIndirectoRepository repository;

    public List<GastoIndirectoEntity> findAll(){
        return repository.findAll();
    }

    public Optional<GastoIndirectoEntity> findById(Long id){
        return repository.findById(id);
    }

    public GastoIndirectoEntity findByNombre(String nombre){
        return repository.findByNombre(nombre);
    }

    public GastoIndirectoEntity findByCodigoAndNombre(String codigo, String nombre){
        return repository.findByCodigoAndNombre(codigo, nombre);
    }

    public GastoIndirectoEntity findByIdAndCodigo(Long id, String codigo){
        return repository.findByIdAndCodigo(id, codigo);
    }

    public GastoIndirectoEntity addGI(GastoIndirectoEntity gastoIndirectoEntity){
        return repository.save(gastoIndirectoEntity);
    }

    public GastoIndirectoEntity updateOrDeleteGI(GastoIndirectoEntity gastoIndirectoEntity){
        return repository.saveAndFlush(gastoIndirectoEntity);
    }
}
