package cu.hash.rodascontabilidad.dto;

import cu.hash.rodascontabilidad.dto.classesWhithoutCollections.OrdenTrabajoWhithoutList;
import lombok.*;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@EqualsAndHashCode
public class ClienteDto {
    private long id;
    private String nombre;
    private String descripcion;

    private List<OrdenTrabajoWhithoutList> ordenTrabajoList;
}
