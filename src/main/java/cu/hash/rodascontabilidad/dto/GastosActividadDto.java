package cu.hash.rodascontabilidad.dto;

import lombok.*;

@Builder
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
@Data
public class GastosActividadDto {
    private long id;
    private Long idGastoDirecto;
    private Long idActividad;
    private Long idGastoIndirecto;

    private GastoDirectoDto gastoDirecto;
    private ActividadDto actividad;
    private GastoIndirectoDto gastoIndirecto;
}
