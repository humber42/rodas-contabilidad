package cu.hash.rodascontabilidad.dto.classesWhithoutCollections;

import lombok.*;

import java.sql.Date;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@EqualsAndHashCode
@Data
public class MaterialWithoutList {
    private long id;
    private Date fecha;
    private Double importeMn;
    private Double importeMlc;
    private String noVSalida;
    private Double total;
    private Long idOrdenTrabajo;
}
