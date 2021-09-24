package cu.hash.rodascontabilidad.models;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "orden_trabajo", schema = "public", catalog = "rodas-contabilidad")
public class OrdenTrabajoEntity {
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

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "id_actividad")
    public Long getIdActividad() {
        return idActividad;
    }

    public void setIdActividad(Long idActividad) {
        this.idActividad = idActividad;
    }

    @Basic
    @Column(name = "id_cliente")
    public Long getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Long idCliente) {
        this.idCliente = idCliente;
    }

    @Basic
    @Column(name = "numero_contrato")
    public String getNumeroContrato() {
        return numeroContrato;
    }

    public void setNumeroContrato(String numeroContrato) {
        this.numeroContrato = numeroContrato;
    }

    @Basic
    @Column(name = "vendedor")
    public String getVendedor() {
        return vendedor;
    }

    public void setVendedor(String vendedor) {
        this.vendedor = vendedor;
    }

    @Basic
    @Column(name = "observaciones")
    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    @Basic
    @Column(name = "orden_trabajo")
    public String getOrdenTrabajo() {
        return ordenTrabajo;
    }

    public void setOrdenTrabajo(String ordenTrabajo) {
        this.ordenTrabajo = ordenTrabajo;
    }

    @Basic
    @Column(name = "fecha_entrega")
    public Date getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(Date fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    @Basic
    @Column(name = "fecha_confeccion")
    public Date getFechaConfeccion() {
        return fechaConfeccion;
    }

    public void setFechaConfeccion(Date fechaConfeccion) {
        this.fechaConfeccion = fechaConfeccion;
    }

    @Basic
    @Column(name = "id_ueb")
    public Long getIdUeb() {
        return idUeb;
    }

    public void setIdUeb(Long idUeb) {
        this.idUeb = idUeb;
    }

    @Basic
    @Column(name = "nombre_aprobacion")
    public String getNombreAprobacion() {
        return nombreAprobacion;
    }

    public void setNombreAprobacion(String nombreAprobacion) {
        this.nombreAprobacion = nombreAprobacion;
    }

    @Basic
    @Column(name = "descripcion_servicio")
    public String getDescripcionServicio() {
        return descripcionServicio;
    }

    public void setDescripcionServicio(String descripcionServicio) {
        this.descripcionServicio = descripcionServicio;
    }

    @Basic
    @Column(name = "motivo_servicio")
    public String getMotivoServicio() {
        return motivoServicio;
    }

    public void setMotivoServicio(String motivoServicio) {
        this.motivoServicio = motivoServicio;
    }

    @Basic
    @Column(name = "nombre_conformidad")
    public String getNombreConformidad() {
        return nombreConformidad;
    }

    public void setNombreConformidad(String nombreConformidad) {
        this.nombreConformidad = nombreConformidad;
    }

    @Basic
    @Column(name = "id_cargo")
    public Long getIdCargo() {
        return idCargo;
    }

    public void setIdCargo(Long idCargo) {
        this.idCargo = idCargo;
    }

    @Basic
    @Column(name = "identidad_usuario")
    public String getIdentidadUsuario() {
        return identidadUsuario;
    }

    public void setIdentidadUsuario(String identidadUsuario) {
        this.identidadUsuario = identidadUsuario;
    }

    @Basic
    @Column(name = "cerrada")
    public Boolean getCerrada() {
        return cerrada;
    }

    public void setCerrada(Boolean cerrada) {
        this.cerrada = cerrada;
    }

    @Basic
    @Column(name = "id_ficha_costo")
    public Long getIdFichaCosto() {
        return idFichaCosto;
    }

    public void setIdFichaCosto(Long idFichaCosto) {
        this.idFichaCosto = idFichaCosto;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrdenTrabajoEntity that = (OrdenTrabajoEntity) o;
        return id == that.id &&
                Objects.equals(idActividad, that.idActividad) &&
                Objects.equals(idCliente, that.idCliente) &&
                Objects.equals(numeroContrato, that.numeroContrato) &&
                Objects.equals(vendedor, that.vendedor) &&
                Objects.equals(observaciones, that.observaciones) &&
                Objects.equals(ordenTrabajo, that.ordenTrabajo) &&
                Objects.equals(fechaEntrega, that.fechaEntrega) &&
                Objects.equals(fechaConfeccion, that.fechaConfeccion) &&
                Objects.equals(idUeb, that.idUeb) &&
                Objects.equals(nombreAprobacion, that.nombreAprobacion) &&
                Objects.equals(descripcionServicio, that.descripcionServicio) &&
                Objects.equals(motivoServicio, that.motivoServicio) &&
                Objects.equals(nombreConformidad, that.nombreConformidad) &&
                Objects.equals(idCargo, that.idCargo) &&
                Objects.equals(identidadUsuario, that.identidadUsuario) &&
                Objects.equals(cerrada, that.cerrada) &&
                Objects.equals(idFichaCosto, that.idFichaCosto);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, idActividad, idCliente, numeroContrato, vendedor, observaciones, ordenTrabajo, fechaEntrega, fechaConfeccion, idUeb, nombreAprobacion, descripcionServicio, motivoServicio, nombreConformidad, idCargo, identidadUsuario, cerrada, idFichaCosto);
    }
}
