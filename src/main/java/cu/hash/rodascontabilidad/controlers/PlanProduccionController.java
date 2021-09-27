package cu.hash.rodascontabilidad.controlers;

import cu.hash.rodascontabilidad.constants.WebResourceKeyConstants;
import cu.hash.rodascontabilidad.models.PlanProduccionEntity;
import cu.hash.rodascontabilidad.services.PlanProduccionService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(WebResourceKeyConstants.PLAN_PRODUCCION_API)
@Api(description = "Plan Produccion Rest Controller")
public class PlanProduccionController {
    @Autowired
    private PlanProduccionService service;

    @GetMapping(WebResourceKeyConstants.Endpoints.GET_ALL)
    public ResponseEntity<?> findAll(){
        return new ResponseEntity<>(service.findAll(), HttpStatus.OK);
    }

    @GetMapping(WebResourceKeyConstants.Endpoints.GET_BY_ID+"/{id}")
    public ResponseEntity<?> findPlanProduccionById(@PathVariable Long id){
        return new ResponseEntity<>(service.findById(id), HttpStatus.OK);
    }

    @GetMapping(WebResourceKeyConstants.Endpoints.GET_ALL+"/{idUEB}")
    public ResponseEntity<?> findAllByIdUeb(@PathVariable Long idUEB){
        return new ResponseEntity<>(service.findAllByIdUeb(idUEB), HttpStatus.OK);
    }

    @PostMapping(WebResourceKeyConstants.Endpoints.SAVE)
    public ResponseEntity<?> addPlanProduccion(@RequestBody PlanProduccionEntity plan){
        return new ResponseEntity<>(service.addPlanProduccion(plan), HttpStatus.OK);
    }

    @PutMapping(WebResourceKeyConstants.Endpoints.UPDATE)
    public ResponseEntity<?> updatePlanProduccion(@RequestBody PlanProduccionEntity plan){
        return new ResponseEntity<>(service.updateOrDeletePlanProduccion(plan), HttpStatus.OK);
    }

    @DeleteMapping(WebResourceKeyConstants.Endpoints.DELETE_BY_ID+"/{id}")
    public void deleteByID(@PathVariable Long id){
        service.deleteById(id);
    }
}
