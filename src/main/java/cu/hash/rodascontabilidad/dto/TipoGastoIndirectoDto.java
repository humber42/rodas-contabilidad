package cu.hash.rodascontabilidad.dto;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@EqualsAndHashCode
public class TipoGastoIndirectoDto {
    private long id;
    private String nombre;
    private String descripcion;
}
