package cu.hash.rodascontabilidad.models;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "plan_produccion", schema = "public", catalog = "rodas-costos")
public class PlanProduccionEntity {
    private long id;
    private Long idUeb;

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
    @Column(name = "id_ueb")
    public Long getIdUeb() {
        return idUeb;
    }

    public void setIdUeb(Long idUeb) {
        this.idUeb = idUeb;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PlanProduccionEntity that = (PlanProduccionEntity) o;
        return id == that.id &&
                Objects.equals(idUeb, that.idUeb);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, idUeb);
    }
}
