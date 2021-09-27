package cu.hash.rodascontabilidad.controlers;

import cu.hash.rodascontabilidad.constants.WebResourceKeyConstants;
import cu.hash.rodascontabilidad.models.GastosActividadEntity;
import cu.hash.rodascontabilidad.services.GastosActividadService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(WebResourceKeyConstants.GASTOS_ACTIVIDAD_API)
@Api(description = "Gastos Actividad Rest Controller")
public class GastosActividadController {
    @Autowired
    private GastosActividadService service;

    @GetMapping(WebResourceKeyConstants.Endpoints.GET_ALL)
    public ResponseEntity<?> findAll(){
        return new ResponseEntity<>(service.findAll(), HttpStatus.OK);
    }

    @GetMapping(WebResourceKeyConstants.Endpoints.GET_ALL+"/{idActividad}")
    public ResponseEntity<?> findAllByIdActividad(@PathVariable Long idActividad){
        return new ResponseEntity<>(service.findAllByIdActividad(idActividad), HttpStatus.OK);
    }

    @GetMapping(WebResourceKeyConstants.Endpoints.GET_BY_ID+"/{id}")
    public ResponseEntity<?> findGastoActividadById(@PathVariable Long id){
        return new ResponseEntity<>(service.findById(id), HttpStatus.OK);
    }

    @PostMapping(WebResourceKeyConstants.Endpoints.SAVE)
    public ResponseEntity<?> addGastoActividad(@RequestBody GastosActividadEntity gasto){
        return new ResponseEntity<>(service.addGastosActividad(gasto), HttpStatus.OK);
    }

    @PutMapping(WebResourceKeyConstants.Endpoints.UPDATE)
    public ResponseEntity<?> updateGastoActividad(@RequestBody GastosActividadEntity gasto){
        return new ResponseEntity<>(service.updateOrDeleteGastosActividad(gasto), HttpStatus.OK);
    }

    @DeleteMapping(WebResourceKeyConstants.Endpoints.DELETE_BY_ID+"/{id}")
    public void deleteByID(@PathVariable Long id){
        service.deleteById(id);
    }
}
