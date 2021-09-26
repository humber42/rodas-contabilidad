package cu.hash.rodascontabilidad.services;

import cu.hash.rodascontabilidad.models.CoeficienteGastosDistribucionVentasEntity;
import cu.hash.rodascontabilidad.repository.CoeficienteGastosDistribucionVentasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CoeficienteGastosDistribucionVentasService {
    @Autowired
    private CoeficienteGastosDistribucionVentasRepository repository;

    public List<CoeficienteGastosDistribucionVentasEntity> findAll(){
        return repository.findAll();
    }

    public Optional<CoeficienteGastosDistribucionVentasEntity> findById(Long id){
        return repository.findById(id);
    }

    public CoeficienteGastosDistribucionVentasEntity addCoeficienteGDV(CoeficienteGastosDistribucionVentasEntity coeficienteGastosDistribucionVentasEntity){
        return repository.save(coeficienteGastosDistribucionVentasEntity);
    }

    public CoeficienteGastosDistribucionVentasEntity updateOrDeleteCoeficienteGDV(CoeficienteGastosDistribucionVentasEntity coeficienteGastosDistribucionVentasEntity){
        return repository.saveAndFlush(coeficienteGastosDistribucionVentasEntity);
    }
}
