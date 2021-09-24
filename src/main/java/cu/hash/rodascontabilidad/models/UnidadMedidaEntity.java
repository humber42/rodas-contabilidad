package cu.hash.rodascontabilidad.models;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "unidad_medida", schema = "public", catalog = "rodas-contabilidad")
public class UnidadMedidaEntity {
    private long id;
    private String codigoUnidadMedida;
    private String nombre;
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
    @Column(name = "codigo_unidad_medida")
    public String getCodigoUnidadMedida() {
        return codigoUnidadMedida;
    }

    public void setCodigoUnidadMedida(String codigoUnidadMedida) {
        this.codigoUnidadMedida = codigoUnidadMedida;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UnidadMedidaEntity that = (UnidadMedidaEntity) o;
        return id == that.id &&
                Objects.equals(codigoUnidadMedida, that.codigoUnidadMedida) &&
                Objects.equals(nombre, that.nombre) &&
                Objects.equals(descripcion, that.descripcion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, codigoUnidadMedida, nombre, descripcion);
    }
}
