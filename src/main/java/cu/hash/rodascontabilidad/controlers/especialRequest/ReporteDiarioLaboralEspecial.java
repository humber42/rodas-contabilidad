package cu.hash.rodascontabilidad.controlers.especialRequest;

import cu.hash.rodascontabilidad.dto.TrabajadorDto;
import lombok.*;

import java.sql.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@EqualsAndHashCode
@ToString
public class ReporteDiarioLaboralEspecial {
    private long cantHoras;
    private Date fecha;
    private TrabajadorDto trabajador;
}
