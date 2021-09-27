package cu.hash.rodascontabilidad.services;

import cu.hash.rodascontabilidad.dto.TipoGastoIndirectoDto;
import cu.hash.rodascontabilidad.models.TipoGastoIndirectoEntity;
import cu.hash.rodascontabilidad.repository.TipoGastoIndirectoRepositrory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class TipoGastoIndirectoService {
    @Autowired
    private TipoGastoIndirectoRepositrory repository;

    public List<TipoGastoIndirectoDto> findAll() {
        return repository.findAll()
                .stream()
                .map(this::mapper)
                .collect(Collectors.toList());
    }

    public Optional<TipoGastoIndirectoDto> findById(Long id) {
        return repository.findById(id).map(this::mapper);
    }

    public TipoGastoIndirectoDto addTipoGI(TipoGastoIndirectoEntity tipoGastoIndirectoEntity) {
        return this.mapper(repository.save(tipoGastoIndirectoEntity));
    }

    public TipoGastoIndirectoDto updateOrDeleteTipoGI(TipoGastoIndirectoEntity tipoGastoIndirectoEntity) {
        return this.mapper(repository.saveAndFlush(tipoGastoIndirectoEntity));
    }

    private TipoGastoIndirectoDto mapper(TipoGastoIndirectoEntity entity) {
        return TipoGastoIndirectoDto.builder()
                .id(entity.getId())
                .nombre(entity.getNombre())
                .descripcion(entity.getDescripcion())
                .build();
    }
}
