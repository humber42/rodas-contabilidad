package cu.hash.rodascontabilidad.controlers;

import cu.hash.rodascontabilidad.constants.WebResourceKeyConstants;
import cu.hash.rodascontabilidad.models.OrdenFacturacionEntity;
import cu.hash.rodascontabilidad.services.OrdenFacturacionService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(WebResourceKeyConstants.ORDEN_FACTURACION_API)
@Api(description = "Orden Facturacion Rest Controller")
public class OrdenFacturacionController {
    @Autowired
    private OrdenFacturacionService service;

    @GetMapping(WebResourceKeyConstants.Endpoints.GET_ALL)
    public ResponseEntity<?> findAll(){
        return new ResponseEntity<>(service.findAll(), HttpStatus.OK);
    }

    @GetMapping(WebResourceKeyConstants.Endpoints.GET_BY_ID+"/{id}")
    public ResponseEntity<?> findOrdenFacturacionById(@PathVariable Long id){
        return new ResponseEntity<>(service.findById(id), HttpStatus.OK);
    }

    @GetMapping("/codigo/{codigo}")
    public ResponseEntity<?> findOrdenFacturacionByCodigo(@PathVariable String codigo){
        return new ResponseEntity<>(service.findByCodigo(codigo), HttpStatus.OK);
    }

    @RequestMapping(params = {"id", "codigo"}, method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<?> findOrdenFacturacionByIdAndCodigo(@RequestParam("id") Long id,
                                                    @RequestParam("codigo") String codigo){
        return new ResponseEntity<>(service.findByIdAndCodigo(id, codigo), HttpStatus.OK);
    }

    @PostMapping(WebResourceKeyConstants.Endpoints.SAVE)
    public ResponseEntity<?> addOrdenFacturacion(@RequestBody OrdenFacturacionEntity orden){
        return new ResponseEntity<>(service.addOrdenFacturacion(orden), HttpStatus.OK);
    }

    @PutMapping(WebResourceKeyConstants.Endpoints.UPDATE)
    public ResponseEntity<?> updateOrdenFacturacion(@RequestBody OrdenFacturacionEntity orden){
        return new ResponseEntity<>(service.updateOrDeleteOrdenFacturacion(orden), HttpStatus.OK);
    }

    @DeleteMapping(WebResourceKeyConstants.Endpoints.DELETE_BY_ID+"/{id}")
    public void deleteByID(@PathVariable Long id){
        service.deleteById(id);
    }
}
