package cu.hash.rodascontabilidad.dto;

import lombok.*;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
public class EtapaDto {
    private long id;
    private String nombre;
    private String descripcion;
    private Long orden;

    private List<UebDto> uebList;
}
