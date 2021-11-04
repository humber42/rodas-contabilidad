package cu.hash.rodascontabilidad.dto.classesWhithoutCollections;

import lombok.*;

@Data
@AllArgsConstructor
@Builder
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class CargoWithoutList {
    private long id;
    private String nombre;
    private String descripcion;
    private Double salarioBasicoMinimo;
    private Double salarioBasicoMaximo;
    private Double salarioMinimoMlc;
    private Double salarioMaximoMlc;
}
