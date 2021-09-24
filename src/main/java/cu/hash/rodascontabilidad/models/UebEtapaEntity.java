package cu.hash.rodascontabilidad.models;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "ueb_etapa", schema = "public", catalog = "rodas-contabilidad")
public class UebEtapaEntity {
    private long id;
    private Long idUeb;
    private Long idEtapa;

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

    @Basic
    @Column(name = "id_etapa")
    public Long getIdEtapa() {
        return idEtapa;
    }

    public void setIdEtapa(Long idEtapa) {
        this.idEtapa = idEtapa;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UebEtapaEntity that = (UebEtapaEntity) o;
        return id == that.id &&
                Objects.equals(idUeb, that.idUeb) &&
                Objects.equals(idEtapa, that.idEtapa);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, idUeb, idEtapa);
    }
}
