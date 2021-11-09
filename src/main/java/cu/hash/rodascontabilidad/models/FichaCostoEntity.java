package cu.hash.rodascontabilidad.models;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "ficha_costo", schema = "public", catalog = "rodas-costos")
public class FichaCostoEntity {
    private long id;
    private Long idActividad;
    private Boolean aprobada;

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
    @Column(name = "aprobada")
    public Boolean getAprobada() {
        return aprobada;
    }

    public void setAprobada(Boolean aprobada) {
        this.aprobada = aprobada;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FichaCostoEntity that = (FichaCostoEntity) o;
        return id == that.id &&
                Objects.equals(idActividad, that.idActividad) &&
                Objects.equals(aprobada, that.aprobada);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, idActividad, aprobada);
    }
}
