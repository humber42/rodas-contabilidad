package cu.hash.rodascontabilidad.services;

import cu.hash.rodascontabilidad.dto.*;
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

    //Actividades

    /**
     * Obtener lista plan de produccion dado un Id de actividad
     *
     * @param id Identifier activity
     * @return List<Plan       produccion>
     */
    public List<PlanProduccionDto> getPlanProduccionActividad(long id) {
        return uebActividadesPlanProduccionService.findAll()
                .stream()
                .filter(p -> p.getIdActividad() == id)
                .map(UebActividadesPlanProduccionDto::getPlanProduccion)
                .collect(Collectors.toList());
    }

    public List<OrdenTrabajoDto> getOrdenTrabajoActividad(long id) {
        return ordenTrabajoService.findAll()
                .stream()
                .filter(p -> p.getIdActividad() == id)
                .collect(Collectors.toList());
    }

    //Plan produccion
    public List<ActividadDto> getActividadesByPlanProduccion(long id) {
        return uebActividadesPlanProduccionService.findAll()
                .stream()
                .filter(p -> p.getIdPlanProduccion() == id)
                .map(UebActividadesPlanProduccionDto::getActividad)
                .collect(Collectors.toList());
    }

    public List<NormasConsumoDto> getNormasConsumoByPlanProduccion(long id) {
        return normasConsumoService.findAll()
                .stream()
                .filter(p -> p.getIdPlanProduccion() == id)
                .collect(Collectors.toList());
    }

    //UEB
    public List<PlanProduccionDto> getPlanProduccionByUeb(long id) {
        return planProduccionService.findAll()
                .stream()
                .filter(p -> p.getIdUeb() == id)
                .collect(Collectors.toList());
    }

    public List<NormasConsumoDto> getNormaConsumoByUeb(long id) {
        return normasConsumoService.findAll()
                .stream()
                .filter(p -> p.getIdUeb() == id)
                .collect(Collectors.toList());
    }

    public List<OrdenTrabajoDto> getOrdenTrabajoByUeb(long id) {
        return ordenTrabajoService.findAll()
                .stream()
                .filter(p -> p.getIdUeb() == id)
                .collect(Collectors.toList());
    }

    public List<TrabajadorDto> getTrabajadorByUeb(long id) {
        return trabajadorService.findAll()
                .stream()
                .filter(p -> p.getIdUeb() == id)
                .collect(Collectors.toList());
    }

    public List<EtapaDto> getEtapaByUeb(long id) {
        return uebEtapaService.findAll()
                .stream()
                .filter(p -> p.getIdUeb() == id)
                .map(UebEtapaDto::getEtapa)
                .collect(Collectors.toList());
    }

    //Orden trabajo
    public List<MaterialDto> getMaterialesByOrdenTrabajo(long id) {
        return materialService.findAll()
                .stream()
                .filter(p -> p.getIdOrdenTrabajo() == id)
                .collect(Collectors.toList());
    }

    public List<OrdenFacturacionDto> getOrdenFacturacionByOrdenTrabajo(long id) {
        return ordenFacturacionService.findAll()
                .stream()
                .filter(p -> p.getIdOrdenTrabajo() == id)
                .collect(Collectors.toList());
    }

    //Ficha Costo
    public List<NormasConsumoDto> getNormaConsumoByFichaCosto(long id) {
        return normaConsumoFichaCostoService.findAll()
                .stream()
                .filter(p -> p.getIdFichaCosto() == id)
                .map(NormaConsumoFichaCostoDto::getNormasConsumo)
                .collect(Collectors.toList());
    }

    public List<OrdenTrabajoDto> getOrdenTrabajoByFichaCosto(long id) {
        return ordenTrabajoService.findAll()
                .stream()
                .filter(p -> p.getIdFichaCosto() == id)
                .collect(Collectors.toList());
    }

    //Normas Consumo
    public List<FichaCostoDto> getFichaCostoByNormaConsumo(long id) {
        return normaConsumoFichaCostoService.findAll()
                .stream()
                .filter(p -> p.getIdNormaConsumo() == id)
                .map(NormaConsumoFichaCostoDto::getFichaCosto)
                .collect(Collectors.toList());
    }

    //Cliente
    public List<OrdenTrabajoDto> getOrdenTrabajoByCliente(long id) {
        return ordenTrabajoService.findAll()
                .stream()
                .filter(p -> p.getIdCliente() == id)
                .collect(Collectors.toList());
    }

    //Cargo
    public List<PersonasAutorizadasDto> getPersonasAutorizadasByCargo(long id) {
        return personasAutorizadasService.findAll()
                .stream()
                .filter(p -> p.getIdCargo() == id)
                .collect(Collectors.toList());
    }

    //Trabajador
    public List<ReporteDiarioLaboralDto> getReporteDiarioLaboralByTrabajador(long id) {
        return reporteDiarioLaboralService.findAll()
                .stream()
                .filter(p -> p.getIdTrabajador() == id)
                .collect(Collectors.toList());
    }

    //ElementoGasto
    public List<SubelementoGastoDto> getSubElementoGastoByElemento(long id) {
        return subelementoGastoService.findAll()
                .stream()
                .filter(p -> p.getIdElemento() == id)
                .collect(Collectors.toList());
    }

    //Etapa
    public List<UebDto> getUebByEtapa(long id) {
        return uebEtapaService.findAll()
                .stream()
                .filter(p -> p.getIdEtapa() == id)
                .map(UebEtapaDto::getUeb)
                .collect(Collectors.toList());
    }

}
