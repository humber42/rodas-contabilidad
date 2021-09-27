package cu.hash.rodascontabilidad.controlers;

import cu.hash.rodascontabilidad.constants.WebResourceKeyConstants;
import cu.hash.rodascontabilidad.models.ElementoGastoEntity;
import cu.hash.rodascontabilidad.services.ElementoGastoService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(WebResourceKeyConstants.ELEMENTO_GASTO_API)
@Api(description = "Elemento-Gasto Rest Controller")
public class ElementoGastoController {
    @Autowired
    private ElementoGastoService service;

    @GetMapping(WebResourceKeyConstants.Endpoints.GET_ALL)
    public ResponseEntity<?> findAll(){
        return new ResponseEntity<>(service.findAll(), HttpStatus.OK);
    }

    @GetMapping(WebResourceKeyConstants.Endpoints.GET_BY_ID+"/{id}")
    public ResponseEntity<?> findElementoGastoById(@PathVariable Long id){
        return new ResponseEntity<>(service.findById(id), HttpStatus.OK);
    }

    @GetMapping("/codigo/{codigo}")
    public ResponseEntity<?> findElementoGastoByCodigoElemento(@PathVariable String codigo){
        return new ResponseEntity<>(service.findByCodigoElemento(codigo), HttpStatus.OK);
    }

    @PostMapping(WebResourceKeyConstants.Endpoints.SAVE)
    public ResponseEntity<?> addElementoGasto(@RequestBody ElementoGastoEntity elemento){
        return new ResponseEntity<>(service.addElementoGasto(elemento), HttpStatus.OK);
    }

    @PutMapping(WebResourceKeyConstants.Endpoints.UPDATE)
    public ResponseEntity<?> updateElementoGasto(@RequestBody ElementoGastoEntity elemento){
        return new ResponseEntity<>(service.updateOrDeleteElementoGasto(elemento), HttpStatus.OK);
    }

    @DeleteMapping(WebResourceKeyConstants.Endpoints.DELETE_BY_ID+"/{id}")
    public void deleteByID(@PathVariable Long id){
        service.deleteById(id);
    }
}
