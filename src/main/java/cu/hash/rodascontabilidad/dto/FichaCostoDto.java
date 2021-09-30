package cu.hash.rodascontabilidad.dto;

import cu.hash.rodascontabilidad.dto.classesWhithoutCollections.NormasConsumoWithoutList;
import cu.hash.rodascontabilidad.dto.classesWhithoutCollections.OrdenTrabajoWhithoutList;
import lombok.*;

import java.util.List;

@AllArgsConstructor
@Builder
@NoArgsConstructor
@Data
@EqualsAndHashCode
public class FichaCostoDto {
    private long id;
    private Long idActividad;
    private Boolean aprobada;

    private ActividadDto actividad;

    private List<NormasConsumoWithoutList> normasConsumoList;
    private List<OrdenTrabajoWhithoutList> ordenTrabajoList;
}
