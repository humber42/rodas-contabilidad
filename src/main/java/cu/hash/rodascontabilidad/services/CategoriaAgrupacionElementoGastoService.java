package cu.hash.rodascontabilidad.services;

import cu.hash.rodascontabilidad.models.CategoriaAgrupacionElementoGastoEntity;
import cu.hash.rodascontabilidad.repository.CategoriaAgrupacionElementoGastoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoriaAgrupacionElementoGastoService {
    @Autowired
    private CategoriaAgrupacionElementoGastoRepository repository;

    public List<CategoriaAgrupacionElementoGastoEntity> findAll(){
        return repository.findAll();
    }

    public Optional<CategoriaAgrupacionElementoGastoEntity> findById(Long id){
        return repository.findById(id);
    }

    public CategoriaAgrupacionElementoGastoEntity addCategoriaAgrupacionElementoGasto(CategoriaAgrupacionElementoGastoEntity categoriaAgrupacionElementoGastoEntity){
        return repository.save(categoriaAgrupacionElementoGastoEntity);
    }

    public CategoriaAgrupacionElementoGastoEntity updateOrDeleteCategoriaAgrupacionElementoGasto(CategoriaAgrupacionElementoGastoEntity categoriaAgrupacionElementoGastoEntity){
        return repository.saveAndFlush(categoriaAgrupacionElementoGastoEntity);
    }
}
