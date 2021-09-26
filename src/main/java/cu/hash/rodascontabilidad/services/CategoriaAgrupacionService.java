package cu.hash.rodascontabilidad.services;

import cu.hash.rodascontabilidad.models.CategoriaAgrupacionEntity;
import cu.hash.rodascontabilidad.repository.CategoriaAgrupacionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoriaAgrupacionService {
    @Autowired
    private CategoriaAgrupacionRepository repository;

    public List<CategoriaAgrupacionEntity> findAll(){
        return repository.findAll();
    }

    public Optional<CategoriaAgrupacionEntity> findById(Long id){
        return repository.findById(id);
    }

    public CategoriaAgrupacionEntity findByNombre(String nombre){
        return repository.findByNombre(nombre);
    }

    public CategoriaAgrupacionEntity findByIdAndNombre(Long id, String nombre){
        return repository.findByIdAndNombre(id, nombre);
    }

    public CategoriaAgrupacionEntity addCategoriaAgrupacion(CategoriaAgrupacionEntity categoriaAgrupacionEntity){
        return repository.save(categoriaAgrupacionEntity);
    }

    public CategoriaAgrupacionEntity updateOrDeleteCategoriaAgrupacion(CategoriaAgrupacionEntity categoriaAgrupacionEntity){
        return repository.saveAndFlush(categoriaAgrupacionEntity);
    }
}
