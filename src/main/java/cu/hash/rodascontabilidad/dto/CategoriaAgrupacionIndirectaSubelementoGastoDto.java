package cu.hash.rodascontabilidad.dto;


import cu.hash.rodascontabilidad.dto.classesWhithoutCollections.CategoriaAgrupacionWithoutList;
import cu.hash.rodascontabilidad.dto.classesWhithoutCollections.SubElementoGastoWithoutList;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
public class CategoriaAgrupacionIndirectaSubelementoGastoDto {
    private long id;
    private Long idCategoriaAgrupacionIndirecta;
    private Long idSubelementoGasto;
    private Long orden;

    private CategoriaAgrupacionWithoutList categoriaAgrupacionIndirecta;
    private SubElementoGastoWithoutList subelementoGasto;

}
