package cu.hash.rodascontabilidad.controlers;

import cu.hash.rodascontabilidad.constants.WebResourceKeyConstants;
import cu.hash.rodascontabilidad.models.CategoriaAgrupacionIndirectaElementoGastoEntity;
import cu.hash.rodascontabilidad.services.CategoriaAgrupacionIndirectaElementoGastoService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(WebResourceKeyConstants.CATEGORIA_AGRUPACION_INDIRECTA_ELEMENTO_GASTO_API)
@Api(description = "Categoría Agrupación Indirecta Elemento-Gasto Rest Controller")
public class CategoriaAgrupacionIndirectaElementoGastoController {
    @Autowired
    private CategoriaAgrupacionIndirectaElementoGastoService service;

    @GetMapping(WebResourceKeyConstants.Endpoints.GET_ALL)
    public ResponseEntity<?> findAll(){
        return new ResponseEntity<>(service.findAll(), HttpStatus.OK);
    }

    @GetMapping(WebResourceKeyConstants.Endpoints.GET_BY_ID+"/{id}")
    public ResponseEntity<?> findCategoriaAgrupacionIndirectaElementoGastoById(@PathVariable Long id){
        return new ResponseEntity<>(service.findById(id), HttpStatus.OK);
    }

    @PostMapping(WebResourceKeyConstants.Endpoints.SAVE)
    public ResponseEntity<?> addCategoriaAgrupacionIndirectaElementoGasto
            (@RequestBody CategoriaAgrupacionIndirectaElementoGastoEntity categoria){
        return new ResponseEntity<>(service.addCategoriaAgrupacionIndirectaElementoGasto(categoria), HttpStatus.OK);
    }

    @PutMapping(WebResourceKeyConstants.Endpoints.UPDATE)
    public ResponseEntity<?> updateCategoriaAgrupacionIndirectaElementoGasto
            (@RequestBody CategoriaAgrupacionIndirectaElementoGastoEntity categoria){
        return new ResponseEntity<>(service.updateOrDeleteCategoriaAgrupacionIndirectaElementoGasto(categoria), HttpStatus.OK);
    }

    @DeleteMapping(WebResourceKeyConstants.Endpoints.DELETE)
    public ResponseEntity<?> deleteCategoriaAgrupacionIndirectaElementoGasto
            (@RequestBody CategoriaAgrupacionIndirectaElementoGastoEntity categoria){
        return new ResponseEntity<>(service.updateOrDeleteCategoriaAgrupacionIndirectaElementoGasto(categoria), HttpStatus.OK);
    }
}
