package cu.hash.rodascontabilidad.dto;

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
    private List<ActividadDto> actividadDtoList;
    private List<NormasConsumoDto> normasConsumoList;
}
