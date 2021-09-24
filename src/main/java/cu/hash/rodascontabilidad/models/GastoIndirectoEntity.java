package cu.hash.rodascontabilidad.models;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "gasto_indirecto", schema = "public", catalog = "rodas-contabilidad")
public class GastoIndirectoEntity {
    private long id;
    private String codigo;
    private String nombre;
    private String descripcion;
    private Long idTipoGastoIndirecto;

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
    @Column(name = "codigo")
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    @Basic
    @Column(name = "nombre")
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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
    @Column(name = "id_tipo_gasto_indirecto")
    public Long getIdTipoGastoIndirecto() {
        return idTipoGastoIndirecto;
    }

    public void setIdTipoGastoIndirecto(Long idTipoGastoIndirecto) {
        this.idTipoGastoIndirecto = idTipoGastoIndirecto;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GastoIndirectoEntity that = (GastoIndirectoEntity) o;
        return id == that.id &&
                Objects.equals(codigo, that.codigo) &&
                Objects.equals(nombre, that.nombre) &&
                Objects.equals(descripcion, that.descripcion) &&
                Objects.equals(idTipoGastoIndirecto, that.idTipoGastoIndirecto);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, codigo, nombre, descripcion, idTipoGastoIndirecto);
    }
}
