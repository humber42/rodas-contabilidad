package cu.hash.rodascontabilidad.services;

import cu.hash.rodascontabilidad.dto.CategoriaAgrupacionIndirectaDto;
import cu.hash.rodascontabilidad.models.CategoriaAgrupacionIndirectaEntity;
import cu.hash.rodascontabilidad.repository.CategoriaAgrupacionIndirectaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class CategoriaAgrupacionIndirectaService {
    @Autowired
    private CategoriaAgrupacionIndirectaRepository repository;

    public List<CategoriaAgrupacionIndirectaDto> findAll() {
        return repository.findAll()
                .stream()
                .map(this::mapper)
                .collect(Collectors.toList());
    }
    public void deleteById(long id){
        repository.deleteById(id);
    }

    public Optional<CategoriaAgrupacionIndirectaDto> findById(Long id) {
        return repository.findById(id).map(this::mapper);
    }

    public CategoriaAgrupacionIndirectaDto findByNombre(String nombre) {
        return this.mapper(repository.findByNombre(nombre));
    }

    public CategoriaAgrupacionIndirectaDto findByIdAndNombre(Long id, String nombre) {
        return this.mapper(repository.findByIdAndNombre(id, nombre));
    }

    public CategoriaAgrupacionIndirectaDto addCategoriaAgrupacionIndirecta(CategoriaAgrupacionIndirectaEntity categoriaAgrupacionIndirectaEntity) {
        return this.mapper(repository.save(categoriaAgrupacionIndirectaEntity));
    }

    public CategoriaAgrupacionIndirectaDto updateOrDeleteCategoriaAgrupacionIndirecta(CategoriaAgrupacionIndirectaEntity categoriaAgrupacionIndirectaEntity) {
        return this.mapper(repository.saveAndFlush(categoriaAgrupacionIndirectaEntity));
    }

    private CategoriaAgrupacionIndirectaDto mapper(CategoriaAgrupacionIndirectaEntity entity) {
        return CategoriaAgrupacionIndirectaDto.builder()
                .id(entity.getId())
                .nombre(entity.getNombre())
                .descripcion(entity.getDescripcion())
                .orden(entity.getOrden())
                .mostrarFichaCosto(entity.getMostrarFichaCosto())
                .build();
    }
}
