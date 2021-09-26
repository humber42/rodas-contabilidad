package cu.hash.rodascontabilidad.services;

import cu.hash.rodascontabilidad.models.SubelementoGastoEntity;
import cu.hash.rodascontabilidad.repository.SubelementoGastoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SubelementoGastoService {
    @Autowired
    private SubelementoGastoRepository repository;

    public List<SubelementoGastoEntity> findAll(){
        return repository.findAll();
    }

    public Optional<SubelementoGastoEntity> findById(Long id){
        return repository.findById(id);
    }

    public SubelementoGastoEntity findByCodigoSubelemento(String codigo){
        return repository.findByCodigoSubelemento(codigo);
    }

    public SubelementoGastoEntity addSubelementoGasto(SubelementoGastoEntity subelementoGastoEntity){
        return repository.save(subelementoGastoEntity);
    }

    public SubelementoGastoEntity updateOrDeleteSubelementoGasto(SubelementoGastoEntity subelementoGastoEntity){
        return repository.saveAndFlush(subelementoGastoEntity);
    }
}
