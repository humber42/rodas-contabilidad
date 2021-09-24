package cu.hash.rodascontabilidad.models;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "normas_consumo", schema = "public", catalog = "rodas-contabilidad")
public class NormasConsumoEntity {
    private long id;
    private Long idActividad;
    private Long idPlanProduccion;
    private Long capacidadInstalada;
    private Double capacidadInstaladaUtilizacionPercent;
    private Double produccionPeriodoAnterior;
    private Double margenUtilidadPercentCuc;
    private Double precio;
    private Long idUeb;
    private String nombreAprueba;
    private String cargoAprueba;
    private Double margenUtilidadPercentMt;

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
    @Column(name = "id_actividad")
    public Long getIdActividad() {
        return idActividad;
    }

    public void setIdActividad(Long idActividad) {
        this.idActividad = idActividad;
    }

    @Basic
    @Column(name = "id_plan_produccion")
    public Long getIdPlanProduccion() {
        return idPlanProduccion;
    }

    public void setIdPlanProduccion(Long idPlanProduccion) {
        this.idPlanProduccion = idPlanProduccion;
    }

    @Basic
    @Column(name = "capacidad_instalada")
    public Long getCapacidadInstalada() {
        return capacidadInstalada;
    }

    public void setCapacidadInstalada(Long capacidadInstalada) {
        this.capacidadInstalada = capacidadInstalada;
    }

    @Basic
    @Column(name = "capacidad_instalada_utilizacion_percent")
    public Double getCapacidadInstaladaUtilizacionPercent() {
        return capacidadInstaladaUtilizacionPercent;
    }

    public void setCapacidadInstaladaUtilizacionPercent(Double capacidadInstaladaUtilizacionPercent) {
        this.capacidadInstaladaUtilizacionPercent = capacidadInstaladaUtilizacionPercent;
    }

    @Basic
    @Column(name = "produccion_periodo_anterior")
    public Double getProduccionPeriodoAnterior() {
        return produccionPeriodoAnterior;
    }

    public void setProduccionPeriodoAnterior(Double produccionPeriodoAnterior) {
        this.produccionPeriodoAnterior = produccionPeriodoAnterior;
    }

    @Basic
    @Column(name = "margen_utilidad_percent_cuc")
    public Double getMargenUtilidadPercentCuc() {
        return margenUtilidadPercentCuc;
    }

    public void setMargenUtilidadPercentCuc(Double margenUtilidadPercentCuc) {
        this.margenUtilidadPercentCuc = margenUtilidadPercentCuc;
    }

    @Basic
    @Column(name = "precio")
    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    @Basic
    @Column(name = "id_ueb")
    public Long getIdUeb() {
        return idUeb;
    }

    public void setIdUeb(Long idUeb) {
        this.idUeb = idUeb;
    }

    @Basic
    @Column(name = "nombre_aprueba")
    public String getNombreAprueba() {
        return nombreAprueba;
    }

    public void setNombreAprueba(String nombreAprueba) {
        this.nombreAprueba = nombreAprueba;
    }

    @Basic
    @Column(name = "cargo_aprueba")
    public String getCargoAprueba() {
        return cargoAprueba;
    }

    public void setCargoAprueba(String cargoAprueba) {
        this.cargoAprueba = cargoAprueba;
    }

    @Basic
    @Column(name = "margen_utilidad_percent_mt")
    public Double getMargenUtilidadPercentMt() {
        return margenUtilidadPercentMt;
    }

    public void setMargenUtilidadPercentMt(Double margenUtilidadPercentMt) {
        this.margenUtilidadPercentMt = margenUtilidadPercentMt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NormasConsumoEntity that = (NormasConsumoEntity) o;
        return id == that.id &&
                Objects.equals(idActividad, that.idActividad) &&
                Objects.equals(idPlanProduccion, that.idPlanProduccion) &&
                Objects.equals(capacidadInstalada, that.capacidadInstalada) &&
                Objects.equals(capacidadInstaladaUtilizacionPercent, that.capacidadInstaladaUtilizacionPercent) &&
                Objects.equals(produccionPeriodoAnterior, that.produccionPeriodoAnterior) &&
                Objects.equals(margenUtilidadPercentCuc, that.margenUtilidadPercentCuc) &&
                Objects.equals(precio, that.precio) &&
                Objects.equals(idUeb, that.idUeb) &&
                Objects.equals(nombreAprueba, that.nombreAprueba) &&
                Objects.equals(cargoAprueba, that.cargoAprueba) &&
                Objects.equals(margenUtilidadPercentMt, that.margenUtilidadPercentMt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, idActividad, idPlanProduccion, capacidadInstalada, capacidadInstaladaUtilizacionPercent, produccionPeriodoAnterior, margenUtilidadPercentCuc, precio, idUeb, nombreAprueba, cargoAprueba, margenUtilidadPercentMt);
    }
}
