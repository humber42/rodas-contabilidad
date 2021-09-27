package cu.hash.rodascontabilidad.controlers;

import cu.hash.rodascontabilidad.constants.WebResourceKeyConstants;
import cu.hash.rodascontabilidad.models.UebEtapaEntity;
import cu.hash.rodascontabilidad.services.UebEtapaService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(WebResourceKeyConstants.UEB_ETAPA_API)
@Api(description = "UEB Etapa Rest Controller")
public class UebEtapaController {
    @Autowired
    private UebEtapaService service;

    @GetMapping(WebResourceKeyConstants.Endpoints.GET_ALL)
    public ResponseEntity<?> findAll(){
        return new ResponseEntity<>(service.findAll(), HttpStatus.OK);
    }

    @GetMapping(WebResourceKeyConstants.Endpoints.GET_BY_ID+"/{id}")
    public ResponseEntity<?> findUebEtapaById(@PathVariable Long id){
        return new ResponseEntity<>(service.findById(id), HttpStatus.OK);
    }

    @PostMapping(WebResourceKeyConstants.Endpoints.SAVE)
    public ResponseEntity<?> addUebEtapa(@RequestBody UebEtapaEntity ueb){
        return new ResponseEntity<>(service.addUebEtapa(ueb), HttpStatus.OK);
    }

    @PutMapping(WebResourceKeyConstants.Endpoints.UPDATE)
    public ResponseEntity<?> updateUebEtapa(@RequestBody UebEtapaEntity ueb){
        return new ResponseEntity<>(service.updateOrDeleteUebEtapa(ueb), HttpStatus.OK);
    }

    @DeleteMapping(WebResourceKeyConstants.Endpoints.DELETE)
    public ResponseEntity<?> deleteUebEtapa(@RequestBody UebEtapaEntity ueb){
        return new ResponseEntity<>(service.updateOrDeleteUebEtapa(ueb), HttpStatus.OK);
    }
}
