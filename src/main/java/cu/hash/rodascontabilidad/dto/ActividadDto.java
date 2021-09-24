package cu.hash.rodascontabilidad.dto;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
public class ActividadDto {

    //Objects to map when this entity is loaded
    TipoActividadDto tipoActividad;
    private long id;
    private String codigo;
    private Long idTipoActividad;
    private String nombre;
    private Long idUnidadMedida;
    private String descripcion;

}
