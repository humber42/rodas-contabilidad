package cu.hash.rodascontabilidad.controlers;

import cu.hash.rodascontabilidad.constants.WebResourceKeyConstants;
import cu.hash.rodascontabilidad.models.CargoEntity;
import cu.hash.rodascontabilidad.services.CargoService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(WebResourceKeyConstants.CARGO_API)
@Api(description = "Cargo Rest Controller")
public class CargoController {
    @Autowired
    private CargoService service;

    @GetMapping(WebResourceKeyConstants.Endpoints.GET_ALL)
    public ResponseEntity<?> findAll(){
        return new ResponseEntity<>(service.findAll(), HttpStatus.OK);
    }

    @GetMapping(WebResourceKeyConstants.Endpoints.GET_BY_ID+"/{id}")
    public ResponseEntity<?> findCargoById(@PathVariable Long id){
        return new ResponseEntity<>(service.findById(id), HttpStatus.OK);
    }

    @GetMapping("/nombre/{nombre}")
    public ResponseEntity<?> findCargoByNombre(@PathVariable String nombre){
        return new ResponseEntity<>(service.findByNombre(nombre), HttpStatus.OK);
    }

    @RequestMapping(params = {"id", "nombre"}, method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<?> findByIdAndNombre(@RequestParam("id") Long id,
                                               @RequestParam("nombre") String nombre){
        return new ResponseEntity<>(service.findByIdAndNombre(id, nombre), HttpStatus.OK);
    }

    @PostMapping(WebResourceKeyConstants.Endpoints.SAVE)
    public ResponseEntity<?> addCargo(@RequestBody CargoEntity cargoEntity){
        return new ResponseEntity<>(service.addCargo(cargoEntity), HttpStatus.OK);
    }

    @PutMapping(WebResourceKeyConstants.Endpoints.UPDATE)
    public ResponseEntity<?> updateCargo(@RequestBody CargoEntity cargoEntity){
        return new ResponseEntity<>(service.updateOrDeleteCargo(cargoEntity), HttpStatus.OK);
    }

    @DeleteMapping(WebResourceKeyConstants.Endpoints.DELETE)
    public ResponseEntity<?> deleteCargo(@RequestBody CargoEntity cargoEntity){
        return new ResponseEntity<>(service.updateOrDeleteCargo(cargoEntity), HttpStatus.OK);
    }
}
