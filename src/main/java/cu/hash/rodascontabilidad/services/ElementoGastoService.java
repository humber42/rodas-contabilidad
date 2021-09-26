package cu.hash.rodascontabilidad.services;

import cu.hash.rodascontabilidad.models.ElementoGastoEntity;
import cu.hash.rodascontabilidad.repository.ElementoGastoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ElementoGastoService {
    @Autowired
    private ElementoGastoRepository repository;

    public List<ElementoGastoEntity> findAll(){
        return repository.findAll();
    }

    public Optional<ElementoGastoEntity> findById(Long id){
        return repository.findById(id);
    }

    public ElementoGastoEntity findByCodigoElemento(String codigo){
        return repository.findByCodigoElemento(codigo);
    }

    public ElementoGastoEntity addElementoGasto(ElementoGastoEntity elementoGastoEntity){
        return repository.save(elementoGastoEntity);
    }

    public ElementoGastoEntity updateOrDeleteElementoGasto(ElementoGastoEntity elementoGastoEntity){
        return repository.saveAndFlush(elementoGastoEntity);
    }
}
