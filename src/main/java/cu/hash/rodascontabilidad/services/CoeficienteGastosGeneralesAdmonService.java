package cu.hash.rodascontabilidad.services;

import cu.hash.rodascontabilidad.models.CoeficienteGastosGeneralesAdmonEntity;
import cu.hash.rodascontabilidad.repository.CoeficienteGastosGeneralesAdmonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CoeficienteGastosGeneralesAdmonService {
    @Autowired
    private CoeficienteGastosGeneralesAdmonRepository repository;

    public List<CoeficienteGastosGeneralesAdmonEntity> findAll(){
        return repository.findAll();
    }

    public Optional<CoeficienteGastosGeneralesAdmonEntity> findById(Long id){
        return repository.findById(id);
    }

    public CoeficienteGastosGeneralesAdmonEntity addCoeficienteGGA(CoeficienteGastosGeneralesAdmonEntity coeficienteGastosGeneralesAdmonEntity){
        return repository.save(coeficienteGastosGeneralesAdmonEntity);
    }

    public CoeficienteGastosGeneralesAdmonEntity updateOrDeleteCoeficienteGGA(CoeficienteGastosGeneralesAdmonEntity coeficienteGastosGeneralesAdmonEntity){
        return repository.saveAndFlush(coeficienteGastosGeneralesAdmonEntity);
    }
}
