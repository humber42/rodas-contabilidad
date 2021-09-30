package cu.hash.rodascontabilidad.dto.classesWhithoutCollections;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@EqualsAndHashCode
public class TrabajadorWithoutList {
    private long id;
    private String nombre;
    private Long idCargo;
    private Long idUeb;
}
