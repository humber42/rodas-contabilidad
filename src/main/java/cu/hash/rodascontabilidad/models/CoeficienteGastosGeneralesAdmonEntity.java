package cu.hash.rodascontabilidad.models;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "coeficiente_gastos_generales_admon", schema = "public", catalog = "rodas-contabilidad")
public class CoeficienteGastosGeneralesAdmonEntity {
    private long id;
    private Double coeficienteGastoTotalMn;
    private Double coeficienteGastoTotalMlc;
    private Double coeficienteGastoTotalMt;
    private Double coeficienteGastoDeprecMn;
    private Double coeficienteGastoDeprecMlc;
    private Double coeficienteGastoDeprecMt;
    private Double coeficienteGastoMantenimientoYRepMn;
    private Double coeficienteGastoMantenimientoYRepMlc;
    private Double coeficienteGastoMantenimientoYRepMt;

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
    @Column(name = "coeficiente_gasto_total_mn")
    public Double getCoeficienteGastoTotalMn() {
        return coeficienteGastoTotalMn;
    }

    public void setCoeficienteGastoTotalMn(Double coeficienteGastoTotalMn) {
        this.coeficienteGastoTotalMn = coeficienteGastoTotalMn;
    }

    @Basic
    @Column(name = "coeficiente_gasto_total_mlc")
    public Double getCoeficienteGastoTotalMlc() {
        return coeficienteGastoTotalMlc;
    }

    public void setCoeficienteGastoTotalMlc(Double coeficienteGastoTotalMlc) {
        this.coeficienteGastoTotalMlc = coeficienteGastoTotalMlc;
    }

    @Basic
    @Column(name = "coeficiente_gasto_total_mt")
    public Double getCoeficienteGastoTotalMt() {
        return coeficienteGastoTotalMt;
    }

    public void setCoeficienteGastoTotalMt(Double coeficienteGastoTotalMt) {
        this.coeficienteGastoTotalMt = coeficienteGastoTotalMt;
    }

    @Basic
    @Column(name = "coeficiente_gasto_deprec_mn")
    public Double getCoeficienteGastoDeprecMn() {
        return coeficienteGastoDeprecMn;
    }

    public void setCoeficienteGastoDeprecMn(Double coeficienteGastoDeprecMn) {
        this.coeficienteGastoDeprecMn = coeficienteGastoDeprecMn;
    }

    @Basic
    @Column(name = "coeficiente_gasto_deprec_mlc")
    public Double getCoeficienteGastoDeprecMlc() {
        return coeficienteGastoDeprecMlc;
    }

    public void setCoeficienteGastoDeprecMlc(Double coeficienteGastoDeprecMlc) {
        this.coeficienteGastoDeprecMlc = coeficienteGastoDeprecMlc;
    }

    @Basic
    @Column(name = "coeficiente_gasto_deprec_mt")
    public Double getCoeficienteGastoDeprecMt() {
        return coeficienteGastoDeprecMt;
    }

    public void setCoeficienteGastoDeprecMt(Double coeficienteGastoDeprecMt) {
        this.coeficienteGastoDeprecMt = coeficienteGastoDeprecMt;
    }

    @Basic
    @Column(name = "coeficiente_gasto_mantenimiento_y_rep_mn")
    public Double getCoeficienteGastoMantenimientoYRepMn() {
        return coeficienteGastoMantenimientoYRepMn;
    }

    public void setCoeficienteGastoMantenimientoYRepMn(Double coeficienteGastoMantenimientoYRepMn) {
        this.coeficienteGastoMantenimientoYRepMn = coeficienteGastoMantenimientoYRepMn;
    }

    @Basic
    @Column(name = "coeficiente_gasto_mantenimiento_y_rep_mlc")
    public Double getCoeficienteGastoMantenimientoYRepMlc() {
        return coeficienteGastoMantenimientoYRepMlc;
    }

    public void setCoeficienteGastoMantenimientoYRepMlc(Double coeficienteGastoMantenimientoYRepMlc) {
        this.coeficienteGastoMantenimientoYRepMlc = coeficienteGastoMantenimientoYRepMlc;
    }

    @Basic
    @Column(name = "coeficiente_gasto_mantenimiento_y_rep_mt")
    public Double getCoeficienteGastoMantenimientoYRepMt() {
        return coeficienteGastoMantenimientoYRepMt;
    }

    public void setCoeficienteGastoMantenimientoYRepMt(Double coeficienteGastoMantenimientoYRepMt) {
        this.coeficienteGastoMantenimientoYRepMt = coeficienteGastoMantenimientoYRepMt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CoeficienteGastosGeneralesAdmonEntity that = (CoeficienteGastosGeneralesAdmonEntity) o;
        return id == that.id &&
                Objects.equals(coeficienteGastoTotalMn, that.coeficienteGastoTotalMn) &&
                Objects.equals(coeficienteGastoTotalMlc, that.coeficienteGastoTotalMlc) &&
                Objects.equals(coeficienteGastoTotalMt, that.coeficienteGastoTotalMt) &&
                Objects.equals(coeficienteGastoDeprecMn, that.coeficienteGastoDeprecMn) &&
                Objects.equals(coeficienteGastoDeprecMlc, that.coeficienteGastoDeprecMlc) &&
                Objects.equals(coeficienteGastoDeprecMt, that.coeficienteGastoDeprecMt) &&
                Objects.equals(coeficienteGastoMantenimientoYRepMn, that.coeficienteGastoMantenimientoYRepMn) &&
                Objects.equals(coeficienteGastoMantenimientoYRepMlc, that.coeficienteGastoMantenimientoYRepMlc) &&
                Objects.equals(coeficienteGastoMantenimientoYRepMt, that.coeficienteGastoMantenimientoYRepMt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, coeficienteGastoTotalMn, coeficienteGastoTotalMlc, coeficienteGastoTotalMt, coeficienteGastoDeprecMn, coeficienteGastoDeprecMlc, coeficienteGastoDeprecMt, coeficienteGastoMantenimientoYRepMn, coeficienteGastoMantenimientoYRepMlc, coeficienteGastoMantenimientoYRepMt);
    }
}
