package cu.hash.rodascontabilidad.dto;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@EqualsAndHashCode
public class ElementoGastoDto {
    private long id;
    private String elemento;
    private Boolean mostrar;
    private Long orden;
    private String descripcion;
    private String codigoElemento;

}
