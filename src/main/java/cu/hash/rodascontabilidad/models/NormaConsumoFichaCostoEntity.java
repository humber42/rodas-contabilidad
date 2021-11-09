package cu.hash.rodascontabilidad.models;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "norma_consumo_ficha_costo", schema = "public", catalog = "rodas-costos")
public class NormaConsumoFichaCostoEntity {
    private long id;
    private Long idNormaConsumo;
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
    @Column(name = "id_norma_consumo")
    public Long getIdNormaConsumo() {
        return idNormaConsumo;
    }

    public void setIdNormaConsumo(Long idNormaConsumo) {
        this.idNormaConsumo = idNormaConsumo;
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
        NormaConsumoFichaCostoEntity that = (NormaConsumoFichaCostoEntity) o;
        return id == that.id &&
                Objects.equals(idNormaConsumo, that.idNormaConsumo) &&
                Objects.equals(idFichaCosto, that.idFichaCosto);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, idNormaConsumo, idFichaCosto);
    }
}
