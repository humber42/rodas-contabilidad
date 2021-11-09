package cu.hash.rodascontabilidad.models;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "categoria_agrupacion_indirecta_subelemento_gasto", schema = "public", catalog = "rodas-costos")
public class CategoriaAgrupacionIndirectaSubelementoGastoEntity {
    private long id;
    private Long idCategoriaAgrupacionIndirecta;
    private Long idSubelementoGasto;
    private Long orden;

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
    @Column(name = "id_categoria_agrupacion_indirecta")
    public Long getIdCategoriaAgrupacionIndirecta() {
        return idCategoriaAgrupacionIndirecta;
    }

    public void setIdCategoriaAgrupacionIndirecta(Long idCategoriaAgrupacionIndirecta) {
        this.idCategoriaAgrupacionIndirecta = idCategoriaAgrupacionIndirecta;
    }

    @Basic
    @Column(name = "id_subelemento_gasto")
    public Long getIdSubelementoGasto() {
        return idSubelementoGasto;
    }

    public void setIdSubelementoGasto(Long idSubelementoGasto) {
        this.idSubelementoGasto = idSubelementoGasto;
    }

    @Basic
    @Column(name = "orden")
    public Long getOrden() {
        return orden;
    }

    public void setOrden(Long orden) {
        this.orden = orden;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CategoriaAgrupacionIndirectaSubelementoGastoEntity that = (CategoriaAgrupacionIndirectaSubelementoGastoEntity) o;
        return id == that.id &&
                Objects.equals(idCategoriaAgrupacionIndirecta, that.idCategoriaAgrupacionIndirecta) &&
                Objects.equals(idSubelementoGasto, that.idSubelementoGasto) &&
                Objects.equals(orden, that.orden);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, idCategoriaAgrupacionIndirecta, idSubelementoGasto, orden);
    }
}
