package cu.hash.rodascontabilidad.controlers.especialRequest;

import lombok.*;

import java.sql.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@EqualsAndHashCode
@ToString
public class MaterialEspecial {
    private Date fecha;
    private long id;
    private double importeMLC;
    private double importeMN;
    private String noVentaSalida;
    private double total;
}
