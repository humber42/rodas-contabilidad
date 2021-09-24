package cu.hash.rodascontabilidad.dto;

import lombok.*;

@Data
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CoeficienteGastosBancariosDto {

    private long id;
    private Double coeficienteGastoTotalMn;
    private Double coeficienteGastoTotalMlc;
    private Double coeficienteGastoTotalMt;
    private Double coeficienteGastoDeprecMn;
    private Double coeficienteGastoDeprecMlc;
    private Double coeficienteGastoDeprecMt;
    private Double coeficienteGastoMantenimientoYRepMn;
    private Double coeficienteGastoMantenimientoYRepMlc;
    private Double coeficienteGastoMantenimientoYRepMt;
}
