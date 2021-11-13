package cu.hash.rodascontabilidad.controlers;

import cu.hash.rodascontabilidad.constants.WebResourceKeyConstants;
import cu.hash.rodascontabilidad.models.OrdenTrabajoEntity;
import cu.hash.rodascontabilidad.services.OrdenTrabajoService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(WebResourceKeyConstants.ORDEN_TRABAJO_API)
@Api(description = "Orden Trabajo Rest Controller")
public class OrdenTrabajoController {
    @Autowired
    private OrdenTrabajoService service;

    @GetMapping(WebResourceKeyConstants.Endpoints.GET_ALL)
    public ResponseEntity<?> findAll(){
        return new ResponseEntity<>(service.findAll(), HttpStatus.OK);
    }

    @GetMapping(WebResourceKeyConstants.Endpoints.GET_BY_ID+"/{id}")
    public ResponseEntity<?> findOrdenTrabajoById(@PathVariable Long id){
        return new ResponseEntity<>(service.findById(id), HttpStatus.OK);
    }

    @PostMapping(WebResourceKeyConstants.Endpoints.SAVE)
    public ResponseEntity<?> addOrdenTrabajo(@RequestBody OrdenTrabajoEntity orden){
        return new ResponseEntity<>(service.addOrdenTrabajo(orden), HttpStatus.OK);
    }

    @PutMapping(WebResourceKeyConstants.Endpoints.UPDATE)
    public ResponseEntity<?> updateOrdenTrabajo(@RequestBody OrdenTrabajoEntity orden){
        return new ResponseEntity<>(service.updateOrDeleteOrdenTrabajo(orden), HttpStatus.OK);
    }

    @PutMapping(value = WebResourceKeyConstants.Endpoints.UPDATE + "/close", params = "id")
    public void openOrClose(@RequestParam long id) {
        service.closeOrOpenOrdenTrabajo(id);
    }

    @DeleteMapping(WebResourceKeyConstants.Endpoints.DELETE_BY_ID+"/{id}")
    public void deleteByID(@PathVariable Long id){
        service.deleteById(id);
    }
}
