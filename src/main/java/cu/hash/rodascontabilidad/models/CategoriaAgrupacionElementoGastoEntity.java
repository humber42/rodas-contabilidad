package cu.hash.rodascontabilidad.models;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "categoria_agrupacion_elemento_gasto", schema = "public", catalog = "rodas-contabilidad")
public class CategoriaAgrupacionElementoGastoEntity {
    private long id;
    private Long idCategoriaAgrupacion;
    private Long idElementoGasto;

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
    @Column(name = "id_categoria_agrupacion")
    public Long getIdCategoriaAgrupacion() {
        return idCategoriaAgrupacion;
    }

    public void setIdCategoriaAgrupacion(Long idCategoriaAgrupacion) {
        this.idCategoriaAgrupacion = idCategoriaAgrupacion;
    }

    @Basic
    @Column(name = "id_elemento_gasto")
    public Long getIdElementoGasto() {
        return idElementoGasto;
    }

    public void setIdElementoGasto(Long idElementoGasto) {
        this.idElementoGasto = idElementoGasto;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CategoriaAgrupacionElementoGastoEntity that = (CategoriaAgrupacionElementoGastoEntity) o;
        return id == that.id &&
                Objects.equals(idCategoriaAgrupacion, that.idCategoriaAgrupacion) &&
                Objects.equals(idElementoGasto, that.idElementoGasto);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, idCategoriaAgrupacion, idElementoGasto);
    }
}
