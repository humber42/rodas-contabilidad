package cu.hash.rodascontabilidad.services;

import cu.hash.rodascontabilidad.models.UebEtapaEntity;
import cu.hash.rodascontabilidad.repository.UebEtapaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UebEtapaService {
    @Autowired
    private UebEtapaRepository repository;

    public List<UebEtapaEntity> findAll(){
        return repository.findAll();
    }

    public Optional<UebEtapaEntity> findById(Long id){
        return repository.findById(id);
    }

    public UebEtapaEntity addUebEtapa(UebEtapaEntity uebEtapaEntity){
        return repository.save(uebEtapaEntity);
    }

    public UebEtapaEntity updateOrDeleteUebEtapa(UebEtapaEntity uebEtapaEntity){
        return repository.saveAndFlush(uebEtapaEntity);
    }
}
