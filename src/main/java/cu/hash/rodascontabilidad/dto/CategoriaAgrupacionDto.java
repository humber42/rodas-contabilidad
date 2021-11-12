package cu.hash.rodascontabilidad.dto;

import cu.hash.rodascontabilidad.dto.classesWhithoutCollections.ElementoGastoWithoutList;
import cu.hash.rodascontabilidad.dto.classesWhithoutCollections.SubElementoGastoWithoutList;
import lombok.*;

import java.util.List;

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
    private String tipoCategoria;

    private List<ElementoGastoWithoutList> elementosList;
    private List<SubElementoGastoWithoutList> subelementosList;
}
