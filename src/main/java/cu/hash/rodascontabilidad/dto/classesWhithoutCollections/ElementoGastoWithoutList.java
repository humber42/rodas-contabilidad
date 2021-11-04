package cu.hash.rodascontabilidad.dto.classesWhithoutCollections;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@EqualsAndHashCode
@ToString
public class ElementoGastoWithoutList {
    private long id;
    private String elemento;
    private Boolean mostrar;
    private Long orden;
    private String descripcion;
    private String codigoElemento;
}
