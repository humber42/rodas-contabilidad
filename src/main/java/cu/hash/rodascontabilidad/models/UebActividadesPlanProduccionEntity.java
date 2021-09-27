package cu.hash.rodascontabilidad.models;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "ueb_actividades_plan_produccion", schema = "public", catalog = "rodas-contabilidad")
public class UebActividadesPlanProduccionEntity {
    private long id;
    private Long idPlanProduccion;
    private Long idActividad;

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
    @Column(name = "id_plan_produccion")
    public Long getIdPlanProduccion() {
        return idPlanProduccion;
    }

    public void setIdPlanProduccion(Long idPlanProduccion) {
        this.idPlanProduccion = idPlanProduccion;
    }

    @Basic
    @Column(name = "id_actividad")
    public Long getIdActividad() {
        return idActividad;
    }

    public void setIdActividad(Long idActividad) {
        this.idActividad = idActividad;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UebActividadesPlanProduccionEntity that = (UebActividadesPlanProduccionEntity) o;
        return id == that.id &&
                Objects.equals(idPlanProduccion, that.idPlanProduccion) &&
                Objects.equals(idActividad, that.idActividad);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, idPlanProduccion, idActividad);
    }
}
