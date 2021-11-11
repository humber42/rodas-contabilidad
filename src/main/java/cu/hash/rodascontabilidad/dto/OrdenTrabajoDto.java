package cu.hash.rodascontabilidad.dto;

import cu.hash.rodascontabilidad.dto.classesWhithoutCollections.MaterialWithoutList;
import cu.hash.rodascontabilidad.dto.classesWhithoutCollections.OrdenFacturacionWithoutList;
import lombok.*;

import java.sql.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@EqualsAndHashCode
public class OrdenTrabajoDto {
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

    //Entities
    private ActividadDto actividad;
    private ClienteDto cliente;
    private UebDto ueb;
    private CargoDto cargo;
    private FichaCostoDto fichaCostoDto;

    //Lists by grouping
    private List<MaterialWithoutList> materialList;
    private List<OrdenFacturacionWithoutList> ordenFacturacionList;
}
