package cu.hash.rodascontabilidad.dto;

import lombok.*;

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
}
