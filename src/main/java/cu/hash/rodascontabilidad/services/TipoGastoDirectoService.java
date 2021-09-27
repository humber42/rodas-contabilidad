package cu.hash.rodascontabilidad.services;

import cu.hash.rodascontabilidad.dto.TipoGastoDirectoDto;
import cu.hash.rodascontabilidad.models.TipoGastoDirectoEntity;
import cu.hash.rodascontabilidad.repository.TipoGastoDirectoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class TipoGastoDirectoService {
    @Autowired
    private TipoGastoDirectoRepository repository;

    public List<TipoGastoDirectoDto> findAll() {
        return repository.findAll()
                .stream().map(this::mapper).collect(Collectors.toList());
    }
    public void deleteById(long id){
        repository.deleteById(id);
    }

    public Optional<TipoGastoDirectoDto> findById(Long id) {
        return repository.findById(id).map(this::mapper);
    }

    public TipoGastoDirectoDto addTipoGD(TipoGastoDirectoEntity tipoGastoDirectoEntity) {
        return this.mapper(repository.save(tipoGastoDirectoEntity));
    }

    public TipoGastoDirectoDto updateOrDeleteTipoGD(TipoGastoDirectoEntity tipoGastoDirectoEntity) {
        return this.mapper(repository.saveAndFlush(tipoGastoDirectoEntity));
    }

    private TipoGastoDirectoDto mapper(TipoGastoDirectoEntity entity) {
        return TipoGastoDirectoDto.builder()
                .id(entity.getId())
                .nombre(entity.getNombre())
                .descripcion(entity.getDescripcion())
                .build();
    }
}
