package cu.hash.rodascontabilidad.services;

import cu.hash.rodascontabilidad.dto.NormaConsumoFichaCostoDto;
import cu.hash.rodascontabilidad.dto.UebActividadesPlanProduccionDto;
import cu.hash.rodascontabilidad.dto.UebEtapaDto;
import cu.hash.rodascontabilidad.dto.classesWhithoutCollections.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ListResolvers {

    //Services
    @Autowired
    private UebActividadesPlanProduccionService uebActividadesPlanProduccionService;
    @Autowired
    private OrdenTrabajoService ordenTrabajoService;
    @Autowired
    private NormasConsumoService normasConsumoService;
    @Autowired
    private PlanProduccionService planProduccionService;
    @Autowired
    private TrabajadorService trabajadorService;
    @Autowired
    private UebEtapaService uebEtapaService;
    @Autowired
    private MaterialService materialService;
    @Autowired
    private OrdenFacturacionService ordenFacturacionService;
    @Autowired
    private NormaConsumoFichaCostoService normaConsumoFichaCostoService;
    @Autowired
    private PersonasAutorizadasService personasAutorizadasService;
    @Autowired
    private ReporteDiarioLaboralService reporteDiarioLaboralService;
    @Autowired
    private SubelementoGastoService subelementoGastoService;

    @Autowired
    private UnidadMedidaService medidaService;

    //Actividades

    /**
     * Obtener lista plan de produccion dado un Id de actividad
     *
     * @param id Identifier activity
     * @return List<Plan       produccion>
     */
    public List<PlanProduccionWithoutList> getPlanProduccionActividad(long id) {
        return uebActividadesPlanProduccionService.findAll()
                .stream()
                .filter(p -> p.getIdActividad() == id)
                .map(UebActividadesPlanProduccionDto::getPlanProduccion)
                .map(p-> {
                    return PlanProduccionWithoutList.builder()
                            .id(p.getId()).idUeb(p.getIdUeb()).build();
                })
                .collect(Collectors.toList());
    }

    public List<OrdenTrabajoWhithoutList> getOrdenTrabajoActividad(long id) {
        return ordenTrabajoService.findAllWithoutMapping()
                .stream()
                .filter(p -> p.getIdActividad() == id)
                .map(p->{
                    return OrdenTrabajoWhithoutList.builder()
                            .id(p.getId())
                            .idActividad(p.getIdActividad())
                            .idCliente(p.getIdCliente())
                            .numeroContrato(p.getNumeroContrato())
                            .vendedor(p.getVendedor())
                            .observaciones(p.getObservaciones())
                            .ordenTrabajo(p.getOrdenTrabajo())
                            .fechaEntrega(p.getFechaEntrega())
                            .fechaConfeccion(p.getFechaConfeccion())
                            .idUeb(p.getIdUeb())
                            .nombreAprobacion(p.getNombreAprobacion())
                            .descripcionServicio(p.getDescripcionServicio())
                            .motivoServicio(p.getMotivoServicio())
                            .nombreConformidad(p.getNombreConformidad())
                            .idCargo(p.getIdCargo())
                            .identidadUsuario(p.getIdentidadUsuario())
                            .cerrada(p.getCerrada())
                            .idFichaCosto(p.getIdFichaCosto()).build();
                })
                .collect(Collectors.toList());
    }

    //Plan produccion
    public List<ActividadWithoutList> getActividadesByPlanProduccion(long id) {
        return uebActividadesPlanProduccionService.findAll()
                .stream()
                .filter(p -> p.getIdPlanProduccion() == id)
                .map(UebActividadesPlanProduccionDto::getActividad)
                .map(entity->{
                    return ActividadWithoutList.builder()
                            .id(entity.getId())
                            .codigo(entity.getCodigo())
                            .idTipoActividad(entity.getIdTipoActividad())
                            .nombre(entity.getNombre())
                            .idUnidadMedida(entity.getIdUnidadMedida())
                            .descripcion(entity.getDescripcion())
                            .tipoActividad(entity.getTipoActividad())
                            .unidadMedida(entity.getUnidadMedida())
                            .build();
                })
                .collect(Collectors.toList());
    }

    public List<NormasConsumoWithoutList> getNormasConsumoByPlanProduccion(long id) {
        return normasConsumoService.findAllWithoutMapping()
                .stream()
                .filter(p -> p.getIdPlanProduccion() == id)
                .map(entity->{
                    return NormasConsumoWithoutList.builder()
                            .id(entity.getId())
                            .idActividad(entity.getIdActividad())
                            .idPlanProduccion(entity.getIdPlanProduccion())
                            .capacidadInstalada(entity.getCapacidadInstalada())
                            .capacidadInstaladaUtilizacionPercent(entity.getCapacidadInstaladaUtilizacionPercent())
                            .produccionPeriodoAnterior(entity.getProduccionPeriodoAnterior())
                            .margenUtilidadPercentCuc(entity.getMargenUtilidadPercentCuc())
                            .margenUtilidadPercentMt(entity.getMargenUtilidadPercentMt())
                            .precio(entity.getPrecio())
                            .idUeb(entity.getIdUeb())
                            .nombreAprueba(entity.getNombreAprueba())
                            .cargoAprueba(entity.getCargoAprueba())
                            .build();
                })
                .collect(Collectors.toList());
    }

    //UEB
    public List<PlanProduccionWithoutList> getPlanProduccionByUeb(long id) {
        return planProduccionService.findAllWithoutMapping()
                .stream()
                .filter(p -> p.getIdUeb() == id)
                .map(p-> {
            return PlanProduccionWithoutList.builder()
                    .id(p.getId()).idUeb(p.getIdUeb()).build();
        })
                .collect(Collectors.toList());
    }

    public List<NormasConsumoWithoutList> getNormaConsumoByUeb(long id) {
        return normasConsumoService.findAllWithoutMapping()
                .stream()
                .filter(p -> p.getIdUeb() == id)
                .map(entity->{
                    return NormasConsumoWithoutList.builder()
                            .id(entity.getId())
                            .idActividad(entity.getIdActividad())
                            .idPlanProduccion(entity.getIdPlanProduccion())
                            .capacidadInstalada(entity.getCapacidadInstalada())
                            .capacidadInstaladaUtilizacionPercent(entity.getCapacidadInstaladaUtilizacionPercent())
                            .produccionPeriodoAnterior(entity.getProduccionPeriodoAnterior())
                            .margenUtilidadPercentCuc(entity.getMargenUtilidadPercentCuc())
                            .margenUtilidadPercentMt(entity.getMargenUtilidadPercentMt())
                            .precio(entity.getPrecio())
                            .idUeb(entity.getIdUeb())
                            .nombreAprueba(entity.getNombreAprueba())
                            .cargoAprueba(entity.getCargoAprueba())
                            .build();
                })
                .collect(Collectors.toList());
    }

    public List<OrdenTrabajoWhithoutList> getOrdenTrabajoByUeb(long id) {
        return ordenTrabajoService.findAllWithoutMapping()
                .stream()
                .filter(p -> p.getIdUeb() == id)
                .map(p->{
                    return OrdenTrabajoWhithoutList.builder()
                            .id(p.getId())
                            .idActividad(p.getIdActividad())
                            .idCliente(p.getIdCliente())
                            .numeroContrato(p.getNumeroContrato())
                            .vendedor(p.getVendedor())
                            .observaciones(p.getObservaciones())
                            .ordenTrabajo(p.getOrdenTrabajo())
                            .fechaEntrega(p.getFechaEntrega())
                            .fechaConfeccion(p.getFechaConfeccion())
                            .idUeb(p.getIdUeb())
                            .nombreAprobacion(p.getNombreAprobacion())
                            .descripcionServicio(p.getDescripcionServicio())
                            .motivoServicio(p.getMotivoServicio())
                            .nombreConformidad(p.getNombreConformidad())
                            .idCargo(p.getIdCargo())
                            .identidadUsuario(p.getIdentidadUsuario())
                            .cerrada(p.getCerrada())
                            .idFichaCosto(p.getIdFichaCosto()).build();
                })
                .collect(Collectors.toList());
    }

    public List<TrabajadorWithoutList> getTrabajadorByUeb(long id) {
        return trabajadorService.findAllWithoutMapping()
                .stream()
                .filter(p -> p.getIdUeb() == id)
                .map(entity->{
                    return TrabajadorWithoutList.builder().id(entity.getId())
                            .nombre(entity.getNombre())
                            .idCargo(entity.getIdCargo())
                            .idUeb(entity.getIdUeb()).build();
                })
                .collect(Collectors.toList());
    }

    public List<EtapaWithoutList> getEtapaByUeb(long id) {
        return uebEtapaService.findAll()
                .stream()
                .filter(p -> p.getIdUeb() == id)
                .map(UebEtapaDto::getEtapa)
                .map(entity->{
                    return EtapaWithoutList.builder()
                            .id(entity.getId())
                            .nombre(entity.getNombre())
                            .descripcion(entity.getDescripcion())
                            .orden(entity.getOrden())
                            .build();
                })
                .collect(Collectors.toList());
    }

    //Orden trabajo
    public List<MaterialWithoutList> getMaterialesByOrdenTrabajo(long id) {
        return materialService.findAllWithoutMapping()
                .stream()
                .filter(p -> p.getIdOrdenTrabajo() == id)
                .map(entity->{
                    return MaterialWithoutList.builder()
                            .id(entity.getId())
                            .fecha(entity.getFecha())
                            .importeMn(entity.getImporteMn())
                            .importeMlc(entity.getImporteMlc())
                            .noVSalida(entity.getNoVentaSalida())
                            .total(entity.getTotal())
                            .idOrdenTrabajo(entity.getIdOrdenTrabajo())
                            .build();
                })
                .collect(Collectors.toList());
    }

    public List<OrdenFacturacionWithoutList> getOrdenFacturacionByOrdenTrabajo(long id) {
        return ordenFacturacionService.findAllWithoutMapping()
                .stream()
                .filter(p -> p.getIdOrdenTrabajo() == id)
                .map(entity->{
                    return OrdenFacturacionWithoutList.builder()
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
                            .unidadMedida(medidaService.findById(entity.getIdUnidadMedida()).get())
                            .build();
                })
                .collect(Collectors.toList());
    }

    //Ficha Costo
    public List<NormasConsumoWithoutList> getNormaConsumoByFichaCosto(long id) {
        return normaConsumoFichaCostoService.findAll()
                .stream()
                .filter(p -> p.getIdFichaCosto() == id)
                .map(NormaConsumoFichaCostoDto::getNormasConsumo)
                .map(entity->{
                    return NormasConsumoWithoutList.builder()
                            .id(entity.getId())
                            .idActividad(entity.getIdActividad())
                            .idPlanProduccion(entity.getIdPlanProduccion())
                            .capacidadInstalada(entity.getCapacidadInstalada())
                            .capacidadInstaladaUtilizacionPercent(entity.getCapacidadInstaladaUtilizacionPercent())
                            .produccionPeriodoAnterior(entity.getProduccionPeriodoAnterior())
                            .margenUtilidadPercentCuc(entity.getMargenUtilidadPercentCuc())
                            .margenUtilidadPercentMt(entity.getMargenUtilidadPercentMt())
                            .precio(entity.getPrecio())
                            .idUeb(entity.getIdUeb())
                            .nombreAprueba(entity.getNombreAprueba())
                            .cargoAprueba(entity.getCargoAprueba())
                            .build();
                })
                .collect(Collectors.toList());
    }

    public List<OrdenTrabajoWhithoutList> getOrdenTrabajoByFichaCosto(long id) {
        return ordenTrabajoService.findAllWithoutMapping()
                .stream()
                .filter(p -> p.getIdFichaCosto() == id)
                .map(p->{
                    return OrdenTrabajoWhithoutList.builder()
                            .id(p.getId())
                            .idActividad(p.getIdActividad())
                            .idCliente(p.getIdCliente())
                            .numeroContrato(p.getNumeroContrato())
                            .vendedor(p.getVendedor())
                            .observaciones(p.getObservaciones())
                            .ordenTrabajo(p.getOrdenTrabajo())
                            .fechaEntrega(p.getFechaEntrega())
                            .fechaConfeccion(p.getFechaConfeccion())
                            .idUeb(p.getIdUeb())
                            .nombreAprobacion(p.getNombreAprobacion())
                            .descripcionServicio(p.getDescripcionServicio())
                            .motivoServicio(p.getMotivoServicio())
                            .nombreConformidad(p.getNombreConformidad())
                            .idCargo(p.getIdCargo())
                            .identidadUsuario(p.getIdentidadUsuario())
                            .cerrada(p.getCerrada())
                            .idFichaCosto(p.getIdFichaCosto()).build();
                })
                .collect(Collectors.toList());
    }

    //Normas Consumo
    public List<FichaCostoWhithoutList> getFichaCostoByNormaConsumo(long id) {
        return normaConsumoFichaCostoService.findAll()
                .stream()
                .filter(p -> p.getIdNormaConsumo() == id)
                .map(NormaConsumoFichaCostoDto::getFichaCosto)
                .map(entity->{
                    return FichaCostoWhithoutList.builder()
                            .id(entity.getId())
                            .idActividad(entity.getIdActividad())
                            .aprobada(entity.getAprobada())
                            .build();
                })
                .collect(Collectors.toList());
    }

    //Cliente
    public List<OrdenTrabajoWhithoutList> getOrdenTrabajoByCliente(long id) {
        return ordenTrabajoService.findAllWithoutMapping()
                .stream()
                .filter(p -> p.getIdCliente() == id)
                .map(p->{
                    return OrdenTrabajoWhithoutList.builder()
                            .id(p.getId())
                            .idActividad(p.getIdActividad())
                            .idCliente(p.getIdCliente())
                            .numeroContrato(p.getNumeroContrato())
                            .vendedor(p.getVendedor())
                            .observaciones(p.getObservaciones())
                            .ordenTrabajo(p.getOrdenTrabajo())
                            .fechaEntrega(p.getFechaEntrega())
                            .fechaConfeccion(p.getFechaConfeccion())
                            .idUeb(p.getIdUeb())
                            .nombreAprobacion(p.getNombreAprobacion())
                            .descripcionServicio(p.getDescripcionServicio())
                            .motivoServicio(p.getMotivoServicio())
                            .nombreConformidad(p.getNombreConformidad())
                            .idCargo(p.getIdCargo())
                            .identidadUsuario(p.getIdentidadUsuario())
                            .cerrada(p.getCerrada())
                            .idFichaCosto(p.getIdFichaCosto()).build();
                })
                .collect(Collectors.toList());
    }

    //Cargo
    public List<PersonaAutorizadaWithoutList> getPersonasAutorizadasByCargo(long id) {
        return personasAutorizadasService.findAllWithoutMapping()
                .stream()
                .filter(p -> p.getIdCargo() == id)
                .map(entity->{
                    return PersonaAutorizadaWithoutList.builder()
                            .id(entity.getId())
                            .idUsuario(entity.getIdUsuario())
                            .idCargo(entity.getIdCargo())
                            .build();
                })
                .collect(Collectors.toList());
    }

    //Trabajador
    public List<ReporteDiarioLaboralWithoutList> getReporteDiarioLaboralByTrabajador(long id) {
        return reporteDiarioLaboralService.findAllWithoutMapping()
                .stream()
                .filter(p -> p.getIdTrabajador() == id)
                .map(entity->{
                    return ReporteDiarioLaboralWithoutList.builder()
                            .id(entity.getId())
                            .idTrabajador(entity.getIdTrabajador())
                            .fecha(entity.getFecha())
                            .cantHoras(entity.getCantHoras())
                            .idOrdenTrabajo(entity.getIdOrdenTrabajo())
                            .build();
                })
                .collect(Collectors.toList());
    }

    //ElementoGasto
    public List<SubElementoGastoWithoutList> getSubElementoGastoByElemento(long id) {
        return subelementoGastoService.findAllWithoutMapping()
                .stream()
                .filter(p -> p.getIdElemento() == id)
                .map(entity->{
                    return SubElementoGastoWithoutList.builder()
                            .id(entity.getId())
                            .subelemento(entity.getSubelemento())
                            .mostrar(entity.getMostrar())
                            .orden(entity.getOrden())
                            .idElemento(entity.getIdElemento())
                            .codigoSubelemento(entity.getCodigoSubelemento())
                            .descripcion(entity.getDescripcion())
                            .build();
                })
                .collect(Collectors.toList());
    }

    //Etapa
    public List<UebWithoutList> getUebByEtapa(long id) {
        return uebEtapaService.findAll()
                .stream()
                .filter(p -> p.getIdEtapa() == id)
                .map(UebEtapaDto::getUeb)
                .map(entity->{
                    return UebWithoutList.builder()
                            .id(entity.getId())
                            .codigoUeb(entity.getCodigoUeb())
                            .nombreUeb(entity.getNombreUeb())
                            .descripcion(entity.getDescripcion())
                            .coeficienteEstMn(entity.getCoeficienteEstMn())
                            .coeficienteEstMlc(entity.getCoeficienteEstMlc())
                            .pagoResultadoPercent(entity.getPagoResultadoPercent())
                            .build();
                })
                .collect(Collectors.toList());
    }

}
