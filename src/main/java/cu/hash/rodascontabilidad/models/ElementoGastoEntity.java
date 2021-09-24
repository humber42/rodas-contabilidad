package cu.hash.rodascontabilidad.models;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "elemento_gasto", schema = "public", catalog = "rodas-contabilidad")
public class ElementoGastoEntity {
    private long id;
    private String elemento;
    private Boolean mostrar;
    private Long orden;
    private String descripcion;
    private String codigoElemento;

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
    @Column(name = "elemento")
    public String getElemento() {
        return elemento;
    }

    public void setElemento(String elemento) {
        this.elemento = elemento;
    }

    @Basic
    @Column(name = "mostrar")
    public Boolean getMostrar() {
        return mostrar;
    }

    public void setMostrar(Boolean mostrar) {
        this.mostrar = mostrar;
    }

    @Basic
    @Column(name = "orden")
    public Long getOrden() {
        return orden;
    }

    public void setOrden(Long orden) {
        this.orden = orden;
    }

    @Basic
    @Column(name = "descripcion")
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Basic
    @Column(name = "codigo_elemento")
    public String getCodigoElemento() {
        return codigoElemento;
    }

    public void setCodigoElemento(String codigoElemento) {
        this.codigoElemento = codigoElemento;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ElementoGastoEntity that = (ElementoGastoEntity) o;
        return id == that.id &&
                Objects.equals(elemento, that.elemento) &&
                Objects.equals(mostrar, that.mostrar) &&
                Objects.equals(orden, that.orden) &&
                Objects.equals(descripcion, that.descripcion) &&
                Objects.equals(codigoElemento, that.codigoElemento);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, elemento, mostrar, orden, descripcion, codigoElemento);
    }
}
