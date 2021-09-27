package cu.hash.rodascontabilidad.controlers;

import cu.hash.rodascontabilidad.constants.WebResourceKeyConstants;
import cu.hash.rodascontabilidad.models.TrabajadorEntity;
import cu.hash.rodascontabilidad.services.TrabajadorService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(WebResourceKeyConstants.TRABAJADOR_API)
@Api(description = "Trabajador Rest Controller")
public class TrabajadorController {
    @Autowired
    private TrabajadorService service;

    @GetMapping(WebResourceKeyConstants.Endpoints.GET_ALL)
    public ResponseEntity<?> findAll(){
        return new ResponseEntity<>(service.findAll(), HttpStatus.OK);
    }

    @GetMapping(WebResourceKeyConstants.Endpoints.GET_BY_ID+"/{id}")
    public ResponseEntity<?> findTrabajadorById(@PathVariable Long id){
        return new ResponseEntity<>(service.findById(id), HttpStatus.OK);
    }

    @GetMapping("/nombre/{nombre}")
    public ResponseEntity<?> findFirstByNombre(@PathVariable String nombre){
        return new ResponseEntity<>(service.findFirstByNombre(nombre), HttpStatus.OK);
    }

    @GetMapping(WebResourceKeyConstants.Endpoints.GET_ALL+"/{nombre}")
    public ResponseEntity<?> findAllByNombre(@PathVariable String nombre){
        return new ResponseEntity<>(service.findAllByNombre(nombre), HttpStatus.OK);
    }

    @GetMapping(WebResourceKeyConstants.Endpoints.GET_ALL+"/{idUEB}")
    public ResponseEntity<?> findAllByIdUEB(@PathVariable Long idUEB){
        return new ResponseEntity<>(service.findAllByIdUeb(idUEB), HttpStatus.OK);
    }

    @PostMapping(WebResourceKeyConstants.Endpoints.SAVE)
    public ResponseEntity<?> addTrabajador(@RequestBody TrabajadorEntity trabajador){
        return new ResponseEntity<>(service.addTrabajador(trabajador), HttpStatus.OK);
    }

    @PutMapping(WebResourceKeyConstants.Endpoints.UPDATE)
    public ResponseEntity<?> updateTrabajador(@RequestBody TrabajadorEntity trabajador){
        return new ResponseEntity<>(service.updateOrDeleteTrabajador(trabajador), HttpStatus.OK);
    }

    @DeleteMapping(WebResourceKeyConstants.Endpoints.DELETE_BY_ID+"/{id}")
    public void deleteByID(@PathVariable Long id){
        service.deleteById(id);
    }
}
