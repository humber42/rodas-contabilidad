package cu.hash.rodascontabilidad.services;

import cu.hash.rodascontabilidad.models.NormaConsumoFichaCostoEntity;
import cu.hash.rodascontabilidad.repository.NormaConsumoFichaCostoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NormaConsumoFichaCostoService {
    @Autowired
    private NormaConsumoFichaCostoRepository repository;

    public List<NormaConsumoFichaCostoEntity> findAll(){
        return repository.findAll();
    }

    public Optional<NormaConsumoFichaCostoEntity> findById(Long id){
        return repository.findById(id);
    }

    public NormaConsumoFichaCostoEntity addNormaConsumoFichaCosto(NormaConsumoFichaCostoEntity normaConsumoFichaCostoEntity){
        return repository.save(normaConsumoFichaCostoEntity);
    }

    public NormaConsumoFichaCostoEntity updateOrDeleteNormaConsumoFichaCosto(NormaConsumoFichaCostoEntity normaConsumoFichaCostoEntity){
        return repository.saveAndFlush(normaConsumoFichaCostoEntity);
    }
}
