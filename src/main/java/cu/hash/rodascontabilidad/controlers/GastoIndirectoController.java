package cu.hash.rodascontabilidad.controlers;

import cu.hash.rodascontabilidad.constants.WebResourceKeyConstants;
import cu.hash.rodascontabilidad.models.GastoIndirectoEntity;
import cu.hash.rodascontabilidad.services.GastoIndirectoService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(WebResourceKeyConstants.GASTO_INDIRECTO_API)
@Api(description = "Gasto Indirecto Rest Controller")
public class GastoIndirectoController {
    @Autowired
    private GastoIndirectoService service;

    @GetMapping(WebResourceKeyConstants.Endpoints.GET_ALL)
    public ResponseEntity<?> findAll(){
        return new ResponseEntity<>(service.findAll(), HttpStatus.OK);
    }

    @GetMapping(WebResourceKeyConstants.Endpoints.GET_BY_ID+"/{id}")
    public ResponseEntity<?> findGastoIndirectoById(@PathVariable Long id){
        return new ResponseEntity<>(service.findById(id), HttpStatus.OK);
    }

    @GetMapping("/nombre/{nombre}")
    public ResponseEntity<?> findGastoIndirectoByNombre(@PathVariable String nombre){
        return new ResponseEntity<>(service.findByNombre(nombre), HttpStatus.OK);
    }

    @RequestMapping(params = {"codigo", "nombre"}, method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<?> findGastoIndirectoByCodigoAndNombre(@RequestParam("codigo") String codigo,
                                                               @RequestParam("nombre") String nombre){
        return new ResponseEntity<>(service.findByCodigoAndNombre(codigo, nombre), HttpStatus.OK);
    }

    @PostMapping(WebResourceKeyConstants.Endpoints.SAVE)
    public ResponseEntity<?> addGastoIndirecto(@RequestBody GastoIndirectoEntity gasto){
        return new ResponseEntity<>(service.addGI(gasto), HttpStatus.OK);
    }

    @PutMapping(WebResourceKeyConstants.Endpoints.UPDATE)
    public ResponseEntity<?> updateGastoIndirecto(@RequestBody GastoIndirectoEntity gasto){
        return new ResponseEntity<>(service.updateOrDeleteGI(gasto), HttpStatus.OK);
    }

    @DeleteMapping(WebResourceKeyConstants.Endpoints.DELETE_BY_ID+"/{id}")
    public void deleteByID(@PathVariable Long id){
        service.deleteById(id);
    }
}
