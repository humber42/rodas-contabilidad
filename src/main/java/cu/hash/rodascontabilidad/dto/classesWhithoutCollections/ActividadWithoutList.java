package cu.hash.rodascontabilidad.dto.classesWhithoutCollections;

import cu.hash.rodascontabilidad.dto.TipoActividadDto;
import cu.hash.rodascontabilidad.dto.UnidadMedidaDto;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@EqualsAndHashCode
public class ActividadWithoutList {
    private TipoActividadDto tipoActividad;
    private UnidadMedidaDto unidadMedida;
    private long id;
    private String codigo;
    private Long idTipoActividad;
    private String nombre;
    private Long idUnidadMedida;
    private String descripcion;
}
