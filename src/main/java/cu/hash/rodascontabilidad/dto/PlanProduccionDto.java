package cu.hash.rodascontabilidad.dto;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@EqualsAndHashCode
public class PlanProduccionDto {
    private long id;
    private Long idUeb;

    private UebDto ueb;
}
