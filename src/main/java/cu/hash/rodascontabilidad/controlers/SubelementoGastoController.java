package cu.hash.rodascontabilidad.controlers;

import cu.hash.rodascontabilidad.constants.WebResourceKeyConstants;
import cu.hash.rodascontabilidad.models.SubelementoGastoEntity;
import cu.hash.rodascontabilidad.services.SubelementoGastoService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(WebResourceKeyConstants.SUBELEMENTO_GASTO_API)
@Api(description = "Subelemento Gasto Rest Controller")
public class SubelementoGastoController {
    @Autowired
    private SubelementoGastoService service;

    @GetMapping(WebResourceKeyConstants.Endpoints.GET_ALL)
    public ResponseEntity<?> findAll(){
        return new ResponseEntity<>(service.findAll(), HttpStatus.OK);
    }

    @GetMapping(WebResourceKeyConstants.Endpoints.GET_BY_ID+"/{id}")
    public ResponseEntity<?> findSubelementoById(@PathVariable Long id){
        return new ResponseEntity<>(service.findById(id), HttpStatus.OK);
    }

    @GetMapping("/codigo/{codigo}")
    public ResponseEntity<?> findSubelementoByCodigo(@PathVariable String codigo){
        return new ResponseEntity<>(service.findByCodigoSubelemento(codigo), HttpStatus.OK);
    }

    @PostMapping(WebResourceKeyConstants.Endpoints.SAVE)
    public ResponseEntity<?> addSubelementoGasto(@RequestBody SubelementoGastoEntity subelemento){
        return new ResponseEntity<>(service.addSubelementoGasto(subelemento), HttpStatus.OK);
    }

    @PutMapping(WebResourceKeyConstants.Endpoints.UPDATE)
    public ResponseEntity<?> updateSubelementoGasto(@RequestBody SubelementoGastoEntity subelemento){
        return new ResponseEntity<>(service.updateOrDeleteSubelementoGasto(subelemento), HttpStatus.OK);
    }

    @DeleteMapping(WebResourceKeyConstants.Endpoints.DELETE_BY_ID+"/{id}")
    public void deleteByID(@PathVariable Long id){
        service.deleteById(id);
    }
}
