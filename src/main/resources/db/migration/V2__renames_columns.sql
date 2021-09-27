alter table cargo rename column "salario_minimo_MLC" to salario_minimo_mlc;
alter table cargo rename column "salario_maximo_MLC" to salario_maximo_mlc;
alter table material rename column "importeMN" to importe_mn;
alter table material rename column "importeMLC" to importe_mlc;

--Coeficiente gastos bancarios--
alter table coeficiente_gastos_bancarios rename column "coeficiente_gasto_total_MN" to coeficiente_gasto_total_mn;
alter table coeficiente_gastos_bancarios rename column "coeficiente_gasto_total_MLC" to coeficiente_gasto_total_mlc;
alter table coeficiente_gastos_bancarios rename column "coeficiente_gasto_total_MT" to coeficiente_gasto_total_mt;
alter table coeficiente_gastos_bancarios rename column "coeficiente_gasto_deprec_MN" to coeficiente_gasto_deprec_mn;
alter table coeficiente_gastos_bancarios rename column "coeficiente_gasto_deprec_MLC" to coeficiente_gasto_deprec_mlc;
alter table coeficiente_gastos_bancarios rename column "coeficiente_gasto_deprec_MT" to coeficiente_gasto_deprec_mt;
alter table coeficiente_gastos_bancarios rename column "coeficiente_gasto_mantenimiento_y_rep_MN" to coeficiente_gasto_mantenimiento_y_rep_mn;
alter table coeficiente_gastos_bancarios rename column "coeficiente_gasto_mantenimiento_y_rep_MLC" to coeficiente_gasto_mantenimiento_y_rep_mlc;
alter table coeficiente_gastos_bancarios rename column "coeficiente_gasto_mantenimiento_y_rep_MT" to coeficiente_gasto_mantenimiento_y_rep_mt;

--Coeficiente gastos distribucion y ventas
alter table coeficiente_gastos_distribucion_ventas rename column "coeficiente_gasto_total_MN" to coeficiente_gasto_total_mn;
alter table coeficiente_gastos_distribucion_ventas rename column "coeficiente_gasto_total_MLC" to coeficiente_gasto_total_mlc;
alter table coeficiente_gastos_distribucion_ventas rename column "coeficiente_gasto_total_MT" to coeficiente_gasto_total_mt;
alter table coeficiente_gastos_distribucion_ventas rename column "coeficiente_gasto_deprec_MN" to coeficiente_gasto_deprec_mn;
alter table coeficiente_gastos_distribucion_ventas rename column "coeficiente_gasto_deprec_MLC" to coeficiente_gasto_deprec_mlc;
alter table coeficiente_gastos_distribucion_ventas rename column "coeficiente_gasto_deprec_MT" to coeficiente_gasto_deprec_mt;
alter table coeficiente_gastos_distribucion_ventas rename column "coeficiente_gasto_mantenimiento_y_rep_MN" to coeficiente_gasto_mantenimiento_y_rep_mn;
alter table coeficiente_gastos_distribucion_ventas rename column "coeficiente_gasto_mantenimiento_y_rep_MLC" to coeficiente_gasto_mantenimiento_y_rep_mlc;
alter table coeficiente_gastos_distribucion_ventas rename column "coeficiente_gasto_mantenimiento_y_rep_MT" to coeficiente_gasto_mantenimiento_y_rep_mt;

--Coeficiente gastos generales de administracion
alter table coeficiente_gastos_generales_admon rename column "coeficiente_gasto_total_MN" to coeficiente_gasto_total_mn;
alter table coeficiente_gastos_generales_admon rename column "coeficiente_gasto_total_MLC" to coeficiente_gasto_total_mlc;
alter table coeficiente_gastos_generales_admon rename column "coeficiente_gasto_total_MT" to coeficiente_gasto_total_mt;
alter table coeficiente_gastos_generales_admon rename column "coeficiente_gasto_deprec_MN" to coeficiente_gasto_deprec_mn;
alter table coeficiente_gastos_generales_admon rename column "coeficiente_gasto_deprec_MLC" to coeficiente_gasto_deprec_mlc;
alter table coeficiente_gastos_generales_admon rename column "coeficiente_gasto_deprec_MT" to coeficiente_gasto_deprec_mt;
alter table coeficiente_gastos_generales_admon rename column "coeficiente_gasto_mantenimiento_y_rep_MN" to coeficiente_gasto_mantenimiento_y_rep_mn;
alter table coeficiente_gastos_generales_admon rename column "coeficiente_gasto_mantenimiento_y_rep_MLC" to coeficiente_gasto_mantenimiento_y_rep_mlc;
alter table coeficiente_gastos_generales_admon rename column "coeficiente_gasto_mantenimiento_y_rep_MT" to coeficiente_gasto_mantenimiento_y_rep_mt;

--Coeficiente gastos directos de produccion
alter table coeficiente_gastos_indirectos_produccion rename column "coeficiente_gasto_total_MN" to coeficiente_gasto_total_mn;
alter table coeficiente_gastos_indirectos_produccion rename column "coeficiente_gasto_total_MLC" to coeficiente_gasto_total_mlc;
alter table coeficiente_gastos_indirectos_produccion rename column "coeficiente_gasto_total_MT" to coeficiente_gasto_total_mt;
alter table coeficiente_gastos_indirectos_produccion rename column "coeficiente_gasto_deprec_MN" to coeficiente_gasto_deprec_mn;
alter table coeficiente_gastos_indirectos_produccion rename column "coeficiente_gasto_deprec_MLC" to coeficiente_gasto_deprec_mlc;
alter table coeficiente_gastos_indirectos_produccion rename column "coeficiente_gasto_deprec_MT" to coeficiente_gasto_deprec_mt;
alter table coeficiente_gastos_indirectos_produccion rename column "coeficiente_gasto_mantenimiento_y_rep_MN" to coeficiente_gasto_mantenimiento_y_rep_mn;
alter table coeficiente_gastos_indirectos_produccion rename column "coeficiente_gasto_mantenimiento_y_rep_MLC" to coeficiente_gasto_mantenimiento_y_rep_mlc;
alter table coeficiente_gastos_indirectos_produccion rename column "coeficiente_gasto_mantenimiento_y_rep_MT" to coeficiente_gasto_mantenimiento_y_rep_mt;


---Configuracion
alter table configuracion rename column "margen_utilidad_prod_MLC" to margen_utilidad_prod_mlc
;
alter table configuracion rename column "margen_utilidad_prod_MT" to margen_utilidad_prod_mt
;
alter table configuracion rename column "margen_utilidad_servicios_MLC" to margen_utilidad_servicios_mlc
;
alter table configuracion rename column "margen_utilidad_servicios_MT" to margen_utilidad_servicios_mt
;

--orden facturacion
alter table orden_facturacion rename column "precioMN" to precio_mn
;
alter table orden_facturacion rename column "precioMLC" to precio_mlc
;
alter table orden_facturacion rename column "importeMN" to importe_mn
;
alter table orden_facturacion rename column "importeMLC" to importe_mlc
;

--Ueb
alter table ueb rename column "coeficiente_est_MN" to coeficiente_est_mn
;
alter table ueb rename column "coeficiente_est_MLC" to coeficiente_est_mlc
;

