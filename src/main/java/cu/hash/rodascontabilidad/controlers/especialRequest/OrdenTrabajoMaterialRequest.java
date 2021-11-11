package cu.hash.rodascontabilidad.controlers.especialRequest;

import lombok.*;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@EqualsAndHashCode
@ToString
public class OrdenTrabajoMaterialRequest {
    private long ordenTrabajoId;
    private List<MaterialEspecial> especialList;
}
