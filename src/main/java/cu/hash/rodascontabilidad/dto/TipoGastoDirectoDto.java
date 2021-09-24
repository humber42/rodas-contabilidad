package cu.hash.rodascontabilidad.dto;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@EqualsAndHashCode
public class TipoGastoDirectoDto {
    private long id;
    private String nombre;
    private String descripcion;
}
