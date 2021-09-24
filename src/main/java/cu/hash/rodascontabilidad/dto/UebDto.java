package cu.hash.rodascontabilidad.dto;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@EqualsAndHashCode
public class UebDto {
    private long id;
    private String codigoUeb;
    private String nombreUeb;
    private String descripcion;
    private Double coeficienteEstMn;
    private Double coeficienteEstMlc;
    private Double pagoResultadoPercent;
}
