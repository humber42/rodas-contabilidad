package cu.hash.rodascontabilidad.dto;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@EqualsAndHashCode
public class CategoriaAgrupacionDto {
    private long id;
    private String nombre;
    private String descripcion;
    private long orden;
    private Boolean mostrarFichaCosto;
}
