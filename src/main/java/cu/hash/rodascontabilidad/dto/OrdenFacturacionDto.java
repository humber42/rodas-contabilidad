package cu.hash.rodascontabilidad.dto;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
public class OrdenFacturacionDto {
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
    private OrdenTrabajoDto ordenTrabajo;
}
