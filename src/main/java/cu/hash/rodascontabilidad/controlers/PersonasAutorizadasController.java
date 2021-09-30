package cu.hash.rodascontabilidad.controlers;

import cu.hash.rodascontabilidad.constants.WebResourceKeyConstants;
import cu.hash.rodascontabilidad.models.PersonasAutorizadasEntity;
import cu.hash.rodascontabilidad.services.PersonasAutorizadasService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(WebResourceKeyConstants.PERSONA_AUTORIZADA_API)
@Api(description = "Persona Autorizada Rest Controller")
public class PersonasAutorizadasController {
    @Autowired
    private PersonasAutorizadasService service;

    @GetMapping(WebResourceKeyConstants.Endpoints.GET_ALL)
    public ResponseEntity<?> findAll(){
        return new ResponseEntity<>(service.findAll(), HttpStatus.OK);
    }

    @GetMapping(WebResourceKeyConstants.Endpoints.GET_BY_ID+"/{id}")
    public ResponseEntity<?> findPersonaAutorizadaById(@PathVariable Long id){
        return new ResponseEntity<>(service.findById(id), HttpStatus.OK);
    }

    @GetMapping(WebResourceKeyConstants.Endpoints.GET_BY_ID+"/usuario/{idUsuario}")
    public ResponseEntity<?> findPersonaAutorizadaByIdUsuario(@PathVariable String idUsuario){
        return new ResponseEntity<>(service.findByIdUsuario(idUsuario), HttpStatus.OK);
    }

    @GetMapping(WebResourceKeyConstants.Endpoints.GET_ALL+"/{idCargo}")
    public ResponseEntity<?> findAllByIdCargo(@PathVariable Long idCargo){
        return new ResponseEntity<>(service.findAllByIdCargo(idCargo), HttpStatus.OK);
    }

    @PostMapping(WebResourceKeyConstants.Endpoints.SAVE)
    public ResponseEntity<?> addPersonaAutorizada(@RequestBody PersonasAutorizadasEntity persona){
        return new ResponseEntity<>(service.addPersonaAutorizada(persona), HttpStatus.OK);
    }

    @PutMapping(WebResourceKeyConstants.Endpoints.UPDATE)
    public ResponseEntity<?> updatePersonaAutorizada(@RequestBody PersonasAutorizadasEntity persona){
        return new ResponseEntity<>(service.updateOrDeletePersonaAutorizada(persona), HttpStatus.OK);
    }

    @DeleteMapping(WebResourceKeyConstants.Endpoints.DELETE_BY_ID+"/{id}")
    public void deleteByID(@PathVariable Long id){
        service.deleteById(id);
    }
}
