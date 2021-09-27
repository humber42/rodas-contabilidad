package cu.hash.rodascontabilidad.services;

import cu.hash.rodascontabilidad.dto.GastoIndirectoDto;
import cu.hash.rodascontabilidad.models.GastoIndirectoEntity;
import cu.hash.rodascontabilidad.repository.GastoIndirectoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class GastoIndirectoService {
    @Autowired
    private GastoIndirectoRepository repository;
    @Autowired
    private TipoGastoIndirectoService tipoGastoIndirectoService;

    public List<GastoIndirectoDto> findAll() {
        return repository.findAll().stream()
                .map(this::mapper)
                .collect(Collectors.toList());
    }

    public Optional<GastoIndirectoDto> findById(Long id) {
        return repository.findById(id).map(this::mapper);
    }

    public GastoIndirectoDto findByNombre(String nombre) {
        return this.mapper(repository.findByNombre(nombre));
    }

    public GastoIndirectoDto findByCodigoAndNombre(String codigo, String nombre) {
        return this.mapper(repository.findByCodigoAndNombre(codigo, nombre));
    }

    public GastoIndirectoDto findByIdAndCodigo(Long id, String codigo) {
        return this.mapper(repository.findByIdAndCodigo(id, codigo));
    }

    public GastoIndirectoDto addGI(GastoIndirectoEntity gastoIndirectoEntity) {
        return this.mapper(repository.save(gastoIndirectoEntity));
    }

    public GastoIndirectoDto updateOrDeleteGI(GastoIndirectoEntity gastoIndirectoEntity) {
        return this.mapper(repository.saveAndFlush(gastoIndirectoEntity));
    }

    private GastoIndirectoDto mapper(GastoIndirectoEntity entity) {
        return GastoIndirectoDto.builder()
                .id(entity.getId())
                .codigo(entity.getCodigo())
                .nombre(entity.getNombre())
                .descripcion(entity.getDescripcion())
                .idTipoGastoIndirecto(entity.getIdTipoGastoIndirecto())
                .tipoGastoIndirecto(tipoGastoIndirectoService.findById(entity.getIdTipoGastoIndirecto()).get())
                .build();
    }
}
