package cu.hash.rodascontabilidad.dto;

import cu.hash.rodascontabilidad.dto.classesWhithoutCollections.*;
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
    private List<PlanProduccionWithoutList> planProduccionList;
    private List<NormasConsumoWithoutList> normasConsumoList;
    private List<OrdenTrabajoWhithoutList> ordenTrabajoList;
    private List<TrabajadorWithoutList> trabajadorList;
    private List<EtapaWithoutList> etapaList;
}
