package cu.hash.rodascontabilidad.controlers;

import cu.hash.rodascontabilidad.constants.WebResourceKeyConstants;
import cu.hash.rodascontabilidad.models.NormasConsumoEntity;
import cu.hash.rodascontabilidad.services.NormasConsumoService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(WebResourceKeyConstants.NORMA_CONSUMO_API)
@Api(description = "Norma Consumo Rest Controller")
public class NormasConsumoController {
    @Autowired
    private NormasConsumoService service;

    @GetMapping(WebResourceKeyConstants.Endpoints.GET_ALL)
    public ResponseEntity<?> findAll(){
        return new ResponseEntity<>(service.findAll(), HttpStatus.OK);
    }

    @GetMapping(WebResourceKeyConstants.Endpoints.GET_BY_ID+"/{id}")
    public ResponseEntity<?> findNormaConsumoById(@PathVariable Long id){
        return new ResponseEntity<>(service.findById(id), HttpStatus.OK);
    }

    @PostMapping(WebResourceKeyConstants.Endpoints.SAVE)
    public ResponseEntity<?> addNormaConsumo(@RequestBody NormasConsumoEntity norma){
        return new ResponseEntity<>(service.addNormaConsumo(norma), HttpStatus.OK);
    }

    @PutMapping(WebResourceKeyConstants.Endpoints.UPDATE)
    public ResponseEntity<?> updateNormaConsumo(@RequestBody NormasConsumoEntity norma){
        return new ResponseEntity<>(service.updateOrDeleteNormaConsumo(norma), HttpStatus.OK);
    }

    @DeleteMapping(WebResourceKeyConstants.Endpoints.DELETE)
    public ResponseEntity<?> deleteNormaConsumo(@RequestBody NormasConsumoEntity norma){
        return new ResponseEntity<>(service.updateOrDeleteNormaConsumo(norma), HttpStatus.OK);
    }
}
