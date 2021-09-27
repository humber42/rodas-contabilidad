package cu.hash.rodascontabilidad.controlers;

import cu.hash.rodascontabilidad.constants.WebResourceKeyConstants;
import cu.hash.rodascontabilidad.models.UebActividadesPlanProduccionEntity;
import cu.hash.rodascontabilidad.services.UebActividadesPlanProduccionService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(WebResourceKeyConstants.UEB_ACTIVIDADES_PP_API)
@Api(description = "UEB Actividades Plan Produccion Rest Controller")
public class UebActividadesPlanProduccionController {
    @Autowired
    private UebActividadesPlanProduccionService service;

    @GetMapping(WebResourceKeyConstants.Endpoints.GET_ALL)
    public ResponseEntity<?> findAll(){
        return new ResponseEntity<>(service.findAll(), HttpStatus.OK);
    }

    @GetMapping(WebResourceKeyConstants.Endpoints.GET_BY_ID+"/{id}")
    public ResponseEntity<?> findUebActividadesPPById(@PathVariable Long id){
        return new ResponseEntity<>(service.findById(id), HttpStatus.OK);
    }

    @PostMapping(WebResourceKeyConstants.Endpoints.SAVE)
    public ResponseEntity<?> addUebActividadesPP(@RequestBody UebActividadesPlanProduccionEntity ueb){
        return new ResponseEntity<>(service.addUebActividadPlanProduccion(ueb), HttpStatus.OK);
    }

    @PutMapping(WebResourceKeyConstants.Endpoints.UPDATE)
    public ResponseEntity<?> updateUebActividadesPP(@RequestBody UebActividadesPlanProduccionEntity ueb){
        return new ResponseEntity<>(service.updateOrDeleteUebActividadPlanProduccion(ueb), HttpStatus.OK);
    }

    @DeleteMapping(WebResourceKeyConstants.Endpoints.DELETE_BY_ID+"/{id}")
    public void deleteByID(@PathVariable Long id){
        service.deleteById(id);
    }
}
