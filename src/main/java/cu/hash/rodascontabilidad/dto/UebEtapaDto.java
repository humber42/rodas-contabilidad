package cu.hash.rodascontabilidad.dto;

import cu.hash.rodascontabilidad.dto.classesWhithoutCollections.EtapaWithoutList;
import cu.hash.rodascontabilidad.dto.classesWhithoutCollections.UebWithoutList;
import lombok.*;

@EqualsAndHashCode
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class UebEtapaDto {

    private long id;
    private Long idUeb;
    private Long idEtapa;

    private UebWithoutList ueb;
    private EtapaWithoutList etapa;
}
