package cu.hash.rodascontabilidad.services;

import cu.hash.rodascontabilidad.models.CoeficienteEntity;
import cu.hash.rodascontabilidad.repository.CoeficienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.List;
import java.util.Optional;

@Service
public class CoeficienteService {
    @Autowired
    private CoeficienteRepository repository;

    public List<CoeficienteEntity> findAll(){
        return repository.findAll();
    }

    public Optional<CoeficienteEntity> findById(Long id){
        return repository.findById(id);
    }

    public List<CoeficienteEntity> findAllByFecha(Date date){
        return repository.findAllByFecha(date);
    }

    public CoeficienteEntity findByFecha(Date date){
        return repository.findByFecha(date);
    }

    public CoeficienteEntity addCoeficienteGIP(CoeficienteEntity coeficienteEntity){
        return repository.save(coeficienteEntity);
    }

    public CoeficienteEntity updateOrDeleteCoeficienteGIP(CoeficienteEntity coeficienteEntity){
        return repository.saveAndFlush(coeficienteEntity);
    }
}
