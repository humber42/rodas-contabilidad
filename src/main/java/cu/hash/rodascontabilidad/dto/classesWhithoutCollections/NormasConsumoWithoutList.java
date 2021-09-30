package cu.hash.rodascontabilidad.dto.classesWhithoutCollections;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
public class NormasConsumoWithoutList {
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
}
