package cu.hash.rodascontabilidad.models;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "cargo", schema = "public", catalog = "rodas-costos")
public class CargoEntity {
    private long id;
    private String nombre;
    private String descripcion;
    private Double salarioBasicoMinimo;
    private Double salarioBasicoMaximo;
    private Double salarioMinimoMlc;
    private Double salarioMaximoMlc;

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
    @Column(name = "salario_basico_minimo")
    public Double getSalarioBasicoMinimo() {
        return salarioBasicoMinimo;
    }

    public void setSalarioBasicoMinimo(Double salarioBasicoMinimo) {
        this.salarioBasicoMinimo = salarioBasicoMinimo;
    }

    @Basic
    @Column(name = "salario_basico_maximo")
    public Double getSalarioBasicoMaximo() {
        return salarioBasicoMaximo;
    }

    public void setSalarioBasicoMaximo(Double salarioBasicoMaximo) {
        this.salarioBasicoMaximo = salarioBasicoMaximo;
    }

    @Basic
    @Column(name = "salario_minimo_mlc")
    public Double getSalarioMinimoMlc() {
        return salarioMinimoMlc;
    }

    public void setSalarioMinimoMlc(Double salarioMinimoMlc) {
        this.salarioMinimoMlc = salarioMinimoMlc;
    }

    @Basic
    @Column(name = "salario_maximo_mlc")
    public Double getSalarioMaximoMlc() {
        return salarioMaximoMlc;
    }

    public void setSalarioMaximoMlc(Double salarioMaximoMlc) {
        this.salarioMaximoMlc = salarioMaximoMlc;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CargoEntity that = (CargoEntity) o;
        return id == that.id &&
                Objects.equals(nombre, that.nombre) &&
                Objects.equals(descripcion, that.descripcion) &&
                Objects.equals(salarioBasicoMinimo, that.salarioBasicoMinimo) &&
                Objects.equals(salarioBasicoMaximo, that.salarioBasicoMaximo) &&
                Objects.equals(salarioMinimoMlc, that.salarioMinimoMlc) &&
                Objects.equals(salarioMaximoMlc, that.salarioMaximoMlc);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nombre, descripcion, salarioBasicoMinimo, salarioBasicoMaximo, salarioMinimoMlc, salarioMaximoMlc);
    }
}
