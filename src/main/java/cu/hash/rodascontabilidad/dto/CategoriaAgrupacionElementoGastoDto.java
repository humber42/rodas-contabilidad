package cu.hash.rodascontabilidad.dto;

import cu.hash.rodascontabilidad.dto.classesWhithoutCollections.CategoriaAgrupacionWithoutList;
import cu.hash.rodascontabilidad.dto.classesWhithoutCollections.ElementoGastoWithoutList;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CategoriaAgrupacionElementoGastoDto {
    private long id;
    private Long idCategoriaAgrupacion;
    private Long idElementoGasto;

    //Object to map when this object is loaded
    private CategoriaAgrupacionWithoutList categoriaAgrupacion;
    private ElementoGastoWithoutList elementoGasto;
}
