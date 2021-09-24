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

    private CategoriaAgrupacionIndirectaDto categoriaAgrupacionIndirecta;
    private SubelementoGastoDto subelementoGasto;

}
