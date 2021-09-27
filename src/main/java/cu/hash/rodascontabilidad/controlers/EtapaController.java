package cu.hash.rodascontabilidad.controlers;

import cu.hash.rodascontabilidad.constants.WebResourceKeyConstants;
import cu.hash.rodascontabilidad.models.EtapaEntity;
import cu.hash.rodascontabilidad.services.EtapaService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(WebResourceKeyConstants.ETAPA_API)
@Api(description = "Etapa Rest Controller")
public class EtapaController {
    @Autowired
    private EtapaService service;

    @GetMapping(WebResourceKeyConstants.Endpoints.GET_ALL)
    public ResponseEntity<?> findAll(){
        return new ResponseEntity<>(service.findAll(), HttpStatus.OK);
    }

    @GetMapping(WebResourceKeyConstants.Endpoints.GET_BY_ID+"/{id}")
    public ResponseEntity<?> findEtapaById(@PathVariable Long id){
        return new ResponseEntity<>(service.findById(id), HttpStatus.OK);
    }

    @GetMapping("/nombre/{nombre}")
    public ResponseEntity<?> findEtapaByNombre(@PathVariable String nombre){
        return new ResponseEntity<>(service.findByNombre(nombre), HttpStatus.OK);
    }

    @RequestMapping(params = {"id", "nombre"}, method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<?> findEtapaByIdAndNombre(@RequestParam("id") Long id,
                                               @RequestParam("nombre") String nombre){
        return new ResponseEntity<>(service.findByIdAndNombre(id, nombre), HttpStatus.OK);
    }

    @PostMapping(WebResourceKeyConstants.Endpoints.SAVE)
    public ResponseEntity<?> addEtapa(@RequestBody EtapaEntity etapa){
        return new ResponseEntity<>(service.addEtapa(etapa), HttpStatus.OK);
    }

    @PutMapping(WebResourceKeyConstants.Endpoints.UPDATE)
    public ResponseEntity<?> updateEtapa(@RequestBody EtapaEntity etapa){
        return new ResponseEntity<>(service.updateOrDeleteEtapa(etapa), HttpStatus.OK);
    }

    @DeleteMapping(WebResourceKeyConstants.Endpoints.DELETE_BY_ID+"/{id}")
    public void deleteByID(@PathVariable Long id){
        service.deleteById(id);
    }
}
