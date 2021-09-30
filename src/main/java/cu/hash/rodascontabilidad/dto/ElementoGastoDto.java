package cu.hash.rodascontabilidad.dto;

import cu.hash.rodascontabilidad.dto.classesWhithoutCollections.SubElementoGastoWithoutList;
import lombok.*;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@EqualsAndHashCode
public class ElementoGastoDto {
    private long id;
    private String elemento;
    private Boolean mostrar;
    private Long orden;
    private String descripcion;
    private String codigoElemento;

    private List<SubElementoGastoWithoutList> subelementoGastoList;

}
