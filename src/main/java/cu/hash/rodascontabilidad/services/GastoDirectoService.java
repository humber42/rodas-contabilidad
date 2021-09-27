package cu.hash.rodascontabilidad.services;

import cu.hash.rodascontabilidad.dto.GastoDirectoDto;
import cu.hash.rodascontabilidad.models.GastoDirectoEntity;
import cu.hash.rodascontabilidad.repository.GastoDirectoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class GastoDirectoService {
    @Autowired
    private GastoDirectoRepository repository;
    @Autowired
    private TipoGastoDirectoService tipoGastoDirectoService;
    @Autowired
    private UnidadMedidaService unidadMedidaService;
    @Autowired
    private ElementoGastoService elementoGastoService;
    @Autowired
    private SubelementoGastoService subelementoGastoService;

    public List<GastoDirectoDto> findAll() {
        return repository.findAll().stream().map(this::mapper).collect(Collectors.toList());
    }
    public void deleteById(long id){
        repository.deleteById(id);
    }

    public Optional<GastoDirectoDto> findById(Long id) {
        return repository.findById(id).map(this::mapper);
    }

    public GastoDirectoDto findByNombre(String nombre) {
        return this.mapper(repository.findByNombre(nombre));
    }

    public GastoDirectoDto findByCodigoAndNombre(String codigo, String nombre) {
        return this.mapper(repository.findByCodigoAndNombre(codigo, nombre));
    }

    public GastoDirectoDto findByIdAndCodigo(Long id, String codigo) {
        return this.mapper(repository.findByIdAndCodigo(id, codigo));
    }

    public GastoDirectoDto addGD(GastoDirectoEntity gastoDirectoEntity) {
        return this.mapper(repository.save(gastoDirectoEntity));
    }

    public GastoDirectoDto updateOrDeleteGD(GastoDirectoEntity gastoDirectoEntity) {
        return this.mapper(repository.saveAndFlush(gastoDirectoEntity));
    }

    private GastoDirectoDto mapper(GastoDirectoEntity entity) {
        return GastoDirectoDto.builder()
                .id(entity.getId())
                .codigo(entity.getCodigo())
                .nombre(entity.getNombre())
                .descripcion(entity.getDescripcion())
                .idTipoGastoDirecto(entity.getIdTipoGastoDirecto())
                .precioMn(entity.getPrecioMn())
                .precioCl(entity.getPrecioCl())
                .idUnidadMedida(entity.getIdUnidadMedida())
                .idElementoGasto(entity.getIdElementoGasto())
                .idSubelemento(entity.getIdSubelemento())
                .tipoGastoDirecto(tipoGastoDirectoService.findById(entity.getIdTipoGastoDirecto()).get())
                .unidadMedida(unidadMedidaService.findById(entity.getIdUnidadMedida()).get())
                .elementoGasto(elementoGastoService.findById(entity.getIdElementoGasto()).get())
                .subelementoGasto(subelementoGastoService.findById(entity.getIdSubelemento()).get())
                .build();
    }
}
