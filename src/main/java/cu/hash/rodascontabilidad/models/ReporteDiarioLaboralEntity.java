package cu.hash.rodascontabilidad.models;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "reporte_diario_laboral", schema = "public", catalog = "rodas-costos")
public class ReporteDiarioLaboralEntity {
    private long id;
    private Long idTrabajador;
    private Date fecha;
    private Long cantHoras;
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
    @Column(name = "id_trabajador")
    public Long getIdTrabajador() {
        return idTrabajador;
    }

    public void setIdTrabajador(Long idTrabajador) {
        this.idTrabajador = idTrabajador;
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
    @Column(name = "cant_horas")
    public Long getCantHoras() {
        return cantHoras;
    }

    public void setCantHoras(Long cantHoras) {
        this.cantHoras = cantHoras;
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
        ReporteDiarioLaboralEntity that = (ReporteDiarioLaboralEntity) o;
        return id == that.id &&
                Objects.equals(idTrabajador, that.idTrabajador) &&
                Objects.equals(fecha, that.fecha) &&
                Objects.equals(cantHoras, that.cantHoras) &&
                Objects.equals(idOrdenTrabajo, that.idOrdenTrabajo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, idTrabajador, fecha, cantHoras, idOrdenTrabajo);
    }
}
