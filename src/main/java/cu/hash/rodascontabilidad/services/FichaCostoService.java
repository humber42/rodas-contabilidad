package cu.hash.rodascontabilidad.services;

import cu.hash.rodascontabilidad.models.FichaCostoEntity;
import cu.hash.rodascontabilidad.repository.FichaCostoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FichaCostoService {
    @Autowired
    private FichaCostoRepository repository;

    public List<FichaCostoEntity> findAll(){
        return repository.findAll();
    }

    public Optional<FichaCostoEntity> findById(Long id){
        return repository.findById(id);
    }

    public List<FichaCostoEntity> findAllByIdActividad(Long idActividad){
        return repository.findAllByIdActividad(idActividad);
    }
    public FichaCostoEntity findByIdAndIdActividad(Long id, Long idActividad){
        return repository.findByIdAndIdActividad(id, idActividad);
    }

    public FichaCostoEntity addFichaCosto(FichaCostoEntity fichaCostoEntity){
        return repository.save(fichaCostoEntity);
    }

    public FichaCostoEntity updateOrDeleteFichaCosto(FichaCostoEntity fichaCostoEntity){
        return repository.saveAndFlush(fichaCostoEntity);
    }
}
