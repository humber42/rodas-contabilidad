package cu.hash.rodascontabilidad.dto;

import lombok.*;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@EqualsAndHashCode
public class UebDto {
    private long id;
    private String codigoUeb;
    private String nombreUeb;
    private String descripcion;
    private Double coeficienteEstMn;
    private Double coeficienteEstMlc;
    private Double pagoResultadoPercent;

    //Lists grouping entities
    private List<PlanProduccionDto> planProduccionList;
    private List<NormasConsumoDto> normasConsumoList;
    private List<OrdenTrabajoDto> ordenTrabajoList;
    private List<TrabajadorDto> trabajadorList;
    private List<EtapaDto> etapaList;
}
