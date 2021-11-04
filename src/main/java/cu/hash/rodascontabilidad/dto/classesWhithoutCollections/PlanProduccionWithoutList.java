package cu.hash.rodascontabilidad.dto.classesWhithoutCollections;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
public class PlanProduccionWithoutList {
    private long id;
    private Long idUeb;
    private UebWithoutList ueb;
}
