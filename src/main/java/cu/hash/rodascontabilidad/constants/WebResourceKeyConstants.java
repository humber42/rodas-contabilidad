package cu.hash.rodascontabilidad.constants;

public class WebResourceKeyConstants {
    public static final String ACTIVIDAD_API = "/actividad";
    public static final String CARGO_API = "/cargo";
    public static final String CATEGORIA_AGRUPACION_API = "/categoria-agrupacion";
    public static final String CATEGORIA_AGRUPACION_ELEMENTO_GASTO_API =
            "/categoria-agrupacion-elemento-gasto";
    public static final String CATEGORIA_AGRUPACION_INDIRECTA_API = "/categoria-agrupacion-indirecta";
    public static final String CATEGORIA_AGRUPACION_INDIRECTA_ELEMENTO_GASTO_API
            = "/categoria-agrupacion-indirecta-elemento-gasto";
    public static final String CATEGORIA_AGRUPACION_INDIRECTA_SUBELEMENTO_GASTO_API
            = "/categoria-agrupacion-indirecta-subelemento-gasto";
    public static final String CLIENTE_API = "/cliente";
    public static final String COEFICIENTE_API = "/coeficiente";
    public static final String COEFICIENTE_GB_API = "/coeficiente-gb";
    public static final String COEFICIENTE_GDV_API = "/coeficiente-gdv";
    public static final String COEFICIENTE_GGA_API = "/coeficiente-gga";
    public static final String COEFICIENTE_GIP_API = "/coeficiente-gip";
    public static final String CONFIGURACION_API = "/configuracion";
    public static final String ELEMENTO_GASTO_API = "/elemento-gasto";
    public static final String ETAPA_API = "/etapa";
    public static final String FICHA_COSTO_API = "/ficha-costo";
    public static final String GASTO_DIRECTO_API = "/gasto-directo";
    public static final String GASTO_INDIRECTO_API = "/gasto-indirecto";
    public static final String GASTOS_ACTIVIDAD_API = "/gastos-actividad";
    public static final String MATERIAL_API = "/material";
    public static final String NORMA_CONSUMO_FICHA_COSTO_API = "/norma-consumo-ficha-costo";
    public static final String NORMA_CONSUMO_API = "/norma-consumo";
    public static final String ORDEN_FACTURACION_API = "/orden-facturacion";
    public static final String ORDEN_TRABAJO_API = "/orden-trabajo";
    public static final String PERSONA_AUTORIZADA_API = "/persona-autorizada";
    public static final String PLAN_PRODUCCION_API = "/plan-produccion";
    public static final String REPORTE_DIARIO_LABORAL_API = "/reporte-diario-laboral";
    public static final String SUBELEMENTO_GASTO_API = "/subelemento-gasto";
    public static final String TIPO_ACTIVIDAD_API = "/tipo-actividad";
    public static final String TIPO_GASTO_DIRECTO_API = "/tipo-gd";
    public static final String TIPO_GASTO_INDIRECTO_API = "/tipo-gi";
    public static final String TRABAJADOR_API = "/trabajador";
    public static final String UEB_ACTIVIDADES_PP_API = "/ueb-actividades-plan-produccion";
    public static final String UEB_API = "/ueb";
    public static final String UEB_ETAPA_API = "/ueb-etapa";
    public static final String UNIDAD_MEDIDA_API = "/unidad-medida";
    public static final String USER_API = "/user";


    public interface Endpoints{
        String GET_ALL = "/all";
        String GET_BY_ID = "/id";
        String UPDATE = "/update";
        String SAVE = "/save";
        String DELETE = "/delete";
        String DELETE_BY_ID = "/delete/id";
    }
}
