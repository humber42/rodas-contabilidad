package cu.hash.rodascontabilidad.dto;

import lombok.*;

@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class GastoIndirectoDto {
    private long id;
    private String codigo;
    private String nombre;
    private String descripcion;
    private Long idTipoGastoIndirecto;

    private TipoGastoIndirectoDto tipoGastoIndirecto;
}
