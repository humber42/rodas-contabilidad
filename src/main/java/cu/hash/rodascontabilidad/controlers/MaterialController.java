package cu.hash.rodascontabilidad.controlers;

import cu.hash.rodascontabilidad.constants.WebResourceKeyConstants;
import cu.hash.rodascontabilidad.controlers.especialRequest.OrdenTrabajoMaterialRequest;
import cu.hash.rodascontabilidad.models.MaterialEntity;
import cu.hash.rodascontabilidad.services.MaterialService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(WebResourceKeyConstants.MATERIAL_API)
@Api(description = "Material Rest Controller")
public class MaterialController {
    @Autowired
    private MaterialService service;

    @GetMapping(WebResourceKeyConstants.Endpoints.GET_ALL)
    public ResponseEntity<?> findAll(){
        return new ResponseEntity<>(service.findAll(), HttpStatus.OK);
    }

    @GetMapping(WebResourceKeyConstants.Endpoints.GET_BY_ID+"/{id}")
    public ResponseEntity<?> findMaterialById(@PathVariable Long id){
        return new ResponseEntity<>(service.findById(id), HttpStatus.OK);
    }

    @PostMapping(WebResourceKeyConstants.Endpoints.SAVE)
    public ResponseEntity<?> addMaterial(@RequestBody MaterialEntity material){
        return new ResponseEntity<>(service.addMaterial(material), HttpStatus.OK);
    }

    @PutMapping(WebResourceKeyConstants.Endpoints.UPDATE)
    public ResponseEntity<?> updateMaterial(@RequestBody MaterialEntity material){
        return new ResponseEntity<>(service.updateOrDeleteMaterial(material), HttpStatus.OK);
    }

    @DeleteMapping(WebResourceKeyConstants.Endpoints.DELETE_BY_ID+"/{id}")
    public void deleteByID(@PathVariable Long id){
        service.deleteById(id);
    }

    @PostMapping(WebResourceKeyConstants.Endpoints.SAVE+"/especial")
    public void saveOrdenMaterial(@RequestBody OrdenTrabajoMaterialRequest request){
         service.saveEspecialMaterial(request);
    }
}
