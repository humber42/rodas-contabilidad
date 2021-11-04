package cu.hash.rodascontabilidad.dto;

import cu.hash.rodascontabilidad.dto.classesWhithoutCollections.CargoWithoutList;
import lombok.*;

@AllArgsConstructor
@Data
@Builder
@NoArgsConstructor
@EqualsAndHashCode
public class PersonasAutorizadasDto {
    private long id;
    private String idUsuario;
    private long idCargo;

    private UserDto usuario;
    private CargoWithoutList cargoDto;
}
