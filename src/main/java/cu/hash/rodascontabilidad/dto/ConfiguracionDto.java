package cu.hash.rodascontabilidad.dto;


import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@EqualsAndHashCode
@Data
public class ConfiguracionDto {
    private long idConfiguracion;
    private String nombreEntidad;
    private String codigoEntidad;
    private String organismo;
    private Float horasPorMes;
    private Double gastoPromedioEstimacionDivisa;
    private Double pagoPorResultadoPercent;
    private Double pagoPorSeguridadSocialPercent;
    private Double fuerzaTrabajoPercent;
    private Double margenUtilidadProdMlc;
    private Double margenUtilidadProdMt;
    private Double margenUtilidadServiciosMlc;
    private Double margenUtilidadServiciosMt;
    private Long idElemento;
    private Long idSubelemento;
    private long idUeb;
    private long idCliente;

    private ElementoGastoDto elementoGasto;
    private SubelementoGastoDto subelementoGasto;
    private UebDto ueb;
    private ClienteDto cliente;
}
