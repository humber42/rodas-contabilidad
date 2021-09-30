package cu.hash.rodascontabilidad.dto;

import cu.hash.rodascontabilidad.dto.classesWhithoutCollections.ActividadWithoutList;
import cu.hash.rodascontabilidad.dto.classesWhithoutCollections.NormasConsumoWithoutList;
import lombok.*;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@EqualsAndHashCode
public class PlanProduccionDto {
    private long id;
    private Long idUeb;

    private UebDto ueb;

    //Lists by grouping
    private List<ActividadWithoutList> actividadDtoList;
    private List<NormasConsumoWithoutList> normasConsumoList;
}
