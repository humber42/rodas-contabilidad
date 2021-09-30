package cu.hash.rodascontabilidad.dto.classesWhithoutCollections;

import cu.hash.rodascontabilidad.dto.UnidadMedidaDto;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@EqualsAndHashCode
@Data
public class OrdenFacturacionWithoutList {
    private long id;
    private String codigo;
    private String pS;
    private Long idUnidadMedida;
    private Long cantidad;
    private Double precioMn;
    private Double precioMlc;
    private Double importeMn;
    private Double importeMlc;
    private String descripcion;
    private Long idOrdenTrabajo;

    private UnidadMedidaDto unidadMedida;
}
