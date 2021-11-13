package cu.hash.rodascontabilidad.services;

import cu.hash.rodascontabilidad.dto.OrdenTrabajoDto;
import cu.hash.rodascontabilidad.models.OrdenTrabajoEntity;
import cu.hash.rodascontabilidad.repository.OrdenTrabajoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class OrdenTrabajoService {
    @Autowired
    private OrdenTrabajoRepository repository;
    @Autowired
    private ActividadService actividadService;
    @Autowired
    private ClienteService clienteService;
    @Autowired
    private UebService uebService;
    @Autowired
    private CargoService cargoService;
    @Autowired
    private FichaCostoService fichaCostoService;
    @Autowired
    private ListResolvers listResolvers;

    public List<OrdenTrabajoDto> findAll() {
        return repository.findAll().stream().map(this::mapper).collect(Collectors.toList());
    }

    public List<OrdenTrabajoEntity> findAllWithoutMapping(){
        return repository.findAll();
    }
    public void deleteById(long id){
        repository.deleteById(id);
    }

    public Optional<OrdenTrabajoDto> findById(Long id) {
        return repository.findById(id).map(this::mapper);
    }

    public OrdenTrabajoDto addOrdenTrabajo(OrdenTrabajoEntity ordenTrabajoEntity) {
        return this.mapper(repository.save(ordenTrabajoEntity));
    }

    public OrdenTrabajoDto updateOrDeleteOrdenTrabajo(OrdenTrabajoEntity ordenTrabajoEntity) {
        return this.mapper(repository.saveAndFlush(ordenTrabajoEntity));
    }

    public void closeOrOpenOrdenTrabajo(long id) {
        repository.findById(id)
                .ifPresent(p -> {
                            p.setCerrada(!p.getCerrada());
                            this.updateOrDeleteOrdenTrabajo(p);
                        }
                );
    }

    private OrdenTrabajoDto mapper(OrdenTrabajoEntity entity) {
        return OrdenTrabajoDto.builder()
                .id(entity.getId())
                .idActividad(entity.getIdActividad())
                .idCliente(entity.getIdCliente())
                .numeroContrato(entity.getNumeroContrato())
                .vendedor(entity.getVendedor())
                .observaciones(entity.getObservaciones())
                .ordenTrabajo(entity.getOrdenTrabajo())
                .fechaEntrega(entity.getFechaEntrega())
                .fechaConfeccion(entity.getFechaConfeccion())
                .idUeb(entity.getIdUeb())
                .nombreAprobacion(entity.getNombreAprobacion())
                .descripcionServicio(entity.getDescripcionServicio())
                .motivoServicio(entity.getMotivoServicio())
                .nombreConformidad(entity.getNombreConformidad())
                .idCargo(entity.getIdCargo())
                .identidadUsuario(entity.getIdentidadUsuario())
                .cerrada(entity.getCerrada())
                .idFichaCosto(entity.getIdFichaCosto())
                .actividad(actividadService.findById(entity.getIdActividad()).get())
                .cliente(clienteService.findById(entity.getIdCliente()).get())
                .ueb(uebService.findById(entity.getIdUeb()).get())
                .cargo(cargoService.findById(entity.getIdCargo()).get())
                .fichaCostoDto(fichaCostoService.findById(entity.getIdFichaCosto()).get())
                .materialList(listResolvers.getMaterialesByOrdenTrabajo(entity.getId()))
                .ordenFacturacionList(listResolvers.getOrdenFacturacionByOrdenTrabajo(entity.getId()))
                .build();
    }
}
