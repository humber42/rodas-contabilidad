package cu.hash.rodascontabilidad.dto;

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
}
