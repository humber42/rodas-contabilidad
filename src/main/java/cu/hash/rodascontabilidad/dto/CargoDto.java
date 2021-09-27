package cu.hash.rodascontabilidad.dto;

import lombok.*;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@EqualsAndHashCode
public class CargoDto {
    private long id;
    private String nombre;
    private String descripcion;
    private Double salarioBasicoMinimo;
    private Double salarioBasicoMaximo;
    private Double salarioMinimoMlc;
    private Double salarioMaximoMlc;

    private List<PersonasAutorizadasDto> personasAutorizadasList;

}
