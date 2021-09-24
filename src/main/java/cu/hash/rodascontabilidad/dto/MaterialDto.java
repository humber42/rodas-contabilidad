package cu.hash.rodascontabilidad.dto;

import lombok.*;

import java.sql.Date;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@EqualsAndHashCode
public class MaterialDto {
    private long id;
    private Date fecha;
    private Double importeMn;
    private Double importeMlc;
    private String noVSalida;
    private Double total;
    private Long idOrdenTrabajo;

    private OrdenTrabajoDto ordenTrabajoDto;
}
