package cu.hash.rodascontabilidad.controlers;

import cu.hash.rodascontabilidad.constants.WebResourceKeyConstants;
import cu.hash.rodascontabilidad.models.TipoGastoDirectoEntity;
import cu.hash.rodascontabilidad.services.TipoGastoDirectoService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(WebResourceKeyConstants.TIPO_GASTO_DIRECTO_API)
@Api(description = "Tipo Gasto Directo Rest Controller")
public class TipoGastoDirectoController {
    @Autowired
    private TipoGastoDirectoService service;

    @GetMapping(WebResourceKeyConstants.Endpoints.GET_ALL)
    public ResponseEntity<?> findAll(){
        return new ResponseEntity<>(service.findAll(), HttpStatus.OK);
    }

    @GetMapping(WebResourceKeyConstants.Endpoints.GET_BY_ID+"/{id}")
    public ResponseEntity<?> findTipoGDById(@PathVariable Long id){
        return new ResponseEntity<>(service.findById(id), HttpStatus.OK);
    }

    @PostMapping(WebResourceKeyConstants.Endpoints.SAVE)
    public ResponseEntity<?> addTipoGD(@RequestBody TipoGastoDirectoEntity tipo){
        return new ResponseEntity<>(service.addTipoGD(tipo), HttpStatus.OK);
    }

    @PutMapping(WebResourceKeyConstants.Endpoints.UPDATE)
    public ResponseEntity<?> updateTipoGD(@RequestBody TipoGastoDirectoEntity tipo){
        return new ResponseEntity<>(service.updateOrDeleteTipoGD(tipo), HttpStatus.OK);
    }

    @DeleteMapping(WebResourceKeyConstants.Endpoints.DELETE)
    public ResponseEntity<?> deleteTipoGD(@RequestBody TipoGastoDirectoEntity tipo){
        return new ResponseEntity<>(service.updateOrDeleteTipoGD(tipo), HttpStatus.OK);
    }
}
