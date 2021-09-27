package cu.hash.rodascontabilidad.controlers;

import cu.hash.rodascontabilidad.constants.WebResourceKeyConstants;
import cu.hash.rodascontabilidad.models.CategoriaAgrupacionIndirectaEntity;
import cu.hash.rodascontabilidad.services.CategoriaAgrupacionIndirectaService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(WebResourceKeyConstants.CATEGORIA_AGRUPACION_INDIRECTA_API)
@Api(description = "Categoría Agrupación Indirecta Rest Controller")
public class CategoriaAgrupacionIndirectaController {
    @Autowired
    private CategoriaAgrupacionIndirectaService service;

    @GetMapping(WebResourceKeyConstants.Endpoints.GET_ALL)
    public ResponseEntity<?> findAll(){
        return new ResponseEntity<>(service.findAll(), HttpStatus.OK);
    }

    @GetMapping(WebResourceKeyConstants.Endpoints.GET_BY_ID+"/{id}")
    public ResponseEntity<?> findCategoriaAgrupacionIndirectaById(@PathVariable Long id){
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
    public ResponseEntity<?> addCategoriaAgrupacionIndirecta(@RequestBody CategoriaAgrupacionIndirectaEntity categoria){
        return new ResponseEntity<>(service.addCategoriaAgrupacionIndirecta(categoria), HttpStatus.OK);
    }

    @PutMapping(WebResourceKeyConstants.Endpoints.UPDATE)
    public ResponseEntity<?> updateCategoriaAgrupacionIndirecta(@RequestBody CategoriaAgrupacionIndirectaEntity categoria){
        return new ResponseEntity<>(service.updateOrDeleteCategoriaAgrupacionIndirecta(categoria), HttpStatus.OK);
    }

    @DeleteMapping(WebResourceKeyConstants.Endpoints.DELETE)
    public ResponseEntity<?> deleteCategoriaAgrupacionIndirecta(@RequestBody CategoriaAgrupacionIndirectaEntity categoria){
        return new ResponseEntity<>(service.updateOrDeleteCategoriaAgrupacionIndirecta(categoria), HttpStatus.OK);
    }
}
