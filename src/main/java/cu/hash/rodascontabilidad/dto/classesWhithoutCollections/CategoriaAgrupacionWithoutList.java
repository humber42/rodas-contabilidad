package cu.hash.rodascontabilidad.dto.classesWhithoutCollections;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@EqualsAndHashCode
public class CategoriaAgrupacionWithoutList {
    private long id;
    private String nombre;
    private String descripcion;
    private long orden;
    private Boolean mostrarFichaCosto;
    private String tipoCategoria;
}
