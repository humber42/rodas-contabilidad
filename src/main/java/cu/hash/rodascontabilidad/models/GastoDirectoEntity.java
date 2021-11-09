package cu.hash.rodascontabilidad.models;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "gasto_directo", schema = "public", catalog = "rodas-costos")
public class GastoDirectoEntity {
    private long id;
    private String codigo;
    private String nombre;
    private String descripcion;
    private Long idTipoGastoDirecto;
    private double precioMn;
    private double precioCl;
    private Long idUnidadMedida;
    private Long idElementoGasto;
    private Long idSubelemento;

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
    @Column(name = "id_tipo_gasto_directo")
    public Long getIdTipoGastoDirecto() {
        return idTipoGastoDirecto;
    }

    public void setIdTipoGastoDirecto(Long idTipoGastoDirecto) {
        this.idTipoGastoDirecto = idTipoGastoDirecto;
    }

    @Basic
    @Column(name = "precio_mn")
    public double getPrecioMn() {
        return precioMn;
    }

    public void setPrecioMn(double precioMn) {
        this.precioMn = precioMn;
    }

    @Basic
    @Column(name = "precio_cl")
    public double getPrecioCl() {
        return precioCl;
    }

    public void setPrecioCl(double precioCl) {
        this.precioCl = precioCl;
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
    @Column(name = "id_elemento_gasto")
    public Long getIdElementoGasto() {
        return idElementoGasto;
    }

    public void setIdElementoGasto(Long idElementoGasto) {
        this.idElementoGasto = idElementoGasto;
    }

    @Basic
    @Column(name = "id_subelemento")
    public Long getIdSubelemento() {
        return idSubelemento;
    }

    public void setIdSubelemento(Long idSubelemento) {
        this.idSubelemento = idSubelemento;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GastoDirectoEntity that = (GastoDirectoEntity) o;
        return id == that.id &&
                Double.compare(that.precioMn, precioMn) == 0 &&
                Double.compare(that.precioCl, precioCl) == 0 &&
                Objects.equals(codigo, that.codigo) &&
                Objects.equals(nombre, that.nombre) &&
                Objects.equals(descripcion, that.descripcion) &&
                Objects.equals(idTipoGastoDirecto, that.idTipoGastoDirecto) &&
                Objects.equals(idUnidadMedida, that.idUnidadMedida) &&
                Objects.equals(idElementoGasto, that.idElementoGasto) &&
                Objects.equals(idSubelemento, that.idSubelemento);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, codigo, nombre, descripcion, idTipoGastoDirecto, precioMn, precioCl, idUnidadMedida, idElementoGasto, idSubelemento);
    }
}
