package cu.hash.rodascontabilidad.controlers;

import cu.hash.rodascontabilidad.constants.WebResourceKeyConstants;
import cu.hash.rodascontabilidad.models.TipoActividadEntity;
import cu.hash.rodascontabilidad.services.TipoActividadService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(WebResourceKeyConstants.TIPO_ACTIVIDAD_API)
@Api(description = "Tipo Actividad Rest Controller")
public class TipoActividadController {
    @Autowired
    private TipoActividadService service;

    @GetMapping(WebResourceKeyConstants.Endpoints.GET_ALL)
    public ResponseEntity<?> findAll(){
        return new ResponseEntity<>(service.findAll(), HttpStatus.OK);
    }

    @GetMapping(WebResourceKeyConstants.Endpoints.GET_BY_ID+"/{id}")
    public ResponseEntity<?> findTipoActividadById(@PathVariable Long id){
        return new ResponseEntity<>(service.findById(id), HttpStatus.OK);
    }

    @RequestMapping(params = {"id", "nombre"}, method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<?> findTipoActividadByIdAndNombre(@RequestParam("id") Long id,
                                                    @RequestParam("nombre") String nombre){
        return new ResponseEntity<>(service.findByIdAndNombre(id, nombre), HttpStatus.OK);
    }

    @RequestMapping(params = {"id", "codigo"}, method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<?> findTipoActividadByIdAndCodigo(@RequestParam("id") Long id,
                                                            @RequestParam("codigo") String codigo){
        return new ResponseEntity<>(service.findByIdAndCodigo(id, codigo), HttpStatus.OK);
    }

    @PostMapping(WebResourceKeyConstants.Endpoints.SAVE)
    public ResponseEntity<?> addTipoActividad(@RequestBody TipoActividadEntity tipo){
        return new ResponseEntity<>(service.addTipoActividad(tipo), HttpStatus.OK);
    }

    @PutMapping(WebResourceKeyConstants.Endpoints.UPDATE)
    public ResponseEntity<?> updateTipoActividad(@RequestBody TipoActividadEntity tipo){
        return new ResponseEntity<>(service.updateOrDeleteTipoActividad(tipo), HttpStatus.OK);
    }

    @DeleteMapping(WebResourceKeyConstants.Endpoints.DELETE)
    public ResponseEntity<?> deleteTipoActividad(@RequestBody TipoActividadEntity tipo){
        return new ResponseEntity<>(service.updateOrDeleteTipoActividad(tipo), HttpStatus.OK);
    }
}
