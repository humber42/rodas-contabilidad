package cu.hash.rodascontabilidad.services;

import cu.hash.rodascontabilidad.dto.*;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ListResolvers {

    //Actividades
    public List<PlanProduccionDto> getPlanProduccionActividad(long id) {
        return null;
    }

    public List<OrdenTrabajoDto> getOrdenTrabajoActividad(long id) {
        return null;
    }

    //Plan produccion
    public List<ActividadDto> getActividadesByPlanProduccion(long id) {
        return null;
    }

    public List<NormasConsumoDto> getNormasConsumoByPlanProduccion(Long id) {
        return null;
    }

    //UEB
    public List<PlanProduccionDto> getPlanProduccionByUeb(long id) {
        return null;
    }

    public List<NormasConsumoDto> getNormaConsumoByUeb(long id) {
        return null;
    }

    public List<OrdenTrabajoDto> getOrdenTrabajoByUeb(Long id) {
        return null;
    }

    public List<TrabajadorDto> getTrabajadorByUeb(long id) {
        return null;
    }

    public List<EtapaDto> getEtapaByUeb(long id) {
        return null;
    }

    //Orden trabajo
    public List<MaterialDto> getMaterialesByOrdenTrabajo(long id) {
        return null;
    }

    public List<OrdenFacturacionDto> getOrdenFacturacionByOrdenTrabajo(long id) {
        return null;
    }

    //Ficha Costo
    public List<NormasConsumoDto> getNormaConsumoByFichaCosto(long id) {
        return null;
    }

    public List<OrdenTrabajoDto> getOrdenTrabajoByFichaCosto(long id) {
        return null;
    }

    //Normas Consumo
    public List<FichaCostoDto> getFichaCostoByNormaConsumo(long id) {
        return null;
    }

    //Cliente
    public List<OrdenTrabajoDto> getOrdenTrabajoByCliente(long id) {
        return null;
    }

    //Cargo
    public List<PersonasAutorizadasDto> getPersonasAutorizadasByCargo(long id) {
        return null;
    }

    //Trabajador
    public List<ReporteDiarioLaboralDto> getReporteDiarioLaboralByTrabajador(long id) {
        return null;
    }

    //ElementoGasto
    public List<SubelementoGastoDto> getSubElementoGastoByElemento(long id) {
        return null;
    }

    //Etapa
    public List<UebDto> getUebByEtapa(long id) {
        return null;
    }

}
