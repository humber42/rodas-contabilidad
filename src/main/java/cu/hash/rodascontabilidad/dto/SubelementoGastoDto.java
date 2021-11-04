package cu.hash.rodascontabilidad.dto;

import cu.hash.rodascontabilidad.dto.classesWhithoutCollections.ElementoGastoWithoutList;
import lombok.*;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Data
public class SubelementoGastoDto {
    private long id;
    private String subelemento;
    private Boolean mostrar;
    private Long orden;
    private Long idElemento;
    private String codigoSubelemento;
    private String descripcion;
    private ElementoGastoWithoutList elementoGasto;
}
