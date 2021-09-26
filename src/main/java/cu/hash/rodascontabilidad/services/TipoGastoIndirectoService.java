package cu.hash.rodascontabilidad.services;

import cu.hash.rodascontabilidad.models.TipoGastoIndirectoEntity;
import cu.hash.rodascontabilidad.repository.TipoGastoIndirectoRepositrory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TipoGastoIndirectoService {
    @Autowired
    private TipoGastoIndirectoRepositrory repository;

    public List<TipoGastoIndirectoEntity> findAll(){
        return repository.findAll();
    }

    public Optional<TipoGastoIndirectoEntity> findById(Long id){
        return repository.findById(id);
    }

    public TipoGastoIndirectoEntity addTipoGI(TipoGastoIndirectoEntity tipoGastoIndirectoEntity){
        return repository.save(tipoGastoIndirectoEntity);
    }

    public TipoGastoIndirectoEntity updateOrDeleteTipoGI(TipoGastoIndirectoEntity tipoGastoIndirectoEntity){
        return repository.saveAndFlush(tipoGastoIndirectoEntity);
    }
}
