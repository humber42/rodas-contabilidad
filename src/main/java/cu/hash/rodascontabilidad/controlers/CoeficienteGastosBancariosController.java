package cu.hash.rodascontabilidad.controlers;

import cu.hash.rodascontabilidad.constants.WebResourceKeyConstants;
import cu.hash.rodascontabilidad.models.CoeficienteGastosBancariosEntity;
import cu.hash.rodascontabilidad.services.CoeficienteGastosBancariosService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(WebResourceKeyConstants.COEFICIENTE_GB_API)
@Api(description = "Coeficiente Gastos Bancarios Rest Controller")
public class CoeficienteGastosBancariosController {
    @Autowired
    private CoeficienteGastosBancariosService service;

    @GetMapping(WebResourceKeyConstants.Endpoints.GET_ALL)
    public ResponseEntity<?> findAll(){
        return new ResponseEntity<>(service.findAll(), HttpStatus.OK);
    }

    @GetMapping(WebResourceKeyConstants.Endpoints.GET_BY_ID+"/{id}")
    public ResponseEntity<?> findCoeficienteGBById(@PathVariable Long id){
        return new ResponseEntity<>(service.findById(id), HttpStatus.OK);
    }

    @PostMapping(WebResourceKeyConstants.Endpoints.SAVE)
    public ResponseEntity<?> addCoeficienteGB(@RequestBody CoeficienteGastosBancariosEntity coeficienteEntity){
        return new ResponseEntity<>(service.addCoeficienteGB(coeficienteEntity), HttpStatus.OK);
    }

    @PutMapping(WebResourceKeyConstants.Endpoints.UPDATE)
    public ResponseEntity<?> updateCoeficienteGB(@RequestBody CoeficienteGastosBancariosEntity coeficienteEntity){
        return new ResponseEntity<>(service.updateOrDeleteCoeficienteGB(coeficienteEntity), HttpStatus.OK);
    }

    @DeleteMapping(WebResourceKeyConstants.Endpoints.DELETE)
    public ResponseEntity<?> deleteCoeficienteGB(@RequestBody CoeficienteGastosBancariosEntity coeficienteEntity){
        return new ResponseEntity<>(service.updateOrDeleteCoeficienteGB(coeficienteEntity), HttpStatus.OK);
    }
}
