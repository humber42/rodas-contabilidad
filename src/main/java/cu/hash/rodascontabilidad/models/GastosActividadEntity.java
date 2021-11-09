package cu.hash.rodascontabilidad.models;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "gastos_actividad", schema = "public", catalog = "rodas-costos")
public class GastosActividadEntity {
    private long id;
    private Long idGastoDirecto;
    private Long idActividad;
    private Long idGastoIndirecto;

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
    @Column(name = "id_gasto_directo")
    public Long getIdGastoDirecto() {
        return idGastoDirecto;
    }

    public void setIdGastoDirecto(Long idGastoDirecto) {
        this.idGastoDirecto = idGastoDirecto;
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
    @Column(name = "id_gasto_indirecto")
    public Long getIdGastoIndirecto() {
        return idGastoIndirecto;
    }

    public void setIdGastoIndirecto(Long idGastoIndirecto) {
        this.idGastoIndirecto = idGastoIndirecto;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GastosActividadEntity that = (GastosActividadEntity) o;
        return id == that.id &&
                Objects.equals(idGastoDirecto, that.idGastoDirecto) &&
                Objects.equals(idActividad, that.idActividad) &&
                Objects.equals(idGastoIndirecto, that.idGastoIndirecto);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, idGastoDirecto, idActividad, idGastoIndirecto);
    }
}
