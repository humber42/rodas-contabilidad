package cu.hash.rodascontabilidad.dto.classesWhithoutCollections;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@EqualsAndHashCode
@Data
public class EtapaWithoutList {
    private long id;
    private String nombre;
    private String descripcion;
    private Long orden;
}
