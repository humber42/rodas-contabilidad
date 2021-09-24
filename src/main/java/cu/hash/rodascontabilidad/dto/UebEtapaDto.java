package cu.hash.rodascontabilidad.dto;

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

    private UebDto ueb;
    private EtapaDto etapa;
}
