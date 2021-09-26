package cu.hash.rodascontabilidad.services;

import cu.hash.rodascontabilidad.models.MaterialEntity;
import cu.hash.rodascontabilidad.repository.MaterialRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MaterialService {
    @Autowired
    private MaterialRepository repository;

    public List<MaterialEntity> findAll(){
        return repository.findAll();
    }

    public Optional<MaterialEntity> findById(Long id){
        return repository.findById(id);
    }

    public MaterialEntity addMaterial(MaterialEntity materialEntity){
        return repository.save(materialEntity);
    }

    public MaterialEntity updateOrDeleteMaterial(MaterialEntity materialEntity){
        return repository.saveAndFlush(materialEntity);
    }
}
