package cu.hash.rodascontabilidad.dto;


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

    private CategoriaAgrupacionDto categoriaAgrupacionIndirecta;
    private SubelementoGastoDto subelementoGasto;

}
