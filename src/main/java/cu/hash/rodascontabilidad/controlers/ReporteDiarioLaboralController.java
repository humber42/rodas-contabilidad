package cu.hash.rodascontabilidad.controlers;

import cu.hash.rodascontabilidad.constants.WebResourceKeyConstants;
import cu.hash.rodascontabilidad.models.ReporteDiarioLaboralEntity;
import cu.hash.rodascontabilidad.services.ReporteDiarioLaboralService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(WebResourceKeyConstants.REPORTE_DIARIO_LABORAL_API)
@Api(description = "Reporte Diario Laboral Rest Controller")
public class ReporteDiarioLaboralController {
    @Autowired
    private ReporteDiarioLaboralService service;

    @GetMapping(WebResourceKeyConstants.Endpoints.GET_ALL)
    public ResponseEntity<?> findAll(){
        return new ResponseEntity<>(service.findAll(), HttpStatus.OK);
    }

    @GetMapping(WebResourceKeyConstants.Endpoints.GET_BY_ID+"/{id}")
    public ResponseEntity<?> findPersonaAutorizadaById(@PathVariable Long id){
        return new ResponseEntity<>(service.findById(id), HttpStatus.OK);
    }

    @GetMapping(WebResourceKeyConstants.Endpoints.GET_BY_ID+"/{idTrabajador}")
    public ResponseEntity<?> findReporteDiarioByIdTrabajador(@PathVariable Long idTrabajador){
        return new ResponseEntity<>(service.findByIdTrabajador(idTrabajador), HttpStatus.OK);
    }

    @PostMapping(WebResourceKeyConstants.Endpoints.SAVE)
    public ResponseEntity<?> addReporteDiarioLaboral(@RequestBody ReporteDiarioLaboralEntity reporte){
        return new ResponseEntity<>(service.addReporteDiarioLaboral(reporte), HttpStatus.OK);
    }

    @PutMapping(WebResourceKeyConstants.Endpoints.UPDATE)
    public ResponseEntity<?> updateReporteDiarioLaboral(@RequestBody ReporteDiarioLaboralEntity reporte){
        return new ResponseEntity<>(service.updateOrDeleteReporteDiarioLaboral(reporte), HttpStatus.OK);
    }

    @DeleteMapping(WebResourceKeyConstants.Endpoints.DELETE)
    public ResponseEntity<?> deleteReporteDiarioLaboral(@RequestBody ReporteDiarioLaboralEntity reporte){
        return new ResponseEntity<>(service.updateOrDeleteReporteDiarioLaboral(reporte), HttpStatus.OK);
    }
}
