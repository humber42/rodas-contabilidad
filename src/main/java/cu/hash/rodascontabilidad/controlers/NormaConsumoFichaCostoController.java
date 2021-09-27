package cu.hash.rodascontabilidad.controlers;

import cu.hash.rodascontabilidad.constants.WebResourceKeyConstants;
import cu.hash.rodascontabilidad.models.NormaConsumoFichaCostoEntity;
import cu.hash.rodascontabilidad.services.NormaConsumoFichaCostoService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(WebResourceKeyConstants.NORMA_CONSUMO_FICHA_COSTO_API)
@Api(description = "Norma Consumo Ficha Costo Rest Controller")
public class NormaConsumoFichaCostoController {
    @Autowired
    private NormaConsumoFichaCostoService service;

    @GetMapping(WebResourceKeyConstants.Endpoints.GET_ALL)
    public ResponseEntity<?> findAll(){
        return new ResponseEntity<>(service.findAll(), HttpStatus.OK);
    }

    @GetMapping(WebResourceKeyConstants.Endpoints.GET_BY_ID+"/{id}")
    public ResponseEntity<?> findNormaConsumoFichaCostoById(@PathVariable Long id){
        return new ResponseEntity<>(service.findById(id), HttpStatus.OK);
    }

    @PostMapping(WebResourceKeyConstants.Endpoints.SAVE)
    public ResponseEntity<?> addNormaConsumoFichaCosto(@RequestBody NormaConsumoFichaCostoEntity norma){
        return new ResponseEntity<>(service.addNormaConsumoFichaCosto(norma), HttpStatus.OK);
    }

    @PutMapping(WebResourceKeyConstants.Endpoints.UPDATE)
    public ResponseEntity<?> updateNormaConsumoFichaCosto(@RequestBody NormaConsumoFichaCostoEntity norma){
        return new ResponseEntity<>(service.updateOrDeleteNormaConsumoFichaCosto(norma), HttpStatus.OK);
    }

    @DeleteMapping(WebResourceKeyConstants.Endpoints.DELETE)
    public ResponseEntity<?> deleteNormaConsumoFichaCosto(@RequestBody NormaConsumoFichaCostoEntity norma){
        return new ResponseEntity<>(service.updateOrDeleteNormaConsumoFichaCosto(norma), HttpStatus.OK);
    }
}
