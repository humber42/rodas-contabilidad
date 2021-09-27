package cu.hash.rodascontabilidad.controlers;

import cu.hash.rodascontabilidad.constants.WebResourceKeyConstants;
import cu.hash.rodascontabilidad.models.CategoriaAgrupacionElementoGastoEntity;
import cu.hash.rodascontabilidad.services.CategoriaAgrupacionElementoGastoService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(WebResourceKeyConstants.CATEGORIA_AGRUPACION_ELEMENTO_GASTO_API)
@Api(description = "Categoría Agrupación Elemento-Gasto Rest Controller")
public class CategoriaAgrupacionElementoGastoController {
    @Autowired
    private CategoriaAgrupacionElementoGastoService service;

    @GetMapping(WebResourceKeyConstants.Endpoints.GET_ALL)
    public ResponseEntity<?> findAll(){
        return new ResponseEntity<>(service.findAll(), HttpStatus.OK);
    }

    @GetMapping(WebResourceKeyConstants.Endpoints.GET_BY_ID+"/{id}")
    public ResponseEntity<?> findCategoriaAgrupacionElementoGastoById(@PathVariable Long id){
        return new ResponseEntity<>(service.findById(id), HttpStatus.OK);
    }

    @PostMapping(WebResourceKeyConstants.Endpoints.SAVE)
    public ResponseEntity<?> addCategoriaAgrupacionElementoGasto(
            @RequestBody CategoriaAgrupacionElementoGastoEntity categoria){
        return new ResponseEntity<>(service.addCategoriaAgrupacionElementoGasto(categoria), HttpStatus.OK);
    }

    @PutMapping(WebResourceKeyConstants.Endpoints.UPDATE)
    public ResponseEntity<?> updateCategoriaAgrupacionElementoGasto(
            @RequestBody CategoriaAgrupacionElementoGastoEntity categoria){
        return new ResponseEntity<>(service.updateOrDeleteCategoriaAgrupacionElementoGasto(categoria), HttpStatus.OK);
    }

    @DeleteMapping(WebResourceKeyConstants.Endpoints.DELETE)
    public ResponseEntity<?> deleteCategoriaAgrupacionElementoGasto(
            @RequestBody CategoriaAgrupacionElementoGastoEntity categoria){
        return new ResponseEntity<>(service.updateOrDeleteCategoriaAgrupacionElementoGasto(categoria), HttpStatus.OK);
    }
}
