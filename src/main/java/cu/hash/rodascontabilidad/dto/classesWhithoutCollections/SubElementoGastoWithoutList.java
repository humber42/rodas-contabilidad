package cu.hash.rodascontabilidad.dto.classesWhithoutCollections;

import lombok.*;

@Data
@AllArgsConstructor
@Builder
@NoArgsConstructor
@EqualsAndHashCode
public class SubElementoGastoWithoutList {
    private long id;
    private String subelemento;
    private Boolean mostrar;
    private Long orden;
    private Long idElemento;
    private String codigoSubelemento;
    private String descripcion;
}
