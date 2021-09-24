package cu.hash.rodascontabilidad.dto;

import lombok.*;

@Data
@AllArgsConstructor
@Builder
@NoArgsConstructor
@EqualsAndHashCode
public class NormasConsumoDto {

    private long id;
    private Long idActividad;
    private Long idPlanProduccion;
    private Long capacidadInstalada;
    private Double capacidadInstaladaUtilizacionPercent;
    private Double produccionPeriodoAnterior;
    private Double margenUtilidadPercentCuc;
    private Double precio;
    private Long idUeb;
    private String nombreAprueba;
    private String cargoAprueba;
    private Double margenUtilidadPercentMt;

    private ActividadDto actividad;
    private PlanProduccionDto planProduccion;
    private UebDto ueb;
}
