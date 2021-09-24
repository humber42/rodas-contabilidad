package cu.hash.rodascontabilidad.dto;

import lombok.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Data
public class GastoDirectoDto {
    private long id;
    private String codigo;
    private String nombre;
    private String descripcion;
    private Long idTipoGastoDirecto;
    private double precioMn;
    private double precioCl;
    private Long idUnidadMedida;
    private Long idElementoGasto;
    private Long idSubelemento;

    private TipoGastoDirectoDto tipoGastoDirecto;
    private UnidadMedidaDto unidadMedida;
    private ElementoGastoDto elementoGasto;
    private SubelementoGastoDto subelementoGasto;
}
