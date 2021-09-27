package cu.hash.rodascontabilidad.dto;

import lombok.*;

import java.util.List;

@AllArgsConstructor
@Builder
@NoArgsConstructor
@Data
@EqualsAndHashCode
public class FichaCostoDto {
    private long id;
    private Long idActividad;
    private Boolean aprobada;

    private ActividadDto actividad;

    private List<NormasConsumoDto> normasConsumoList;
    private List<OrdenTrabajoDto> ordenTrabajoList;
}
