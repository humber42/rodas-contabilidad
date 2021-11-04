package cu.hash.rodascontabilidad.dto;

import cu.hash.rodascontabilidad.dto.classesWhithoutCollections.CargoWithoutList;
import cu.hash.rodascontabilidad.dto.classesWhithoutCollections.ReporteDiarioLaboralWithoutList;
import cu.hash.rodascontabilidad.dto.classesWhithoutCollections.UebWithoutList;
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

    private UebWithoutList ueb;
    private CargoWithoutList cargoDto;

    private List<ReporteDiarioLaboralWithoutList> reporteDiarioLaboralList;
}
