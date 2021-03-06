package cu.hash.rodascontabilidad.models;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "orden_facturacion", schema = "public", catalog = "rodas-costos")
public class OrdenFacturacionEntity {
    private long id;
    private String codigo;
    private String proveedorServicio;
    private Long idUnidadMedida;
    private Long cantidad;
    private Double precioMn;
    private Double precioMlc;
    private Double importeMn;
    private Double importeMlc;
    private String descripcion;
    private Long idOrdenTrabajo;

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
    @Column(name = "codigo")
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    @Basic
    @Column(name = "proveedor_servicio")
    public String getProveedorServicio() {
        return proveedorServicio;
    }

    public void setProveedorServicio(String proveedorServicio) {
        this.proveedorServicio = proveedorServicio;
    }

    @Basic
    @Column(name = "id_unidad_medida")
    public Long getIdUnidadMedida() {
        return idUnidadMedida;
    }

    public void setIdUnidadMedida(Long idUnidadMedida) {
        this.idUnidadMedida = idUnidadMedida;
    }

    @Basic
    @Column(name = "cantidad")
    public Long getCantidad() {
        return cantidad;
    }

    public void setCantidad(Long cantidad) {
        this.cantidad = cantidad;
    }

    @Basic
    @Column(name = "precio_mn")
    public Double getPrecioMn() {
        return precioMn;
    }

    public void setPrecioMn(Double precioMn) {
        this.precioMn = precioMn;
    }

    @Basic
    @Column(name = "precio_mlc")
    public Double getPrecioMlc() {
        return precioMlc;
    }

    public void setPrecioMlc(Double precioMlc) {
        this.precioMlc = precioMlc;
    }

    @Basic
    @Column(name = "importe_mn")
    public Double getImporteMn() {
        return importeMn;
    }

    public void setImporteMn(Double importeMn) {
        this.importeMn = importeMn;
    }

    @Basic
    @Column(name = "importe_mlc")
    public Double getImporteMlc() {
        return importeMlc;
    }

    public void setImporteMlc(Double importeMlc) {
        this.importeMlc = importeMlc;
    }

    @Basic
    @Column(name = "descripcion")
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Basic
    @Column(name = "id_orden_trabajo")
    public Long getIdOrdenTrabajo() {
        return idOrdenTrabajo;
    }

    public void setIdOrdenTrabajo(Long idOrdenTrabajo) {
        this.idOrdenTrabajo = idOrdenTrabajo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrdenFacturacionEntity that = (OrdenFacturacionEntity) o;
        return id == that.id &&
                Objects.equals(codigo, that.codigo) &&
                Objects.equals(proveedorServicio, that.proveedorServicio) &&
                Objects.equals(idUnidadMedida, that.idUnidadMedida) &&
                Objects.equals(cantidad, that.cantidad) &&
                Objects.equals(precioMn, that.precioMn) &&
                Objects.equals(precioMlc, that.precioMlc) &&
                Objects.equals(importeMn, that.importeMn) &&
                Objects.equals(importeMlc, that.importeMlc) &&
                Objects.equals(descripcion, that.descripcion) &&
                Objects.equals(idOrdenTrabajo, that.idOrdenTrabajo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, codigo, proveedorServicio, idUnidadMedida, cantidad, precioMn, precioMlc, importeMn, importeMlc, descripcion, idOrdenTrabajo);
    }
}
