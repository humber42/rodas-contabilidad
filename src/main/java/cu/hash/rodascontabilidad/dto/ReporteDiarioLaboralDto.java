package cu.hash.rodascontabilidad.dto;

import lombok.*;

import java.sql.Date;

@EqualsAndHashCode
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ReporteDiarioLaboralDto {
    private long id;
    private Long idTrabajador;
    private Date fecha;
    private Long cantHoras;
    private Long idOrdenTrabajo;

    private TrabajadorDto trabajador;
    private OrdenTrabajoDto ordenTrabajo;
}
