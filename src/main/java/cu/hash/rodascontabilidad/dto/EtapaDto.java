package cu.hash.rodascontabilidad.dto;

import lombok.*;

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
}
