package cu.hash.rodascontabilidad.dto;

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

    private List<ReporteDiarioLaboralDto> reporteDiarioLaboralList;
}
