package cu.hash.rodascontabilidad.controlers.especialRequest;

import cu.hash.rodascontabilidad.controlers.especialRequest.ReporteDiarioLaboralEspecial;
import lombok.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@EqualsAndHashCode
@ToString
public class OrdenTrabajoReporteDiarioRequest {
    private long ordenTrabajoId;
    private List<ReporteDiarioLaboralEspecial> especialList;
}