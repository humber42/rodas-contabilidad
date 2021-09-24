package cu.hash.rodascontabilidad.dto;

import lombok.*;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class UnidadMedidaDto {
    private long id;
    private String codigoUnidadMedida;
    private String nombre;
    private String descripcion;
}
