package cu.hash.rodascontabilidad.models;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "coeficiente", schema = "public", catalog = "rodas-costos")
public class CoeficienteEntity {
    private long id;
    private Date fecha;
    private Long idCoeficientesGastosIndirectosProduccion;
    private Long idCoeficienteGastoGeneralesAdmon;
    private Long idCoeficienteGastosBancarios;
    private Long idCoeficienteGastosDistribucionVentas;

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
    @Column(name = "fecha")
    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    @Basic
    @Column(name = "id_coeficientes_gastos_indirectos_produccion")
    public Long getIdCoeficientesGastosIndirectosProduccion() {
        return idCoeficientesGastosIndirectosProduccion;
    }

    public void setIdCoeficientesGastosIndirectosProduccion(Long idCoeficientesGastosIndirectosProduccion) {
        this.idCoeficientesGastosIndirectosProduccion = idCoeficientesGastosIndirectosProduccion;
    }

    @Basic
    @Column(name = "id_coeficiente_gasto_generales_admon")
    public Long getIdCoeficienteGastoGeneralesAdmon() {
        return idCoeficienteGastoGeneralesAdmon;
    }

    public void setIdCoeficienteGastoGeneralesAdmon(Long idCoeficienteGastoGeneralesAdmon) {
        this.idCoeficienteGastoGeneralesAdmon = idCoeficienteGastoGeneralesAdmon;
    }

    @Basic
    @Column(name = "id_coeficiente_gastos_bancarios")
    public Long getIdCoeficienteGastosBancarios() {
        return idCoeficienteGastosBancarios;
    }

    public void setIdCoeficienteGastosBancarios(Long idCoeficienteGastosBancarios) {
        this.idCoeficienteGastosBancarios = idCoeficienteGastosBancarios;
    }

    @Basic
    @Column(name = "id_coeficiente_gastos_distribucion_ventas")
    public Long getIdCoeficienteGastosDistribucionVentas() {
        return idCoeficienteGastosDistribucionVentas;
    }

    public void setIdCoeficienteGastosDistribucionVentas(Long idCoeficienteGastosDistribucionVentas) {
        this.idCoeficienteGastosDistribucionVentas = idCoeficienteGastosDistribucionVentas;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CoeficienteEntity that = (CoeficienteEntity) o;
        return id == that.id &&
                Objects.equals(fecha, that.fecha) &&
                Objects.equals(idCoeficientesGastosIndirectosProduccion, that.idCoeficientesGastosIndirectosProduccion) &&
                Objects.equals(idCoeficienteGastoGeneralesAdmon, that.idCoeficienteGastoGeneralesAdmon) &&
                Objects.equals(idCoeficienteGastosBancarios, that.idCoeficienteGastosBancarios) &&
                Objects.equals(idCoeficienteGastosDistribucionVentas, that.idCoeficienteGastosDistribucionVentas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, fecha, idCoeficientesGastosIndirectosProduccion, idCoeficienteGastoGeneralesAdmon, idCoeficienteGastosBancarios, idCoeficienteGastosDistribucionVentas);
    }
}
