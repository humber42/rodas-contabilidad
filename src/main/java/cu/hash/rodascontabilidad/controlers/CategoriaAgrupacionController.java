package cu.hash.rodascontabilidad.controlers;

import cu.hash.rodascontabilidad.constants.WebResourceKeyConstants;
import cu.hash.rodascontabilidad.models.CategoriaAgrupacionEntity;
import cu.hash.rodascontabilidad.services.CategoriaAgrupacionService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(WebResourceKeyConstants.CATEGORIA_AGRUPACION_API)
@Api(description = "Categoría Agrupación Rest Controller")
public class CategoriaAgrupacionController {
    @Autowired
    private CategoriaAgrupacionService service;

    @GetMapping(WebResourceKeyConstants.Endpoints.GET_ALL)
    public ResponseEntity<?> findAll(){
        return new ResponseEntity<>(service.findAll(), HttpStatus.OK);
    }

    @GetMapping(WebResourceKeyConstants.Endpoints.GET_BY_ID+"/{id}")
    public ResponseEntity<?> findCategoriaAgrupacionById(@PathVariable Long id){
        return new ResponseEntity<>(service.findById(id), HttpStatus.OK);
    }

    @GetMapping("/nombre/{nombre}")
    public ResponseEntity<?> findByNombre(@PathVariable String nombre){
        return new ResponseEntity<>(service.findByNombre(nombre), HttpStatus.OK);
    }

    @RequestMapping(params = {"id", "nombre"}, method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<?> findByIdAndNombre(@RequestParam("id") Long id,
                                               @RequestParam("nombre") String nombre){
        return new ResponseEntity<>(service.findByIdAndNombre(id, nombre), HttpStatus.OK);
    }

    @PostMapping(WebResourceKeyConstants.Endpoints.SAVE)
    public ResponseEntity<?> addCategoriaAgrupacion(@RequestBody CategoriaAgrupacionEntity categoria){
        return new ResponseEntity<>(service.addCategoriaAgrupacion(categoria), HttpStatus.OK);
    }

    @PutMapping(WebResourceKeyConstants.Endpoints.UPDATE)
    public ResponseEntity<?> updateCategoriaAgrupacion(@RequestBody CategoriaAgrupacionEntity categoria){
        return new ResponseEntity<>(service.updateOrDeleteCategoriaAgrupacion(categoria), HttpStatus.OK);
    }

    @DeleteMapping(WebResourceKeyConstants.Endpoints.DELETE)
    public ResponseEntity<?> deleteCategoriaAgrupacion(@RequestBody CategoriaAgrupacionEntity categoria){
        return new ResponseEntity<>(service.updateOrDeleteCategoriaAgrupacion(categoria), HttpStatus.OK);
    }
}
