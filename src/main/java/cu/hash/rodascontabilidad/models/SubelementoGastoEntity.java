package cu.hash.rodascontabilidad.models;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "subelemento_gasto", schema = "public", catalog = "rodas-costos")
public class SubelementoGastoEntity {
    private long id;
    private String subelemento;
    private Boolean mostrar;
    private Long orden;
    private Long idElemento;
    private String codigoSubelemento;
    private String descripcion;

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
    @Column(name = "subelemento")
    public String getSubelemento() {
        return subelemento;
    }

    public void setSubelemento(String subelemento) {
        this.subelemento = subelemento;
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
    @Column(name = "id_elemento")
    public Long getIdElemento() {
        return idElemento;
    }

    public void setIdElemento(Long idElemento) {
        this.idElemento = idElemento;
    }

    @Basic
    @Column(name = "codigo_subelemento")
    public String getCodigoSubelemento() {
        return codigoSubelemento;
    }

    public void setCodigoSubelemento(String codigoSubelemento) {
        this.codigoSubelemento = codigoSubelemento;
    }

    @Basic
    @Column(name = "descripcion")
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SubelementoGastoEntity that = (SubelementoGastoEntity) o;
        return id == that.id &&
                Objects.equals(subelemento, that.subelemento) &&
                Objects.equals(mostrar, that.mostrar) &&
                Objects.equals(orden, that.orden) &&
                Objects.equals(idElemento, that.idElemento) &&
                Objects.equals(codigoSubelemento, that.codigoSubelemento) &&
                Objects.equals(descripcion, that.descripcion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, subelemento, mostrar, orden, idElemento, codigoSubelemento, descripcion);
    }
}
