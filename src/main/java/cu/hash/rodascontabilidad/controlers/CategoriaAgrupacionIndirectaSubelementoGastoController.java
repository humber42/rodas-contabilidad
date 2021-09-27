package cu.hash.rodascontabilidad.controlers;

import cu.hash.rodascontabilidad.constants.WebResourceKeyConstants;
import cu.hash.rodascontabilidad.models.CategoriaAgrupacionIndirectaSubelementoGastoEntity;
import cu.hash.rodascontabilidad.services.CategoriaAgrupacionIndirectaSubelementoGastoService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(WebResourceKeyConstants.CATEGORIA_AGRUPACION_INDIRECTA_SUBELEMENTO_GASTO_API)
@Api(description = "Categoría Agrupación Indirecta Subelemento-Gasto Rest Controller")
public class CategoriaAgrupacionIndirectaSubelementoGastoController {
    @Autowired
    private CategoriaAgrupacionIndirectaSubelementoGastoService service;

    @GetMapping(WebResourceKeyConstants.Endpoints.GET_ALL)
    public ResponseEntity<?> findAll(){
        return new ResponseEntity<>(service.findAll(), HttpStatus.OK);
    }

    @GetMapping(WebResourceKeyConstants.Endpoints.GET_BY_ID+"/{id}")
    public ResponseEntity<?> findCategoriaAgrupacionIndirectaSubelementoGastoById(@PathVariable Long id){
        return new ResponseEntity<>(service.findById(id), HttpStatus.OK);
    }

    @PostMapping(WebResourceKeyConstants.Endpoints.SAVE)
    public ResponseEntity<?> addCategoriaAgrupacionIndirectaSubElementoGasto
            (@RequestBody CategoriaAgrupacionIndirectaSubelementoGastoEntity categoria){
        return new ResponseEntity<>(service.addCategoriaAgrupacionIndirectaSubelementoGastoEntity(categoria), HttpStatus.OK);
    }

    @PutMapping(WebResourceKeyConstants.Endpoints.UPDATE)
    public ResponseEntity<?> updateCategoriaAgrupacionIndirectaSubElementoGasto
            (@RequestBody CategoriaAgrupacionIndirectaSubelementoGastoEntity categoria){
        return new ResponseEntity<>(service.updateOrDeleteCategoriaAgrupacionIndirectaSubelementoGastoEntity(categoria), HttpStatus.OK);
    }

    @DeleteMapping(WebResourceKeyConstants.Endpoints.DELETE_BY_ID+"/{id}")
    public void deleteByID(@PathVariable Long id){
        service.deleteById(id);
    }
}
