package cu.hash.rodascontabilidad.dto;

import cu.hash.rodascontabilidad.dto.classesWhithoutCollections.FichaCostoWhithoutList;
import cu.hash.rodascontabilidad.dto.classesWhithoutCollections.NormasConsumoWithoutList;
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

    private NormasConsumoWithoutList normasConsumo;
    private FichaCostoWhithoutList fichaCosto;
}
