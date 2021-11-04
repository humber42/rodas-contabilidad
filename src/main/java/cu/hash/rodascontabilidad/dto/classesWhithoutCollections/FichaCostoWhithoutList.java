package cu.hash.rodascontabilidad.dto.classesWhithoutCollections;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@EqualsAndHashCode
@Data
public class FichaCostoWhithoutList {
    private long id;
    private Long idActividad;
    private Boolean aprobada;
    private ActividadWithoutList actividadWithoutList;
}
