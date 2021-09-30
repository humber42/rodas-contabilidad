package cu.hash.rodascontabilidad.dto.classesWhithoutCollections;

import lombok.*;

import java.sql.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@EqualsAndHashCode
public class OrdenTrabajoWhithoutList {
    private long id;
    private Long idActividad;
    private Long idCliente;
    private String numeroContrato;
    private String vendedor;
    private String observaciones;
    private String ordenTrabajo;
    private Date fechaEntrega;
    private Date fechaConfeccion;
    private Long idUeb;
    private String nombreAprobacion;
    private String descripcionServicio;
    private String motivoServicio;
    private String nombreConformidad;
    private Long idCargo;
    private String identidadUsuario;
    private Boolean cerrada;
    private Long idFichaCosto;

}
