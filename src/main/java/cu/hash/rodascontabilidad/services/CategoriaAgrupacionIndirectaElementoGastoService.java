package cu.hash.rodascontabilidad.services;

import cu.hash.rodascontabilidad.dto.CategoriaAgrupacionIndirectaElementoGastoDto;
import cu.hash.rodascontabilidad.models.CategoriaAgrupacionIndirectaElementoGastoEntity;
import cu.hash.rodascontabilidad.repository.CategoriaAgrupacionIndirectaElementoGastoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class CategoriaAgrupacionIndirectaElementoGastoService {
    @Autowired
    private CategoriaAgrupacionIndirectaElementoGastoRepository repository;

    @Autowired
    private ElementoGastoService elementoGastoService;
    @Autowired
    private CategoriaAgrupacionService categoriaAgrupacionIndirectaService;

    public List<CategoriaAgrupacionIndirectaElementoGastoDto> findAll(){
        return repository.findAll()
                .stream()
                .map(this::mapper)
                .collect(Collectors.toList());
    }

    public Optional<CategoriaAgrupacionIndirectaElementoGastoDto> findById(Long id){
        return repository.findById(id).map(this::mapper);
    }

    public void deleteById(long id){
        repository.deleteById(id);
    }
    public CategoriaAgrupacionIndirectaElementoGastoDto addCategoriaAgrupacionIndirectaElementoGasto(CategoriaAgrupacionIndirectaElementoGastoEntity categoriaAgrupacionIndirectaElementoGastoEntity){
        return this.mapper(repository.save(categoriaAgrupacionIndirectaElementoGastoEntity));
    }

    public void deleteByIdCategoriaAndIdElemento(Long idCat, Long idElem){
        Optional<CategoriaAgrupacionIndirectaElementoGastoEntity> categoriaEntity =
                repository.getByIdCategoriaAgrupacionIndirectaAndIdElementoGasto(idCat, idElem);
        if(categoriaEntity.isPresent()) {
            this.deleteById(categoriaEntity.get().getId());
        }
    }

    public CategoriaAgrupacionIndirectaElementoGastoEntity updateOrDeleteCategoriaAgrupacionIndirectaElementoGasto(CategoriaAgrupacionIndirectaElementoGastoEntity categoriaAgrupacionIndirectaElementoGastoEntity){
        return repository.saveAndFlush(categoriaAgrupacionIndirectaElementoGastoEntity);
    }

    private CategoriaAgrupacionIndirectaElementoGastoDto mapper(CategoriaAgrupacionIndirectaElementoGastoEntity entity) {
        return CategoriaAgrupacionIndirectaElementoGastoDto.builder()
                .id(entity.getId())
                .idCategoriaAgrupacionIndirecta(entity.getIdCategoriaAgrupacionIndirecta())
                .idElementoGasto(entity.getIdElementoGasto())
                .categoriaAgrupacionIndirecta(categoriaAgrupacionIndirectaService.findByIdToListResolver(entity.getIdCategoriaAgrupacionIndirecta()).get())
                .elementoGasto(elementoGastoService.findByIdToListResolver(entity.getIdElementoGasto()).get())
                .build();
    }
}
