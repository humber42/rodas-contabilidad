package cu.hash.rodascontabilidad.dto;

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

    private List<OrdenTrabajoDto> ordenTrabajoList;
}
