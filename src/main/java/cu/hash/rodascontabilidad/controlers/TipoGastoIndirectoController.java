package cu.hash.rodascontabilidad.controlers;

import cu.hash.rodascontabilidad.constants.WebResourceKeyConstants;
import cu.hash.rodascontabilidad.models.TipoGastoIndirectoEntity;
import cu.hash.rodascontabilidad.services.TipoGastoIndirectoService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(WebResourceKeyConstants.TIPO_GASTO_INDIRECTO_API)
@Api(description = "Tipo Gasto Indirecto Rest Controller")
public class TipoGastoIndirectoController {
    @Autowired
    private TipoGastoIndirectoService service;

    @GetMapping(WebResourceKeyConstants.Endpoints.GET_ALL)
    public ResponseEntity<?> findAll(){
        return new ResponseEntity<>(service.findAll(), HttpStatus.OK);
    }

    @GetMapping(WebResourceKeyConstants.Endpoints.GET_BY_ID+"/{id}")
    public ResponseEntity<?> findTipoGIById(@PathVariable Long id){
        return new ResponseEntity<>(service.findById(id), HttpStatus.OK);
    }

    @PostMapping(WebResourceKeyConstants.Endpoints.SAVE)
    public ResponseEntity<?> addTipoGI(@RequestBody TipoGastoIndirectoEntity tipo){
        return new ResponseEntity<>(service.addTipoGI(tipo), HttpStatus.OK);
    }

    @PutMapping(WebResourceKeyConstants.Endpoints.UPDATE)
    public ResponseEntity<?> updateTipoGI(@RequestBody TipoGastoIndirectoEntity tipo){
        return new ResponseEntity<>(service.updateOrDeleteTipoGI(tipo), HttpStatus.OK);
    }

    @DeleteMapping(WebResourceKeyConstants.Endpoints.DELETE_BY_ID+"/{id}")
    public void deleteByID(@PathVariable Long id){
        service.deleteById(id);
    }
}
