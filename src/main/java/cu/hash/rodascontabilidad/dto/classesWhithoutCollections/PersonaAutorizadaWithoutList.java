package cu.hash.rodascontabilidad.dto.classesWhithoutCollections;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Data
public class PersonaAutorizadaWithoutList {
    private long id;
    private String idUsuario;
    private long idCargo;
}
