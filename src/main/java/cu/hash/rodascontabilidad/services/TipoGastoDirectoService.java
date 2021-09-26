package cu.hash.rodascontabilidad.services;

import cu.hash.rodascontabilidad.models.TipoGastoDirectoEntity;
import cu.hash.rodascontabilidad.repository.TipoGastoDirectoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TipoGastoDirectoService {
    @Autowired
    private TipoGastoDirectoRepository repository;

    public List<TipoGastoDirectoEntity> findAll(){
        return repository.findAll();
    }

    public Optional<TipoGastoDirectoEntity> findById(Long id){
        return repository.findById(id);
    }

    public TipoGastoDirectoEntity addTipoGD(TipoGastoDirectoEntity tipoGastoDirectoEntity){
        return repository.save(tipoGastoDirectoEntity);
    }

    public TipoGastoDirectoEntity updateOrDeleteTipoGD(TipoGastoDirectoEntity tipoGastoDirectoEntity){
        return repository.saveAndFlush(tipoGastoDirectoEntity);
    }
}
