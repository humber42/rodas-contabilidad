package cu.hash.rodascontabilidad.services;

import cu.hash.rodascontabilidad.controlers.especialRequest.OrdenTrabajoReporteDiarioRequest;
import cu.hash.rodascontabilidad.controlers.especialRequest.ReporteDiarioLaboralEspecial;
import cu.hash.rodascontabilidad.dto.ReporteDiarioLaboralDto;
import cu.hash.rodascontabilidad.models.ReporteDiarioLaboralEntity;
import cu.hash.rodascontabilidad.repository.ReporteDiarioLaboralRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ReporteDiarioLaboralService {
    @Autowired
    private ReporteDiarioLaboralRepository repository;
    @Autowired
    private TrabajadorService trabajadorService;
    @Autowired
    private OrdenTrabajoService ordenTrabajoService;

    public List<ReporteDiarioLaboralDto> findAll() {
        return repository.findAll().stream().map(this::mapper).collect(Collectors.toList());
    }

    public List<ReporteDiarioLaboralEntity> findAllWithoutMapping(){
        return repository.findAll();
    }
    public void deleteById(long id){
        repository.deleteById(id);
    }

    public Optional<ReporteDiarioLaboralDto> findById(Long id) {
        return repository.findById(id).map(this::mapper);
    }

    public ReporteDiarioLaboralDto findByIdTrabajador(Long idTrabajador) {
        return this.mapper(repository.findByIdTrabajador(idTrabajador));
    }

    public ReporteDiarioLaboralDto addReporteDiarioLaboral(ReporteDiarioLaboralEntity reporteDiarioLaboralEntity) {
        return this.mapper(repository.save(reporteDiarioLaboralEntity));
    }

    public ReporteDiarioLaboralDto updateOrDeleteReporteDiarioLaboral(ReporteDiarioLaboralEntity reporteDiarioLaboralEntity) {
        return this.mapper(repository.saveAndFlush(reporteDiarioLaboralEntity));
    }

    public void saveEspecialReporte(OrdenTrabajoReporteDiarioRequest request){
        if(!request.getEspecialList().isEmpty()){
            for (ReporteDiarioLaboralEspecial reporte:
                    request.getEspecialList() ) {
                ReporteDiarioLaboralEntity entity = new ReporteDiarioLaboralEntity();
                entity.setIdTrabajador(reporte.getTrabajador().getId());
                entity.setFecha(reporte.getFecha());
                entity.setCantHoras(reporte.getCantHoras());
                entity.setIdOrdenTrabajo(request.getOrdenTrabajoId());
                this.addReporteDiarioLaboral(entity);
            }
        }
    }

    private ReporteDiarioLaboralDto mapper(ReporteDiarioLaboralEntity entity) {
        return ReporteDiarioLaboralDto.builder()
                .id(entity.getId())
                .idTrabajador(entity.getIdTrabajador())
                .fecha(entity.getFecha())
                .cantHoras(entity.getCantHoras())
                .idOrdenTrabajo(entity.getIdOrdenTrabajo())
                .ordenTrabajo(ordenTrabajoService.findById(entity.getIdOrdenTrabajo()).get())
                .trabajador(trabajadorService.findById(entity.getIdTrabajador()).get())
                .build();
    }
}
