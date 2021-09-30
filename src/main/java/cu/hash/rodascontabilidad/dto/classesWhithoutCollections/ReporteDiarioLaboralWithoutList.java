package cu.hash.rodascontabilidad.dto.classesWhithoutCollections;

import lombok.*;

import java.sql.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
@EqualsAndHashCode
@Builder
public class ReporteDiarioLaboralWithoutList {
    private long id;
    private Long idTrabajador;
    private Date fecha;
    private Long cantHoras;
    private Long idOrdenTrabajo;
}
