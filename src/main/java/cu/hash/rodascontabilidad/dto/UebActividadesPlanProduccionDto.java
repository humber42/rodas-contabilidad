package cu.hash.rodascontabilidad.dto;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
public class UebActividadesPlanProduccionDto {
    private long id;
    private Long idPlanProduccion;
    private Long idActividad;

    private PlanProduccionDto planProduccion;
    private ActividadDto actividad;
}
