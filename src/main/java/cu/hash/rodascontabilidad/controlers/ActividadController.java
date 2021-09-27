package cu.hash.rodascontabilidad.controlers;

import cu.hash.rodascontabilidad.constants.WebResourceKeyConstants;
import cu.hash.rodascontabilidad.models.ActividadEntity;
import cu.hash.rodascontabilidad.services.ActividadService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(WebResourceKeyConstants.ACTIVIDAD_API)
@Api(description = "Actividad Rest Controller")
public class ActividadController {
    @Autowired
    private ActividadService service;

    @GetMapping(WebResourceKeyConstants.Endpoints.GET_ALL)
    public ResponseEntity<?> findAll(){
        return new ResponseEntity<>(service.findAll(), HttpStatus.OK);
    }

    @GetMapping(WebResourceKeyConstants.Endpoints.GET_ALL+WebResourceKeyConstants.Endpoints.GET_BY_ID+"/{id}")
    public ResponseEntity<?> findAllByIdTipoActividad(@PathVariable Long id){
        return new ResponseEntity<>(service.findAllByIdTipoActividad(id), HttpStatus.OK);
    }

    @GetMapping(WebResourceKeyConstants.Endpoints.GET_BY_ID+"/{id}")
    public ResponseEntity<?> findActividadById(@PathVariable Long id){
        return new ResponseEntity<>(service.findById(id), HttpStatus.OK);
    }

    @RequestMapping(params = {"id", "codigo"}, method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<?> findByIdAndCodigo(@RequestParam("id") Long id,
                                               @RequestParam("codigo") String codigo){
        return new ResponseEntity<>(service.findByIdAndCodigo(id, codigo), HttpStatus.OK);
    }

    @PostMapping(WebResourceKeyConstants.Endpoints.SAVE)
    public ResponseEntity<?> addActividad(@RequestBody ActividadEntity actividad){
        return new ResponseEntity<>(service.addActividad(actividad), HttpStatus.OK);
    }

    @PutMapping(WebResourceKeyConstants.Endpoints.UPDATE)
    public ResponseEntity<?> updateActividad(@RequestBody ActividadEntity actividad){
        return new ResponseEntity<>(service.updateOrDeleteActividad(actividad), HttpStatus.OK);
    }

    @DeleteMapping(WebResourceKeyConstants.Endpoints.DELETE)
    public ResponseEntity<?> deleteActividad(@RequestBody ActividadEntity actividad){
        return new ResponseEntity<>(service.updateOrDeleteActividad(actividad), HttpStatus.OK);
    }
}
