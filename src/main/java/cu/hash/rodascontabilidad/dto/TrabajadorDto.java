package cu.hash.rodascontabilidad.dto;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@EqualsAndHashCode
public class TrabajadorDto {
    private long id;
    private String nombre;
    private Long idCargo;
    private Long idUeb;

    private UebDto ueb;
}
