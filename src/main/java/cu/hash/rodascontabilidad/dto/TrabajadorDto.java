package cu.hash.rodascontabilidad.dto;

import cu.hash.rodascontabilidad.dto.classesWhithoutCollections.ReporteDiarioLaboralWithoutList;
import lombok.*;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@EqualsAndHashCode
public class TrabajadorDto {
    private long id;
    private String nombre;
    private Long idCargo;
    private Long idUeb;

    private UebDto ueb;
    private CargoDto cargoDto;

    private List<ReporteDiarioLaboralWithoutList> reporteDiarioLaboralList;
}
