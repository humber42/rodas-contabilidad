package cu.hash.rodascontabilidad.models;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "ueb", schema = "public", catalog = "rodas-costos")
public class UebEntity {
    private long id;
    private String codigoUeb;
    private String nombreUeb;
    private String descripcion;
    private Double coeficienteEstMn;
    private Double coeficienteEstMlc;
    private Double pagoResultadoPercent;

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
    @Column(name = "codigo_ueb")
    public String getCodigoUeb() {
        return codigoUeb;
    }

    public void setCodigoUeb(String codigoUeb) {
        this.codigoUeb = codigoUeb;
    }

    @Basic
    @Column(name = "nombre_ueb")
    public String getNombreUeb() {
        return nombreUeb;
    }

    public void setNombreUeb(String nombreUeb) {
        this.nombreUeb = nombreUeb;
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
    @Column(name = "coeficiente_est_mn")
    public Double getCoeficienteEstMn() {
        return coeficienteEstMn;
    }

    public void setCoeficienteEstMn(Double coeficienteEstMn) {
        this.coeficienteEstMn = coeficienteEstMn;
    }

    @Basic
    @Column(name = "coeficiente_est_mlc")
    public Double getCoeficienteEstMlc() {
        return coeficienteEstMlc;
    }

    public void setCoeficienteEstMlc(Double coeficienteEstMlc) {
        this.coeficienteEstMlc = coeficienteEstMlc;
    }

    @Basic
    @Column(name = "pago_resultado_percent")
    public Double getPagoResultadoPercent() {
        return pagoResultadoPercent;
    }

    public void setPagoResultadoPercent(Double pagoResultadoPercent) {
        this.pagoResultadoPercent = pagoResultadoPercent;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UebEntity uebEntity = (UebEntity) o;
        return id == uebEntity.id &&
                Objects.equals(codigoUeb, uebEntity.codigoUeb) &&
                Objects.equals(nombreUeb, uebEntity.nombreUeb) &&
                Objects.equals(descripcion, uebEntity.descripcion) &&
                Objects.equals(coeficienteEstMn, uebEntity.coeficienteEstMn) &&
                Objects.equals(coeficienteEstMlc, uebEntity.coeficienteEstMlc) &&
                Objects.equals(pagoResultadoPercent, uebEntity.pagoResultadoPercent);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, codigoUeb, nombreUeb, descripcion, coeficienteEstMn, coeficienteEstMlc, pagoResultadoPercent);
    }
}
