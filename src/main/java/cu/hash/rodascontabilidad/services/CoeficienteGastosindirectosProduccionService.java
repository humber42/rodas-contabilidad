package cu.hash.rodascontabilidad.services;

import cu.hash.rodascontabilidad.models.CoeficienteGastosIndirectosProduccionEntity;
import cu.hash.rodascontabilidad.repository.CoeficienteGastosIndirectosProduccionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CoeficienteGastosindirectosProduccionService {
    @Autowired
    private CoeficienteGastosIndirectosProduccionRepository repository;

    public List<CoeficienteGastosIndirectosProduccionEntity> findAll(){
        return repository.findAll();
    }

    public Optional<CoeficienteGastosIndirectosProduccionEntity> findById(Long id){
        return repository.findById(id);
    }

    public CoeficienteGastosIndirectosProduccionEntity addCoeficienteGIP(CoeficienteGastosIndirectosProduccionEntity coeficienteGastosIndirectosProduccionEntity){
        return repository.save(coeficienteGastosIndirectosProduccionEntity);
    }

    public CoeficienteGastosIndirectosProduccionEntity updateOrDeleteCoeficienteGIP(CoeficienteGastosIndirectosProduccionEntity coeficienteGastosIndirectosProduccionEntity){
        return repository.saveAndFlush(coeficienteGastosIndirectosProduccionEntity);
    }
}
