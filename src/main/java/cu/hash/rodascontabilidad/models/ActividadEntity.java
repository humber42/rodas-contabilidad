package cu.hash.rodascontabilidad.models;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "actividad", schema = "public", catalog = "rodas-costos")
public class ActividadEntity {
    private long id;
    private String codigo;
    private Long idTipoActividad;
    private String nombre;
    private Long idUnidadMedida;
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
    @Column(name = "codigo")
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    @Basic
    @Column(name = "id_tipo_actividad")
    public Long getIdTipoActividad() {
        return idTipoActividad;
    }

    public void setIdTipoActividad(Long idTipoActividad) {
        this.idTipoActividad = idTipoActividad;
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
    @Column(name = "id_unidad_medida")
    public Long getIdUnidadMedida() {
        return idUnidadMedida;
    }

    public void setIdUnidadMedida(Long idUnidadMedida) {
        this.idUnidadMedida = idUnidadMedida;
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
        ActividadEntity that = (ActividadEntity) o;
        return id == that.id &&
                Objects.equals(codigo, that.codigo) &&
                Objects.equals(idTipoActividad, that.idTipoActividad) &&
                Objects.equals(nombre, that.nombre) &&
                Objects.equals(idUnidadMedida, that.idUnidadMedida) &&
                Objects.equals(descripcion, that.descripcion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, codigo, idTipoActividad, nombre, idUnidadMedida, descripcion);
    }
}
