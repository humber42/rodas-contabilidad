package cu.hash.rodascontabilidad.dto;

import cu.hash.rodascontabilidad.dto.classesWhithoutCollections.OrdenTrabajoWhithoutList;
import cu.hash.rodascontabilidad.dto.classesWhithoutCollections.PlanProduccionWithoutList;
import lombok.*;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
public class ActividadDto {

    //Objects to map when this entity is loaded
    private TipoActividadDto tipoActividad;
    private UnidadMedidaDto unidadMedida;
    private long id;
    private String codigo;
    private Long idTipoActividad;
    private String nombre;
    private Long idUnidadMedida;
    private String descripcion;

    //Lists by grouping
    private List<PlanProduccionWithoutList> planProduccionList;
    private List<OrdenTrabajoWhithoutList> ordenTrabajoList;

}
