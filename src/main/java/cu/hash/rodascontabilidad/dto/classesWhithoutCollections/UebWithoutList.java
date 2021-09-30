package cu.hash.rodascontabilidad.dto.classesWhithoutCollections;

import lombok.*;


@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Data
public class UebWithoutList {
    private long id;
    private String codigoUeb;
    private String nombreUeb;
    private String descripcion;
    private Double coeficienteEstMn;
    private Double coeficienteEstMlc;
    private Double pagoResultadoPercent;
}
