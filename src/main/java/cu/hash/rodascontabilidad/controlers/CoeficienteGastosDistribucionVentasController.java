package cu.hash.rodascontabilidad.controlers;

import cu.hash.rodascontabilidad.constants.WebResourceKeyConstants;
import cu.hash.rodascontabilidad.models.CoeficienteGastosDistribucionVentasEntity;
import cu.hash.rodascontabilidad.services.CoeficienteGastosDistribucionVentasService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(WebResourceKeyConstants.COEFICIENTE_GDV_API)
@Api(description = "Coeficiente Gastos Distribucion Ventas Rest Controller")
public class CoeficienteGastosDistribucionVentasController {
    @Autowired
    private CoeficienteGastosDistribucionVentasService service;

    @GetMapping(WebResourceKeyConstants.Endpoints.GET_ALL)
    public ResponseEntity<?> findAll(){
        return new ResponseEntity<>(service.findAll(), HttpStatus.OK);
    }

    @GetMapping(WebResourceKeyConstants.Endpoints.GET_BY_ID+"/{id}")
    public ResponseEntity<?> findCoeficienteGDVById(@PathVariable Long id){
        return new ResponseEntity<>(service.findById(id), HttpStatus.OK);
    }

    @PostMapping(WebResourceKeyConstants.Endpoints.SAVE)
    public ResponseEntity<?> addCoeficienteGDV
            (@RequestBody CoeficienteGastosDistribucionVentasEntity coeficienteEntity){
        return new ResponseEntity<>(service.addCoeficienteGDV(coeficienteEntity), HttpStatus.OK);
    }

    @PutMapping(WebResourceKeyConstants.Endpoints.UPDATE)
    public ResponseEntity<?> updateCoeficienteGDV
            (@RequestBody CoeficienteGastosDistribucionVentasEntity coeficienteEntity){
        return new ResponseEntity<>(service.updateOrDeleteCoeficienteGDV(coeficienteEntity), HttpStatus.OK);
    }

    @DeleteMapping(WebResourceKeyConstants.Endpoints.DELETE_BY_ID+"/{id}")
    public void deleteByID(@PathVariable Long id){
        service.deleteById(id);
    }
}
