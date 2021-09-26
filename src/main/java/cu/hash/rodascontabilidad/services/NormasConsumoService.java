package cu.hash.rodascontabilidad.services;

import cu.hash.rodascontabilidad.models.NormasConsumoEntity;
import cu.hash.rodascontabilidad.repository.NormasConsumoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NormasConsumoService {
    @Autowired
    private NormasConsumoRepository repository;

    public List<NormasConsumoEntity> findAll(){
        return repository.findAll();
    }

    public Optional<NormasConsumoEntity> findById(Long id){
        return repository.findById(id);
    }

    public NormasConsumoEntity addNormaConsumo(NormasConsumoEntity normasConsumoEntity){
        return repository.save(normasConsumoEntity);
    }

    public NormasConsumoEntity updateOrDeleteNormaConsumo(NormasConsumoEntity normasConsumoEntity){
        return repository.saveAndFlush(normasConsumoEntity);
    }
}
