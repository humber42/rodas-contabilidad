package cu.hash.rodascontabilidad.services;

import cu.hash.rodascontabilidad.models.CategoriaAgrupacionIndirectaElementoGastoEntity;
import cu.hash.rodascontabilidad.repository.CategoriaAgrupacionIndirectaElementoGastoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoriaAgrupacionIndirectaElementoGastoService {
    @Autowired
    private CategoriaAgrupacionIndirectaElementoGastoRepository repository;

    public List<CategoriaAgrupacionIndirectaElementoGastoEntity> findAll(){
        return repository.findAll();
    }

    public Optional<CategoriaAgrupacionIndirectaElementoGastoEntity> findById(Long id){
        return repository.findById(id);
    }

    public CategoriaAgrupacionIndirectaElementoGastoEntity addCategoriaAgrupacionIndirectaElementoGasto(CategoriaAgrupacionIndirectaElementoGastoEntity categoriaAgrupacionIndirectaElementoGastoEntity){
        return repository.save(categoriaAgrupacionIndirectaElementoGastoEntity);
    }

    public CategoriaAgrupacionIndirectaElementoGastoEntity updateOrDeleteCategoriaAgrupacionIndirectaElementoGasto(CategoriaAgrupacionIndirectaElementoGastoEntity categoriaAgrupacionIndirectaElementoGastoEntity){
        return repository.saveAndFlush(categoriaAgrupacionIndirectaElementoGastoEntity);
    }
}
