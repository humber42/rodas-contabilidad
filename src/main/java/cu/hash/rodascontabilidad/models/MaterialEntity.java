package cu.hash.rodascontabilidad.models;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "material", schema = "public", catalog = "rodas-contabilidad")
public class MaterialEntity {
    private long id;
    private Date fecha;
    private Double importeMn;
    private Double importeMlc;
    private String noVSalida;
    private Double total;
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
    @Column(name = "fecha")
    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    @Basic
    @Column(name = "importeMN")
    public Double getImporteMn() {
        return importeMn;
    }

    public void setImporteMn(Double importeMn) {
        this.importeMn = importeMn;
    }

    @Basic
    @Column(name = "importeMLC")
    public Double getImporteMlc() {
        return importeMlc;
    }

    public void setImporteMlc(Double importeMlc) {
        this.importeMlc = importeMlc;
    }

    @Basic
    @Column(name = "no_v_salida")
    public String getNoVSalida() {
        return noVSalida;
    }

    public void setNoVSalida(String noVSalida) {
        this.noVSalida = noVSalida;
    }

    @Basic
    @Column(name = "total")
    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
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
        MaterialEntity that = (MaterialEntity) o;
        return id == that.id &&
                Objects.equals(fecha, that.fecha) &&
                Objects.equals(importeMn, that.importeMn) &&
                Objects.equals(importeMlc, that.importeMlc) &&
                Objects.equals(noVSalida, that.noVSalida) &&
                Objects.equals(total, that.total) &&
                Objects.equals(idOrdenTrabajo, that.idOrdenTrabajo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, fecha, importeMn, importeMlc, noVSalida, total, idOrdenTrabajo);
    }
}
