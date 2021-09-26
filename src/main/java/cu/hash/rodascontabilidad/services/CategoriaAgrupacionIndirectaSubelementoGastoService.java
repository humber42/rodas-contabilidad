package cu.hash.rodascontabilidad.services;

import cu.hash.rodascontabilidad.models.CategoriaAgrupacionIndirectaSubelementoGastoEntity;
import cu.hash.rodascontabilidad.repository.CategoriaAgrupacionIndirectaSubelementoGastoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoriaAgrupacionIndirectaSubelementoGastoService {
    @Autowired
    private CategoriaAgrupacionIndirectaSubelementoGastoRepository repository;

    public List<CategoriaAgrupacionIndirectaSubelementoGastoEntity> findAll(){
        return repository.findAll();
    }

    public Optional<CategoriaAgrupacionIndirectaSubelementoGastoEntity> findById(Long id){
        return repository.findById(id);
    }

    public CategoriaAgrupacionIndirectaSubelementoGastoEntity addCategoriaAgrupacionIndirectaSubelementoGastoEntity(CategoriaAgrupacionIndirectaSubelementoGastoEntity categoriaAgrupacionIndirectaSubelementoGastoEntity){
        return repository.save(categoriaAgrupacionIndirectaSubelementoGastoEntity);
    }

    public CategoriaAgrupacionIndirectaSubelementoGastoEntity updateOrDeleteCategoriaAgrupacionIndirectaSubelementoGastoEntity(CategoriaAgrupacionIndirectaSubelementoGastoEntity categoriaAgrupacionIndirectaSubelementoGastoEntity){
        return repository.saveAndFlush(categoriaAgrupacionIndirectaSubelementoGastoEntity);
    }
}
