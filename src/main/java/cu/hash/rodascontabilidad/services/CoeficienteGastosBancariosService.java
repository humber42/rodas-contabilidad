package cu.hash.rodascontabilidad.services;

import cu.hash.rodascontabilidad.models.CoeficienteGastosBancariosEntity;
import cu.hash.rodascontabilidad.repository.CoeficienteGastosBancariosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CoeficienteGastosBancariosService {
    @Autowired
    private CoeficienteGastosBancariosRepository repository;

    public List<CoeficienteGastosBancariosEntity> findAll(){
        return repository.findAll();
    }

    public Optional<CoeficienteGastosBancariosEntity> findById(Long id){
        return repository.findById(id);
    }

    public CoeficienteGastosBancariosEntity addCoeficienteGB(CoeficienteGastosBancariosEntity coeficienteGastosBancariosEntity){
        return repository.save(coeficienteGastosBancariosEntity);
    }

    public CoeficienteGastosBancariosEntity updateOrDeleteCoeficienteGB(CoeficienteGastosBancariosEntity coeficienteGastosBancariosEntity){
        return repository.saveAndFlush(coeficienteGastosBancariosEntity);
    }
}
