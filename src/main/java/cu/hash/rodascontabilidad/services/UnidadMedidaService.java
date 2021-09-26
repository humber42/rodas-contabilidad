package cu.hash.rodascontabilidad.services;

import cu.hash.rodascontabilidad.models.UnidadMedidaEntity;
import cu.hash.rodascontabilidad.repository.UnidadMedidaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UnidadMedidaService {
    @Autowired
    private UnidadMedidaRepository repository;

    public List<UnidadMedidaEntity> findAll(){
        return repository.findAll();
    }

    public Optional<UnidadMedidaEntity> findById(Long id){
        return repository.findById(id);
    }

    public UnidadMedidaEntity findByIdAndNombre(Long id, String nombre){
        return repository.findByIdAndNombre(id, nombre);
    }

    public UnidadMedidaEntity findByCodigoUnidadMedida(String codigo){
        return repository.findByCodigoUnidadMedida(codigo);
    }

    public UnidadMedidaEntity addUM(UnidadMedidaEntity unidadMedidaEntity){
        return repository.save(unidadMedidaEntity);
    }

    public UnidadMedidaEntity updateOrDeleteUM(UnidadMedidaEntity unidadMedidaEntity){
        return repository.saveAndFlush(unidadMedidaEntity);
    }
}
