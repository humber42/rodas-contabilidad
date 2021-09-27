package cu.hash.rodascontabilidad.controlers;

import cu.hash.rodascontabilidad.constants.WebResourceKeyConstants;
import cu.hash.rodascontabilidad.models.ConfiguracionEntity;
import cu.hash.rodascontabilidad.services.ConfiguracionService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(WebResourceKeyConstants.CONFIGURACION_API)
@Api(description = "Configuracion Rest Controller")
public class ConfiguracionController {
    @Autowired
    private ConfiguracionService service;

    @GetMapping(WebResourceKeyConstants.Endpoints.GET_ALL)
    public ResponseEntity<?> findAll(){
        return new ResponseEntity<>(service.findAll(), HttpStatus.OK);
    }

    @GetMapping(WebResourceKeyConstants.Endpoints.GET_BY_ID+"/{id}")
    public ResponseEntity<?> findConfiguracionById(@PathVariable Long id){
        return new ResponseEntity<>(service.findById(id), HttpStatus.OK);
    }

    @PostMapping(WebResourceKeyConstants.Endpoints.SAVE)
    public ResponseEntity<?> addConfiguracion(@RequestBody ConfiguracionEntity conf){
        return new ResponseEntity<>(service.addConfiguracion(conf), HttpStatus.OK);
    }

    @PutMapping(WebResourceKeyConstants.Endpoints.UPDATE)
    public ResponseEntity<?> updateConfiguracion(@RequestBody ConfiguracionEntity conf){
        return new ResponseEntity<>(service.updateOrDeleteConfiguracion(conf), HttpStatus.OK);
    }

    @DeleteMapping(WebResourceKeyConstants.Endpoints.DELETE)
    public ResponseEntity<?> deleteConfiguracion(@RequestBody ConfiguracionEntity conf){
        return new ResponseEntity<>(service.updateOrDeleteConfiguracion(conf), HttpStatus.OK);
    }
}
