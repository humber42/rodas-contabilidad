--CATEGORIA AGRUPACION
alter table "categoria_agrupacion" add column "tipo_categoria" character varying (100);

--CATEGORIA AGRUPACION ELEMENTO GASTO
ALTER TABLE "categoria_agrupacion_elemento_gasto"
    DROP CONSTRAINT "fk_categoria_agrupacion_elemento_gasto_id";

ALTER TABLE "categoria_agrupacion_elemento_gasto"
  DROP CONSTRAINT "fk_categoria_agrupacion_id_categoria";

ALTER TABLE "categoria_agrupacion_elemento_gasto"
    ADD CONSTRAINT "fk_categoria_agrupacion_elemento_gasto_id" FOREIGN KEY ("id_elemento_gasto")
    REFERENCES elemento_gasto ("id") MATCH SIMPLE
    ON UPDATE CASCADE ON DELETE CASCADE;

ALTER TABLE "categoria_agrupacion_elemento_gasto"
  ADD CONSTRAINT "fk_categoria_agrupacion_id_categoria" FOREIGN KEY ("id_categoria_agrupacion")
  REFERENCES categoria_agrupacion ("id") MATCH SIMPLE
  ON UPDATE CASCADE ON DELETE CASCADE;

--CATEGORIA AGRUPACION INDIRECTA ELEMENTO GASTO
ALTER TABLE "categoria_agrupacion_indirecta_elemento_gasto"
    DROP CONSTRAINT "fk_categoria_agrupacion_categoria_indirecta_id";

ALTER TABLE "categoria_agrupacion_indirecta_elemento_gasto"
    ADD CONSTRAINT "fk_categoria_agrupacion_elemento_categoria_id" FOREIGN KEY ("id_categoria_agrupacion_indirecta")
    REFERENCES "categoria_agrupacion" ("id") MATCH SIMPLE ON UPDATE CASCADE ON DELETE CASCADE;

ALTER TABLE "categoria_agrupacion_indirecta_elemento_gasto"
  DROP CONSTRAINT "fk_categoria_agrupacion_elemento_gasto";

ALTER TABLE "categoria_agrupacion_indirecta_elemento_gasto"
  ADD CONSTRAINT "fk_categoria_agrupacion_elemento_gasto" FOREIGN KEY ("id_elemento_gasto")
REFERENCES "elemento_gasto" ("id") MATCH SIMPLE ON UPDATE CASCADE ON DELETE CASCADE;

--CATEGORIA AGRUPACION INDIRECTA SUBELEMENTO GASTO
ALTER TABLE "categoria_agrupacion_indirecta_subelemento_gasto"
    DROP CONSTRAINT "fk_categoria_agrupacion_indirecta_categoria_indirecta_id";

ALTER TABLE "categoria_agrupacion_indirecta_subelemento_gasto"
    ADD CONSTRAINT "fk_categoria_agrupacion_subelement_categoria_id" FOREIGN KEY ("id_categoria_agrupacion_indirecta")
    REFERENCES "categoria_agrupacion" ("id") MATCH SIMPLE ON UPDATE CASCADE ON DELETE CASCADE;

ALTER TABLE "categoria_agrupacion_indirecta_subelemento_gasto"
  DROP CONSTRAINT "fk_categoria_agrupacion_indirecta_subelemento_id";

ALTER TABLE "categoria_agrupacion_indirecta_subelemento_gasto"
  ADD CONSTRAINT "fk_categoria_agrupacion_indirecta_subelemento_id" FOREIGN KEY ("id_subelemento_gasto")
REFERENCES "subelemento_gasto" ("id") MATCH SIMPLE ON UPDATE CASCADE ON DELETE CASCADE;

--CATEGORIA AGRUPACION INDIRECTA
DROP TABLE categoria_agrupacion_indirecta;

--ACTIVIDAD
ALTER TABLE "actividad"
    DROP CONSTRAINT "fk_actividad_tipo_actividad_id";

ALTER TABLE "actividad"
    ADD CONSTRAINT "fk_actividad_tipo_actividad_id" FOREIGN KEY ("id_tipo_actividad")
    REFERENCES tipo_actividad ("id") MATCH SIMPLE
    ON UPDATE CASCADE ON DELETE CASCADE;

ALTER TABLE "actividad"
    DROP CONSTRAINT "fk_actividad_unidad_medida_id";

ALTER TABLE "actividad"
  ADD CONSTRAINT "fk_actividad_unidad_medida_id" FOREIGN KEY ("id_unidad_medida")
  REFERENCES unidad_medida ("id") MATCH SIMPLE
  ON UPDATE CASCADE ON DELETE CASCADE;

--COEFICIENTE
ALTER TABLE "coeficiente"
    DROP CONSTRAINT "fk_coeficiente_administracion";

ALTER TABLE "coeficiente"
  DROP CONSTRAINT "fk_coeficiente_bancario";

ALTER TABLE "coeficiente"
  DROP CONSTRAINT "fk_coeficiente_distribucion_venta";

ALTER TABLE "coeficiente"
  DROP CONSTRAINT "fk_coeficiente_produccion";

ALTER TABLE "coeficiente"
    ADD CONSTRAINT "fk_coeficiente_administracion" FOREIGN KEY ("id_coeficiente_gasto_generales_admon")
    REFERENCES "coeficiente_gastos_generales_admon" ("id") MATCH SIMPLE
    ON UPDATE CASCADE ON DELETE CASCADE;

ALTER TABLE "coeficiente"
  ADD CONSTRAINT "fk_coeficiente_bancario" FOREIGN KEY ("id_coeficiente_gastos_bancarios")
  REFERENCES "coeficiente_gastos_bancarios" ("id") MATCH SIMPLE
  ON UPDATE CASCADE ON DELETE CASCADE;

ALTER TABLE "coeficiente"
  ADD CONSTRAINT "fk_coeficiente_distribucion_venta" FOREIGN KEY ("id_coeficiente_gastos_distribucion_ventas")
  REFERENCES "coeficiente_gastos_distribucion_ventas" ("id") MATCH SIMPLE
  ON UPDATE CASCADE ON DELETE CASCADE;

ALTER TABLE "coeficiente"
  ADD CONSTRAINT "fk_coeficiente_produccion" FOREIGN KEY ("id_coeficientes_gastos_indirectos_produccion")
  REFERENCES "coeficiente_gastos_indirectos_produccion" ("id") MATCH SIMPLE
  ON UPDATE CASCADE ON DELETE CASCADE;

--GASTO DIRECTO
ALTER TABLE "gasto_directo"
    DROP CONSTRAINT "fk_gasto_directo_element_gasto_id";

ALTER TABLE "gasto_directo"
  DROP CONSTRAINT "fk_gasto_directo_subelemento_id";

ALTER TABLE "gasto_directo"
  DROP CONSTRAINT "fk_gasto_directo_tipo_gasto_directo";

ALTER TABLE "gasto_directo"
  DROP CONSTRAINT "fk_gasto_directo_unidad_medidad_id";

ALTER TABLE "gasto_directo"
    ADD CONSTRAINT "fk_gasto_directo_element_gasto_id" FOREIGN KEY ("id_elemento_gasto")
    REFERENCES "elemento_gasto" ("id") MATCH SIMPLE
    ON UPDATE CASCADE ON DELETE CASCADE;

ALTER TABLE "gasto_directo"
  ADD CONSTRAINT "fk_gasto_directo_subelemento_id" FOREIGN KEY ("id_subelemento")
REFERENCES "subelemento_gasto" ("id") MATCH SIMPLE
ON UPDATE CASCADE ON DELETE CASCADE;

ALTER TABLE "gasto_directo"
  ADD CONSTRAINT "fk_gasto_directo_tipo_gasto_directo" FOREIGN KEY ("id_tipo_gasto_directo")
REFERENCES "tipo_gasto_directo" ("id") MATCH SIMPLE
ON UPDATE CASCADE ON DELETE CASCADE;

ALTER TABLE "gasto_directo"
  ADD CONSTRAINT "fk_gasto_directo_unidad_medidad_id" FOREIGN KEY ("id_unidad_medida")
REFERENCES "unidad_medida" ("id") MATCH SIMPLE
ON UPDATE CASCADE ON DELETE CASCADE;

--GASTO INDIRECTO
ALTER TABLE "gasto_indirecto"
    DROP CONSTRAINT "fk_gasto_indirecto_tipo_gasto_indirecto_id";

ALTER TABLE "gasto_indirecto"
    ADD CONSTRAINT "fk_gasto_indirecto_tipo_gasto_indirecto_id" FOREIGN KEY ("id_tipo_gasto_indirecto")
    REFERENCES "tipo_gasto_indirecto" ("id") MATCH SIMPLE
    ON UPDATE CASCADE ON DELETE CASCADE;

--GASTOS ACTIVIDAD
ALTER TABLE "gastos_actividad"
    DROP CONSTRAINT "fk_gasto_directo_actividad_id_actividad";

ALTER TABLE "gastos_actividad"
  DROP CONSTRAINT "fk_gasto_directo_actividad_id_gasto_directo";

ALTER TABLE "gastos_actividad"
  DROP CONSTRAINT "fk_gasto_directo_actividad_id_gasto_indirecto";

ALTER TABLE "gastos_actividad"
  ADD CONSTRAINT "fk_gasto_directo_actividad_id_actividad" FOREIGN KEY ("id_actividad")
REFERENCES "actividad" ("id") MATCH SIMPLE
ON UPDATE CASCADE ON DELETE CASCADE;

ALTER TABLE "gastos_actividad"
  ADD CONSTRAINT "fk_gasto_directo_actividad_id_gasto_directo" FOREIGN KEY ("id_gasto_directo")
REFERENCES "gasto_directo" ("id") MATCH SIMPLE
ON UPDATE CASCADE ON DELETE CASCADE;

ALTER TABLE "gastos_actividad"
  ADD CONSTRAINT "fk_gasto_directo_actividad_id_gasto_indirecto" FOREIGN KEY ("id_gasto_indirecto")
REFERENCES "gasto_indirecto" ("id") MATCH SIMPLE
ON UPDATE CASCADE ON DELETE CASCADE;

--MATERIAL
ALTER TABLE "material"
    DROP CONSTRAINT "fk_material_orden_trabajo_id";

ALTER TABLE "material"
  ADD CONSTRAINT "fk_material_orden_trabajo_id" FOREIGN KEY ("id_orden_trabajo")
REFERENCES "orden_trabajo" ("id") MATCH SIMPLE
ON UPDATE CASCADE ON DELETE CASCADE;

--NORMA CONSUMO FICHA COSTO
ALTER TABLE "norma_consumo_ficha_costo"
    DROP CONSTRAINT "fk_norma_consumo_ficha_costo_id";

ALTER TABLE "norma_consumo_ficha_costo"
  DROP CONSTRAINT "fk_norma_consumo_norma_id";

ALTER TABLE "norma_consumo_ficha_costo"
  ADD CONSTRAINT "fk_norma_consumo_ficha_costo_id" FOREIGN KEY ("id_ficha_costo")
REFERENCES "ficha_costo" ("id") MATCH SIMPLE
ON UPDATE CASCADE ON DELETE CASCADE;

ALTER TABLE "norma_consumo_ficha_costo"
  ADD CONSTRAINT "fk_norma_consumo_norma_id" FOREIGN KEY ("id_norma_consumo")
REFERENCES "normas_consumo" ("id") MATCH SIMPLE
ON UPDATE CASCADE ON DELETE CASCADE;

--NORMA CONSUMO
ALTER TABLE "normas_consumo"
    DROP CONSTRAINT "fk_norma_actividad_id";

ALTER TABLE "normas_consumo"
  DROP CONSTRAINT "fk_norma_plan_produccion_id";

ALTER TABLE "normas_consumo"
  DROP CONSTRAINT "fk_norma_ueb_id";

ALTER TABLE "normas_consumo"
  ADD CONSTRAINT "fk_norma_actividad_id" FOREIGN KEY ("id_actividad")
REFERENCES "actividad" ("id") MATCH SIMPLE
ON UPDATE CASCADE ON DELETE CASCADE;

ALTER TABLE "normas_consumo"
  ADD CONSTRAINT "fk_norma_plan_produccion_id" FOREIGN KEY ("id_plan_produccion")
REFERENCES "plan_produccion" ("id") MATCH SIMPLE
ON UPDATE CASCADE ON DELETE CASCADE;

ALTER TABLE "normas_consumo"
  ADD CONSTRAINT "fk_norma_ueb_id" FOREIGN KEY ("id_ueb")
REFERENCES "ueb" ("id") MATCH SIMPLE
ON UPDATE CASCADE ON DELETE CASCADE;

--ORDEN FACTURACION
ALTER TABLE "orden_facturacion"
    DROP CONSTRAINT "fk_orden_facturacion_orden_trabajo_id";

ALTER TABLE "orden_facturacion"
  DROP CONSTRAINT "fk_orden_unidad_medida_id";

ALTER TABLE "orden_facturacion"
  ADD CONSTRAINT "fk_orden_facturacion_orden_trabajo_id" FOREIGN KEY ("id_orden_trabajo")
REFERENCES "orden_trabajo" ("id") MATCH SIMPLE
ON UPDATE CASCADE ON DELETE CASCADE;

ALTER TABLE "orden_facturacion"
  ADD CONSTRAINT "fk_orden_unidad_medida_id" FOREIGN KEY ("id_unidad_medida")
REFERENCES "unidad_medida" ("id") MATCH SIMPLE
ON UPDATE CASCADE ON DELETE CASCADE;

--ORDEN TRABAJO
ALTER TABLE "orden_trabajo"
    DROP CONSTRAINT "fk_orden_actividad_id";

ALTER TABLE "orden_trabajo"
  DROP CONSTRAINT "fk_orden_cargo_id";

ALTER TABLE "orden_trabajo"
  DROP CONSTRAINT "fk_orden_cliente_id";

ALTER TABLE "orden_trabajo"
  DROP CONSTRAINT "fk_orden_ficha_costo_id";

ALTER TABLE "orden_trabajo"
  DROP CONSTRAINT "fk_orden_ueb_id";

ALTER TABLE "orden_trabajo"
  ADD CONSTRAINT "fk_orden_actividad_id" FOREIGN KEY ("id_actividad")
REFERENCES "actividad" ("id") MATCH SIMPLE
ON UPDATE CASCADE ON DELETE CASCADE;

ALTER TABLE "orden_trabajo"
  ADD CONSTRAINT "fk_orden_cargo_id" FOREIGN KEY ("id_cargo")
REFERENCES "cargo" ("id") MATCH SIMPLE
ON UPDATE CASCADE ON DELETE CASCADE;

ALTER TABLE "orden_trabajo"
  ADD CONSTRAINT "fk_orden_cliente_id" FOREIGN KEY ("id_cliente")
REFERENCES "cliente" ("id") MATCH SIMPLE
ON UPDATE CASCADE ON DELETE CASCADE;

ALTER TABLE "orden_trabajo"
  ADD CONSTRAINT "fk_orden_ficha_costo_id" FOREIGN KEY ("id_ficha_costo")
REFERENCES "ficha_costo" ("id") MATCH SIMPLE
ON UPDATE CASCADE ON DELETE CASCADE;

ALTER TABLE "orden_trabajo"
  ADD CONSTRAINT "fk_orden_ueb_id" FOREIGN KEY ("id_ueb")
REFERENCES "ueb" ("id") MATCH SIMPLE
ON UPDATE CASCADE ON DELETE CASCADE;

--PERSONAS AUTORIZADAS
ALTER TABLE "personas_autorizadas"
    DROP CONSTRAINT "fk_autorizaicion_cargo_id";

ALTER TABLE "personas_autorizadas"
  ADD CONSTRAINT "fk_autorizaicion_cargo_id" FOREIGN KEY ("id_cargo")
REFERENCES "cargo" ("id") MATCH SIMPLE
ON UPDATE CASCADE ON DELETE CASCADE;

--PLAN PRODUCCION
ALTER TABLE "plan_produccion"
    DROP CONSTRAINT "fk_plan_produccion_ueb_id";

ALTER TABLE "plan_produccion"
  ADD CONSTRAINT "fk_plan_produccion_ueb_id" FOREIGN KEY ("id_ueb")
REFERENCES "ueb" ("id") MATCH SIMPLE
ON UPDATE CASCADE ON DELETE CASCADE;

--REPORTE DIARIO LABORAL
ALTER TABLE "reporte_diario_laboral"
    DROP CONSTRAINT "fk_reporte_diario_orden_trabajo_id";

ALTER TABLE "reporte_diario_laboral"
  DROP CONSTRAINT "fk_reporte_diario_trabajador_id";

ALTER TABLE "reporte_diario_laboral"
  ADD CONSTRAINT "fk_reporte_diario_orden_trabajo_id" FOREIGN KEY ("id_orden_trabajo")
REFERENCES "orden_trabajo" ("id") MATCH SIMPLE
ON UPDATE CASCADE ON DELETE CASCADE;

ALTER TABLE "reporte_diario_laboral"
  ADD CONSTRAINT "fk_reporte_diario_trabajador_id" FOREIGN KEY ("id_trabajador")
REFERENCES "trabajador" ("id") MATCH SIMPLE
ON UPDATE CASCADE ON DELETE CASCADE;

--SUBELEMENTO GASTO
ALTER TABLE "subelemento_gasto"
    DROP CONSTRAINT "fk_subelemento_gasto_id_elemento_gasto";

ALTER TABLE "subelemento_gasto"
  ADD CONSTRAINT "fk_subelemento_gasto_id_elemento_gasto" FOREIGN KEY ("id_elemento")
REFERENCES "elemento_gasto" ("id") MATCH SIMPLE
ON UPDATE CASCADE ON DELETE CASCADE;

--TRABAJADOR
ALTER TABLE "trabajador"
    DROP CONSTRAINT "fk_trabajador_cargo_id";

ALTER TABLE "trabajador"
  DROP CONSTRAINT "fk_trabajador_ueb_id";

ALTER TABLE "trabajador"
  ADD CONSTRAINT "fk_trabajador_cargo_id" FOREIGN KEY ("id_cargo")
REFERENCES "cargo" ("id") MATCH SIMPLE
ON UPDATE CASCADE ON DELETE CASCADE;

ALTER TABLE "trabajador"
  ADD CONSTRAINT "fk_trabajador_ueb_id" FOREIGN KEY ("id_ueb")
REFERENCES "ueb" ("id") MATCH SIMPLE
ON UPDATE CASCADE ON DELETE CASCADE;

--UEB ACTIVIDADES PLAN PRODUCCION
ALTER TABLE "ueb_actividades_plan_produccion"
    DROP CONSTRAINT "fk_actividad_id";

ALTER TABLE "ueb_actividades_plan_produccion"
  DROP CONSTRAINT "fk_plan_id";

ALTER TABLE "ueb_actividades_plan_produccion"
  ADD CONSTRAINT "fk_actividad_id" FOREIGN KEY ("id_actividad")
REFERENCES "actividad" ("id") MATCH SIMPLE
ON UPDATE CASCADE ON DELETE CASCADE;

ALTER TABLE "ueb_actividades_plan_produccion"
  ADD CONSTRAINT "fk_plan_id" FOREIGN KEY ("id_plan_produccion")
REFERENCES "plan_produccion" ("id") MATCH SIMPLE
ON UPDATE CASCADE ON DELETE CASCADE;

--UEB ETAPA
ALTER TABLE "ueb_etapa"
    DROP CONSTRAINT "fk_ueb_etapa_id_etapa";

ALTER TABLE "ueb_etapa"
  DROP CONSTRAINT "fk_ueb_etapa_id_ueb";

ALTER TABLE "ueb_etapa"
  ADD CONSTRAINT "fk_ueb_etapa_id_etapa" FOREIGN KEY ("id_etapa")
REFERENCES "etapa" ("id") MATCH SIMPLE
ON UPDATE CASCADE ON DELETE CASCADE;

ALTER TABLE "ueb_etapa"
  ADD CONSTRAINT "fk_ueb_etapa_id_ueb" FOREIGN KEY ("id_ueb")
REFERENCES "ueb" ("id") MATCH SIMPLE
ON UPDATE CASCADE ON DELETE CASCADE;


