package cu.hash.rodascontabilidad.services;

import cu.hash.rodascontabilidad.models.EtapaEntity;
import cu.hash.rodascontabilidad.repository.EtapaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EtapaService {
    @Autowired
    private EtapaRepository repository;

    public List<EtapaEntity> findAll(){
        return repository.findAll();
    }

    public Optional<EtapaEntity> findById(Long id){
        return repository.findById(id);
    }

    public EtapaEntity findByNombre(String nombre){
        return repository.findByNombre(nombre);
    }

    public EtapaEntity findByIdAndNombre(Long id, String nombre){
        return repository.findByIdAndNombre(id, nombre);
    }

    public EtapaEntity addEtapa(EtapaEntity etapaEntity){
        return repository.save(etapaEntity);
    }

    public EtapaEntity updateOrDeleteEtapa(EtapaEntity etapaEntity){
        return repository.saveAndFlush(etapaEntity);
    }
}
