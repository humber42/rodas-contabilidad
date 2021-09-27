package cu.hash.rodascontabilidad.controlers;

import cu.hash.rodascontabilidad.constants.WebResourceKeyConstants;
import cu.hash.rodascontabilidad.models.GastoDirectoEntity;
import cu.hash.rodascontabilidad.services.GastoDirectoService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(WebResourceKeyConstants.GASTO_DIRECTO_API)
@Api(description = "Gasto Directo Rest Controller")
public class GastoDirectoController {
    @Autowired
    private GastoDirectoService service;

    @GetMapping(WebResourceKeyConstants.Endpoints.GET_ALL)
    public ResponseEntity<?> findAll(){
        return new ResponseEntity<>(service.findAll(), HttpStatus.OK);
    }

    @GetMapping(WebResourceKeyConstants.Endpoints.GET_BY_ID+"/{id}")
    public ResponseEntity<?> findGastoDirectoById(@PathVariable Long id){
        return new ResponseEntity<>(service.findById(id), HttpStatus.OK);
    }

    @GetMapping("/nombre/{nombre}")
    public ResponseEntity<?> findGastoDirectoByNombre(@PathVariable String nombre){
        return new ResponseEntity<>(service.findByNombre(nombre), HttpStatus.OK);
    }

    @RequestMapping(params = {"codigo", "nombre"}, method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<?> findGastoDirectoByCodigoAndNombre(@RequestParam("codigo") String codigo,
                                                    @RequestParam("nombre") String nombre){
        return new ResponseEntity<>(service.findByCodigoAndNombre(codigo, nombre), HttpStatus.OK);
    }

    @PostMapping(WebResourceKeyConstants.Endpoints.SAVE)
    public ResponseEntity<?> addGastoDirecto(@RequestBody GastoDirectoEntity gasto){
        return new ResponseEntity<>(service.addGD(gasto), HttpStatus.OK);
    }

    @PutMapping(WebResourceKeyConstants.Endpoints.UPDATE)
    public ResponseEntity<?> updateGastoDirecto(@RequestBody GastoDirectoEntity gasto){
        return new ResponseEntity<>(service.updateOrDeleteGD(gasto), HttpStatus.OK);
    }

    @DeleteMapping(WebResourceKeyConstants.Endpoints.DELETE)
    public ResponseEntity<?> deleteGastoDirecto(@RequestBody GastoDirectoEntity gasto){
        return new ResponseEntity<>(service.updateOrDeleteGD(gasto), HttpStatus.OK);
    }
}
