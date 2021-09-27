package cu.hash.rodascontabilidad.controlers;

import cu.hash.rodascontabilidad.constants.WebResourceKeyConstants;
import cu.hash.rodascontabilidad.models.CoeficienteGastosGeneralesAdmonEntity;
import cu.hash.rodascontabilidad.services.CoeficienteGastosGeneralesAdmonService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(WebResourceKeyConstants.COEFICIENTE_GGA_API)
@Api(description = "Coeficiente Gastos Generales Admon Rest Controller")
public class CoeficienteGastosGeneralesAdmonController {
    @Autowired
    private CoeficienteGastosGeneralesAdmonService service;

    @GetMapping(WebResourceKeyConstants.Endpoints.GET_ALL)
    public ResponseEntity<?> findAll(){
        return new ResponseEntity<>(service.findAll(), HttpStatus.OK);
    }

    @GetMapping(WebResourceKeyConstants.Endpoints.GET_BY_ID+"/{id}")
    public ResponseEntity<?> findCoeficienteGGAById(@PathVariable Long id){
        return new ResponseEntity<>(service.findById(id), HttpStatus.OK);
    }

    @PostMapping(WebResourceKeyConstants.Endpoints.SAVE)
    public ResponseEntity<?> addCoeficienteGGA
            (@RequestBody CoeficienteGastosGeneralesAdmonEntity coeficienteEntity){
        return new ResponseEntity<>(service.addCoeficienteGGA(coeficienteEntity), HttpStatus.OK);
    }

    @PutMapping(WebResourceKeyConstants.Endpoints.UPDATE)
    public ResponseEntity<?> updateCoeficienteGGA
            (@RequestBody CoeficienteGastosGeneralesAdmonEntity coeficienteEntity){
        return new ResponseEntity<>(service.updateOrDeleteCoeficienteGGA(coeficienteEntity), HttpStatus.OK);
    }

    @DeleteMapping(WebResourceKeyConstants.Endpoints.DELETE)
    public ResponseEntity<?> deleteCoeficienteGGA
            (@RequestBody CoeficienteGastosGeneralesAdmonEntity coeficienteEntity){
        return new ResponseEntity<>(service.updateOrDeleteCoeficienteGGA(coeficienteEntity), HttpStatus.OK);
    }
}
