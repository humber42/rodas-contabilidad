package cu.hash.rodascontabilidad.dto;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@EqualsAndHashCode
public class CategoriaAgrupacionIndirectaElementoGastoDto {
    private long id;
    private Long idCategoriaAgrupacionIndirecta;
    private Long idElementoGasto;
    private Long orden;

    //Obejct to load when this entity is load
    private CategoriaAgrupacionDto categoriaAgrupacionIndirecta;
    private ElementoGastoDto elementoGasto;

}
