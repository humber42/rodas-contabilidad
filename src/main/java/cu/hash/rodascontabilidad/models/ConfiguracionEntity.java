package cu.hash.rodascontabilidad.models;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "configuracion", schema = "public", catalog = "rodas-costos")
public class ConfiguracionEntity {
    private long idConfiguracion;
    private String nombreEntidad;
    private String codigoEntidad;
    private String organismo;
    private Float horasPorMes;
    private Double gastoPromedioEstimacionDivisa;
    private Double pagoPorResultadoPercent;
    private Double pagoPorSeguridadSocialPercent;
    private Double fuerzaTrabajoPercent;
    private Double margenUtilidadProdMlc;
    private Double margenUtilidadProdMt;
    private Double margenUtilidadServiciosMlc;
    private Double margenUtilidadServiciosMt;
    private Long idElemento;
    private Long idSubelemento;
    private long idUeb;
    private long idCliente;

    @Id
    @Column(name = "id_configuracion")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long getIdConfiguracion() {
        return idConfiguracion;
    }

    public void setIdConfiguracion(long idConfiguracion) {
        this.idConfiguracion = idConfiguracion;
    }

    @Basic
    @Column(name = "nombre_entidad")
    public String getNombreEntidad() {
        return nombreEntidad;
    }

    public void setNombreEntidad(String nombreEntidad) {
        this.nombreEntidad = nombreEntidad;
    }

    @Basic
    @Column(name = "codigo_entidad")
    public String getCodigoEntidad() {
        return codigoEntidad;
    }

    public void setCodigoEntidad(String codigoEntidad) {
        this.codigoEntidad = codigoEntidad;
    }

    @Basic
    @Column(name = "organismo")
    public String getOrganismo() {
        return organismo;
    }

    public void setOrganismo(String organismo) {
        this.organismo = organismo;
    }

    @Basic
    @Column(name = "horas_por_mes")
    public Float getHorasPorMes() {
        return horasPorMes;
    }

    public void setHorasPorMes(Float horasPorMes) {
        this.horasPorMes = horasPorMes;
    }

    @Basic
    @Column(name = "gasto_promedio_estimacion_divisa")
    public Double getGastoPromedioEstimacionDivisa() {
        return gastoPromedioEstimacionDivisa;
    }

    public void setGastoPromedioEstimacionDivisa(Double gastoPromedioEstimacionDivisa) {
        this.gastoPromedioEstimacionDivisa = gastoPromedioEstimacionDivisa;
    }

    @Basic
    @Column(name = "pago_por_resultado_percent")
    public Double getPagoPorResultadoPercent() {
        return pagoPorResultadoPercent;
    }

    public void setPagoPorResultadoPercent(Double pagoPorResultadoPercent) {
        this.pagoPorResultadoPercent = pagoPorResultadoPercent;
    }

    @Basic
    @Column(name = "pago_por_seguridad_social_percent")
    public Double getPagoPorSeguridadSocialPercent() {
        return pagoPorSeguridadSocialPercent;
    }

    public void setPagoPorSeguridadSocialPercent(Double pagoPorSeguridadSocialPercent) {
        this.pagoPorSeguridadSocialPercent = pagoPorSeguridadSocialPercent;
    }

    @Basic
    @Column(name = "fuerza_trabajo_percent")
    public Double getFuerzaTrabajoPercent() {
        return fuerzaTrabajoPercent;
    }

    public void setFuerzaTrabajoPercent(Double fuerzaTrabajoPercent) {
        this.fuerzaTrabajoPercent = fuerzaTrabajoPercent;
    }

    @Basic
    @Column(name = "margen_utilidad_prod_mlc")
    public Double getMargenUtilidadProdMlc() {
        return margenUtilidadProdMlc;
    }

    public void setMargenUtilidadProdMlc(Double margenUtilidadProdMlc) {
        this.margenUtilidadProdMlc = margenUtilidadProdMlc;
    }

    @Basic
    @Column(name = "margen_utilidad_prod_mt")
    public Double getMargenUtilidadProdMt() {
        return margenUtilidadProdMt;
    }

    public void setMargenUtilidadProdMt(Double margenUtilidadProdMt) {
        this.margenUtilidadProdMt = margenUtilidadProdMt;
    }

    @Basic
    @Column(name = "margen_utilidad_servicios_mlc")
    public Double getMargenUtilidadServiciosMlc() {
        return margenUtilidadServiciosMlc;
    }

    public void setMargenUtilidadServiciosMlc(Double margenUtilidadServiciosMlc) {
        this.margenUtilidadServiciosMlc = margenUtilidadServiciosMlc;
    }

    @Basic
    @Column(name = "margen_utilidad_servicios_mt")
    public Double getMargenUtilidadServiciosMt() {
        return margenUtilidadServiciosMt;
    }

    public void setMargenUtilidadServiciosMt(Double margenUtilidadServiciosMt) {
        this.margenUtilidadServiciosMt = margenUtilidadServiciosMt;
    }

    @Basic
    @Column(name = "id_elemento")
    public Long getIdElemento() {
        return idElemento;
    }

    public void setIdElemento(Long idElemento) {
        this.idElemento = idElemento;
    }

    @Basic
    @Column(name = "id_subelemento")
    public Long getIdSubelemento() {
        return idSubelemento;
    }

    public void setIdSubelemento(Long idSubelemento) {
        this.idSubelemento = idSubelemento;
    }

    @Basic
    @Column(name = "id_ueb")
    public long getIdUeb() {
        return idUeb;
    }

    public void setIdUeb(long idUeb) {
        this.idUeb = idUeb;
    }

    @Basic
    @Column(name = "id_cliente")
    public long getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(long idCliente) {
        this.idCliente = idCliente;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ConfiguracionEntity that = (ConfiguracionEntity) o;
        return idConfiguracion == that.idConfiguracion &&
                idUeb == that.idUeb &&
                idCliente == that.idCliente &&
                Objects.equals(nombreEntidad, that.nombreEntidad) &&
                Objects.equals(codigoEntidad, that.codigoEntidad) &&
                Objects.equals(organismo, that.organismo) &&
                Objects.equals(horasPorMes, that.horasPorMes) &&
                Objects.equals(gastoPromedioEstimacionDivisa, that.gastoPromedioEstimacionDivisa) &&
                Objects.equals(pagoPorResultadoPercent, that.pagoPorResultadoPercent) &&
                Objects.equals(pagoPorSeguridadSocialPercent, that.pagoPorSeguridadSocialPercent) &&
                Objects.equals(fuerzaTrabajoPercent, that.fuerzaTrabajoPercent) &&
                Objects.equals(margenUtilidadProdMlc, that.margenUtilidadProdMlc) &&
                Objects.equals(margenUtilidadProdMt, that.margenUtilidadProdMt) &&
                Objects.equals(margenUtilidadServiciosMlc, that.margenUtilidadServiciosMlc) &&
                Objects.equals(margenUtilidadServiciosMt, that.margenUtilidadServiciosMt) &&
                Objects.equals(idElemento, that.idElemento) &&
                Objects.equals(idSubelemento, that.idSubelemento);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idConfiguracion, nombreEntidad, codigoEntidad, organismo, horasPorMes, gastoPromedioEstimacionDivisa, pagoPorResultadoPercent, pagoPorSeguridadSocialPercent, fuerzaTrabajoPercent, margenUtilidadProdMlc, margenUtilidadProdMt, margenUtilidadServiciosMlc, margenUtilidadServiciosMt, idElemento, idSubelemento, idUeb, idCliente);
    }
}
