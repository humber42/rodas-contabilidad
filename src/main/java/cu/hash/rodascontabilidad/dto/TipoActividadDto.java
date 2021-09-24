package cu.hash.rodascontabilidad.dto;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@EqualsAndHashCode
public class TipoActividadDto {
    private long id;
    private String codigo;
    private String nombre;
    private String descripcion;
}
