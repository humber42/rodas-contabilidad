package cu.hash.rodascontabilidad.dto;

import cu.hash.rodascontabilidad.dto.classesWhithoutCollections.ActividadWithoutList;
import cu.hash.rodascontabilidad.dto.classesWhithoutCollections.PlanProduccionWithoutList;
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

    private PlanProduccionWithoutList planProduccion;
    private ActividadWithoutList actividad;


}
