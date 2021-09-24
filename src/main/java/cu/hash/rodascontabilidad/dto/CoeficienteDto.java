package cu.hash.rodascontabilidad.dto;

import lombok.*;

import java.sql.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
public class CoeficienteDto {
    private long id;
    private Date fecha;
    private Long idCoeficientesGastosIndirectosProduccion;
    private Long idCoeficienteGastoGeneralesAdmon;
    private Long idCoeficienteGastosBancarios;
    private Long idCoeficienteGastosDistribucionVentas;

    //Objects to load when this object is loading
    private CoeficienteGastosindirectosProduccionDto coeficienteGastosindirectosProduccion;
    private CoeficienteGastosGeneralesAdmonDto coeficienteGastosGeneralesAdmon;
    private CoeficienteGastosBancariosDto coeficienteGastosBancarios;
    private CoeficienteGastosDistribucionVentasDto coeficienteGastosDistribucionVentas;

}
