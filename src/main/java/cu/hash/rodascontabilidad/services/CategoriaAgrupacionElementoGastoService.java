package cu.hash.rodascontabilidad.services;

import cu.hash.rodascontabilidad.dto.CategoriaAgrupacionElementoGastoDto;
import cu.hash.rodascontabilidad.models.CategoriaAgrupacionElementoGastoEntity;
import cu.hash.rodascontabilidad.repository.CategoriaAgrupacionElementoGastoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class CategoriaAgrupacionElementoGastoService {
    @Autowired
    private CategoriaAgrupacionElementoGastoRepository repository;
    @Autowired
    private ElementoGastoService elementoGastoService;
    @Autowired
    private CategoriaAgrupacionService categoriaAgrupacionService;

    public List<CategoriaAgrupacionElementoGastoDto> findAll() {
        return repository.findAll()
                .stream()
                .map(this::mapper)
                .collect(Collectors.toList());

    }
    public void deleteById(long id){
        repository.deleteById(id);
    }

    public void deleteByIdCategoriaAndIdElemento(Long idCat, Long idElem){
        Optional<CategoriaAgrupacionElementoGastoEntity> categoriaEntity=
                repository.getByIdCategoriaAgrupacionAndIdElementoGasto(idCat, idElem);
        if(categoriaEntity.isPresent()) {
            this.deleteById(categoriaEntity.get().getId());
        }
    }

    public Optional<CategoriaAgrupacionElementoGastoDto> findById(Long id) {
        return repository.findById(id).map(this::mapper);
    }

    public CategoriaAgrupacionElementoGastoDto addCategoriaAgrupacionElementoGasto(CategoriaAgrupacionElementoGastoEntity categoriaAgrupacionElementoGastoEntity) {
        return this.mapper(repository.save(categoriaAgrupacionElementoGastoEntity));
    }

    public CategoriaAgrupacionElementoGastoDto updateOrDeleteCategoriaAgrupacionElementoGasto(CategoriaAgrupacionElementoGastoEntity categoriaAgrupacionElementoGastoEntity) {
        return this.mapper(repository.saveAndFlush(categoriaAgrupacionElementoGastoEntity));
    }

    private CategoriaAgrupacionElementoGastoDto mapper(CategoriaAgrupacionElementoGastoEntity entity) {
        return CategoriaAgrupacionElementoGastoDto.builder()
                .id(entity.getId())
                .idCategoriaAgrupacion(entity.getIdCategoriaAgrupacion())
                .idElementoGasto(entity.getIdElementoGasto())
                .categoriaAgrupacion(categoriaAgrupacionService.findByIdToListResolver(entity.getIdCategoriaAgrupacion()).get())
                .elementoGasto(elementoGastoService.findByIdToListResolver(entity.getIdElementoGasto()).get())
                .build();
    }
}
