package cu.hash.rodascontabilidad.services;

import cu.hash.rodascontabilidad.models.CategoriaAgrupacionIndirectaEntity;
import cu.hash.rodascontabilidad.repository.CategoriaAgrupacionIndirectaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoriaAgrupacionIndirectaService {
    @Autowired
    private CategoriaAgrupacionIndirectaRepository repository;

    public List<CategoriaAgrupacionIndirectaEntity> findAll(){
        return repository.findAll();
    }

    public Optional<CategoriaAgrupacionIndirectaEntity> findById(Long id){
        return repository.findById(id);
    }

    public CategoriaAgrupacionIndirectaEntity findByNombre(String nombre){
        return repository.findByNombre(nombre);
    }

    public CategoriaAgrupacionIndirectaEntity findByIdAndNombre(Long id, String nombre){
        return repository.findByIdAndNombre(id, nombre);
    }

    public CategoriaAgrupacionIndirectaEntity addCategoriaAgrupacionIndirecta(CategoriaAgrupacionIndirectaEntity categoriaAgrupacionIndirectaEntity){
        return repository.save(categoriaAgrupacionIndirectaEntity);
    }

    public CategoriaAgrupacionIndirectaEntity updateOrDeleteCategoriaAgrupacionIndirecta(CategoriaAgrupacionIndirectaEntity categoriaAgrupacionIndirectaEntity){
        return repository.saveAndFlush(categoriaAgrupacionIndirectaEntity);
    }
}
