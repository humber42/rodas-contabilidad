package cu.hash.rodascontabilidad.controlers;

import cu.hash.rodascontabilidad.constants.WebResourceKeyConstants;
import cu.hash.rodascontabilidad.models.CoeficienteGastosIndirectosProduccionEntity;
import cu.hash.rodascontabilidad.services.CoeficienteGastosindirectosProduccionService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(WebResourceKeyConstants.COEFICIENTE_GIP_API)
@Api(description = "Coeficiente Gastos Indirectos Produccion Rest Controller")
public class CoeficienteGastosindirectosProduccionController {
    @Autowired
    private CoeficienteGastosindirectosProduccionService service;

    @GetMapping(WebResourceKeyConstants.Endpoints.GET_ALL)
    public ResponseEntity<?> findAll(){
        return new ResponseEntity<>(service.findAll(), HttpStatus.OK);
    }

    @GetMapping(WebResourceKeyConstants.Endpoints.GET_BY_ID+"/{id}")
    public ResponseEntity<?> findCoeficienteGIPById(@PathVariable Long id){
        return new ResponseEntity<>(service.findById(id), HttpStatus.OK);
    }

    @PostMapping(WebResourceKeyConstants.Endpoints.SAVE)
    public ResponseEntity<?> addCoeficienteGIP
            (@RequestBody CoeficienteGastosIndirectosProduccionEntity coeficienteEntity){
        return new ResponseEntity<>(service.addCoeficienteGIP(coeficienteEntity), HttpStatus.OK);
    }

    @PutMapping(WebResourceKeyConstants.Endpoints.UPDATE)
    public ResponseEntity<?> updateCoeficienteGIP
            (@RequestBody CoeficienteGastosIndirectosProduccionEntity coeficienteEntity){
        return new ResponseEntity<>(service.updateOrDeleteCoeficienteGIP(coeficienteEntity), HttpStatus.OK);
    }

    @DeleteMapping(WebResourceKeyConstants.Endpoints.DELETE_BY_ID+"/{id}")
    public void deleteByID(@PathVariable Long id){
        service.deleteById(id);
    }
}
