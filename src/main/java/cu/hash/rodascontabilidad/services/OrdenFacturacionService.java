package cu.hash.rodascontabilidad.services;

import cu.hash.rodascontabilidad.dto.OrdenFacturacionDto;
import cu.hash.rodascontabilidad.models.OrdenFacturacionEntity;
import cu.hash.rodascontabilidad.repository.OrdenFacturacionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class OrdenFacturacionService {
    @Autowired
    private OrdenFacturacionRepository repository;
    @Autowired
    private UnidadMedidaService unidadMedidaService;
    @Autowired
    private OrdenTrabajoService ordenTrabajoService;

    public List<OrdenFacturacionDto> findAll() {
        return repository.findAll()
                .stream()
                .map(this::mapper)
                .collect(Collectors.toList());
    }
    public List<OrdenFacturacionEntity> findAllWithoutMapping(){
        return repository.findAll();
    }
    public void deleteById(long id){
        repository.deleteById(id);
    }

    public Optional<OrdenFacturacionDto> findById(Long id) {
        return repository.findById(id).map(this::mapper);
    }

    public OrdenFacturacionDto findByIdAndCodigo(Long id, String codigo) {
        return this.mapper(repository.findByIdAndCodigo(id, codigo));
    }

    public OrdenFacturacionDto findByCodigo(String codigo) {
        return this.mapper(repository.findByCodigo(codigo));
    }

    public OrdenFacturacionDto addOrdenFacturacion(OrdenFacturacionEntity ordenFacturacionEntity) {
        return this.mapper(repository.save(ordenFacturacionEntity));
    }

    public OrdenFacturacionDto updateOrDeleteOrdenFacturacion(OrdenFacturacionEntity ordenFacturacionEntity) {
        return this.mapper(repository.saveAndFlush(ordenFacturacionEntity));
    }

    private OrdenFacturacionDto mapper(OrdenFacturacionEntity entity) {
        return OrdenFacturacionDto.builder()
                .id(entity.getId())
                .codigo(entity.getCodigo())
                .pS(entity.getProveedorServicio())
                .idUnidadMedida(entity.getIdUnidadMedida())
                .cantidad(entity.getCantidad())
                .precioMn(entity.getPrecioMn())
                .precioMlc(entity.getPrecioMlc())
                .importeMlc(entity.getImporteMlc())
                .importeMn(entity.getImporteMn())
                .descripcion(entity.getDescripcion())
                .idOrdenTrabajo(entity.getIdOrdenTrabajo())
                .unidadMedida(unidadMedidaService.findById(entity.getIdUnidadMedida()).get())
                .ordenTrabajo(ordenTrabajoService.findById(entity.getIdOrdenTrabajo()).get())
                .build();
    }
}
