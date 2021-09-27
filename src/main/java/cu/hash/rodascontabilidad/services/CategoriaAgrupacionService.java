package cu.hash.rodascontabilidad.services;

import cu.hash.rodascontabilidad.dto.CategoriaAgrupacionDto;
import cu.hash.rodascontabilidad.models.CategoriaAgrupacionEntity;
import cu.hash.rodascontabilidad.repository.CategoriaAgrupacionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class CategoriaAgrupacionService {
    @Autowired
    private CategoriaAgrupacionRepository repository;

    public List<CategoriaAgrupacionDto> findAll() {
        return repository.findAll()
                .stream()
                .map(this::mapper)
                .collect(Collectors.toList());
    }

    public Optional<CategoriaAgrupacionDto> findById(Long id) {
        return repository.findById(id).map(this::mapper);
    }

    public CategoriaAgrupacionDto findByNombre(String nombre) {
        return this.mapper(repository.findByNombre(nombre));
    }

    public CategoriaAgrupacionDto findByIdAndNombre(Long id, String nombre) {
        return this.mapper(repository.findByIdAndNombre(id, nombre));
    }

    public CategoriaAgrupacionDto addCategoriaAgrupacion(CategoriaAgrupacionEntity categoriaAgrupacionEntity) {
        return this.mapper(repository.save(categoriaAgrupacionEntity));
    }

    public CategoriaAgrupacionDto updateOrDeleteCategoriaAgrupacion(CategoriaAgrupacionEntity categoriaAgrupacionEntity) {
        return this.mapper(repository.saveAndFlush(categoriaAgrupacionEntity));
    }

    private CategoriaAgrupacionDto mapper(CategoriaAgrupacionEntity entity) {
        return CategoriaAgrupacionDto.builder()
                .id(entity.getId())
                .nombre(entity.getNombre())
                .descripcion(entity.getDescripcion())
                .orden(entity.getOrden())
                .mostrarFichaCosto(entity.getMostrarFichaCosto())
                .build();
    }
}
