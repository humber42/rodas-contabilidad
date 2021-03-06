package cu.hash.rodascontabilidad.services;

import cu.hash.rodascontabilidad.dto.CategoriaAgrupacionIndirectaSubelementoGastoDto;
import cu.hash.rodascontabilidad.models.CategoriaAgrupacionIndirectaSubelementoGastoEntity;
import cu.hash.rodascontabilidad.repository.CategoriaAgrupacionIndirectaSubelementoGastoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class CategoriaAgrupacionIndirectaSubelementoGastoService {
    @Autowired
    private CategoriaAgrupacionIndirectaSubelementoGastoRepository repository;

    @Autowired
    private CategoriaAgrupacionService categoriaAgrupacionIndirectaService;
    @Autowired
    private SubelementoGastoService subelementoGastoService;

    public List<CategoriaAgrupacionIndirectaSubelementoGastoDto> findAll() {
        return repository.findAll()
                .stream()
                .map(this::mapper)
                .collect(Collectors.toList());
    }

    public Optional<CategoriaAgrupacionIndirectaSubelementoGastoDto> findById(Long id) {
        return repository.findById(id).map(this::mapper);
    }
    public void deleteById(long id){
        repository.deleteById(id);
    }

    public void deleteByIdCategoriaAndIdSubelemento(Long idCat, Long idSubelem){
        Optional<CategoriaAgrupacionIndirectaSubelementoGastoEntity> categoriaEntity=
                repository.getByIdCategoriaAgrupacionIndirectaAndIdSubelementoGasto(idCat, idSubelem);
        if(categoriaEntity.isPresent()) {
            this.deleteById(categoriaEntity.get().getId());
        }
    }

    public CategoriaAgrupacionIndirectaSubelementoGastoDto addCategoriaAgrupacionIndirectaSubelementoGastoEntity(CategoriaAgrupacionIndirectaSubelementoGastoEntity categoriaAgrupacionIndirectaSubelementoGastoEntity) {
        return this.mapper(repository.save(categoriaAgrupacionIndirectaSubelementoGastoEntity));
    }

    public CategoriaAgrupacionIndirectaSubelementoGastoDto updateOrDeleteCategoriaAgrupacionIndirectaSubelementoGastoEntity(CategoriaAgrupacionIndirectaSubelementoGastoEntity categoriaAgrupacionIndirectaSubelementoGastoEntity) {
        return this.mapper(repository.saveAndFlush(categoriaAgrupacionIndirectaSubelementoGastoEntity));
    }

    private CategoriaAgrupacionIndirectaSubelementoGastoDto mapper(CategoriaAgrupacionIndirectaSubelementoGastoEntity entity) {
        return CategoriaAgrupacionIndirectaSubelementoGastoDto.builder()
                .id(entity.getId())
                .idCategoriaAgrupacionIndirecta(entity.getIdCategoriaAgrupacionIndirecta())
                .idSubelementoGasto(entity.getIdSubelementoGasto())
                .orden(entity.getOrden())
                .categoriaAgrupacionIndirecta(categoriaAgrupacionIndirectaService.findByIdToListResolver(entity.getIdCategoriaAgrupacionIndirecta()).get())
                .subelementoGasto(subelementoGastoService.findByIdToListResolver(entity.getIdSubelementoGasto()).get())
                .build();
    }
}
