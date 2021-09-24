package cu.hash.rodascontabilidad.models;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "categoria_agrupacion", schema = "public", catalog = "rodas-contabilidad")
public class CategoriaAgrupacionEntity {
    private long id;
    private String nombre;
    private String descripcion;
    private long orden;
    private Boolean mostrarFichaCosto;

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
    @Column(name = "orden")
    public long getOrden() {
        return orden;
    }

    public void setOrden(long orden) {
        this.orden = orden;
    }

    @Basic
    @Column(name = "mostrar_ficha_costo")
    public Boolean getMostrarFichaCosto() {
        return mostrarFichaCosto;
    }

    public void setMostrarFichaCosto(Boolean mostrarFichaCosto) {
        this.mostrarFichaCosto = mostrarFichaCosto;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CategoriaAgrupacionEntity that = (CategoriaAgrupacionEntity) o;
        return id == that.id &&
                orden == that.orden &&
                Objects.equals(nombre, that.nombre) &&
                Objects.equals(descripcion, that.descripcion) &&
                Objects.equals(mostrarFichaCosto, that.mostrarFichaCosto);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nombre, descripcion, orden, mostrarFichaCosto);
    }
}
