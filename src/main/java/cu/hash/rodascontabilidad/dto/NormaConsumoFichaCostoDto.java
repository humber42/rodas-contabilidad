package cu.hash.rodascontabilidad.dto;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@EqualsAndHashCode
public class NormaConsumoFichaCostoDto {
    private long id;
    private Long idNormaConsumo;
    private Long idFichaCosto;

    private NormasConsumoDto normasConsumo;
    private FichaCostoDto fichaCosto;
}
