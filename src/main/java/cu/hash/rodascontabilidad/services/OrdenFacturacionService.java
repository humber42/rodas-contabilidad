package cu.hash.rodascontabilidad.services;

import cu.hash.rodascontabilidad.models.OrdenFacturacionEntity;
import cu.hash.rodascontabilidad.repository.OrdenFacturacionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrdenFacturacionService {
    @Autowired
    private OrdenFacturacionRepository repository;

    public List<OrdenFacturacionEntity> findAll(){
        return repository.findAll();
    }

    public Optional<OrdenFacturacionEntity> findById(Long id){
        return repository.findById(id);
    }

    public OrdenFacturacionEntity findByIdAndCodigo(Long id, String codigo){
        return repository.findByIdAndCodigo(id, codigo);
    }

    public OrdenFacturacionEntity findByCodigo(String codigo){
        return repository.findByCodigo(codigo);
    }

    public OrdenFacturacionEntity addOrdenFacturacion(OrdenFacturacionEntity ordenFacturacionEntity){
        return repository.save(ordenFacturacionEntity);
    }

    public OrdenFacturacionEntity updateOrDeleteOrdenFacturacion(OrdenFacturacionEntity ordenFacturacionEntity){
        return repository.saveAndFlush(ordenFacturacionEntity);
    }
}
