package cu.hash.rodascontabilidad.models;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "trabajador", schema = "public", catalog = "rodas-costos")
public class TrabajadorEntity {
    private long id;
    private String nombre;
    private Long idCargo;
    private Long idUeb;

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
    @Column(name = "id_cargo")
    public Long getIdCargo() {
        return idCargo;
    }

    public void setIdCargo(Long idCargo) {
        this.idCargo = idCargo;
    }

    @Basic
    @Column(name = "id_ueb")
    public Long getIdUeb() {
        return idUeb;
    }

    public void setIdUeb(Long idUeb) {
        this.idUeb = idUeb;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TrabajadorEntity that = (TrabajadorEntity) o;
        return id == that.id &&
                Objects.equals(nombre, that.nombre) &&
                Objects.equals(idCargo, that.idCargo) &&
                Objects.equals(idUeb, that.idUeb);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nombre, idCargo, idUeb);
    }
}
