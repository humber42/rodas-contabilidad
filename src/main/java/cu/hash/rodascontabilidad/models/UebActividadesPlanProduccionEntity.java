package cu.hash.rodascontabilidad.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "ueb_actividades_plan_produccion", schema = "public", catalog = "rodas-contabilidad")
public class UebActividadesPlanProduccionEntity {
    private long id;

    @Id
    @Column(name = "id")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UebActividadesPlanProduccionEntity that = (UebActividadesPlanProduccionEntity) o;
        return id == that.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
