package cu.hash.rodascontabilidad.services;

import cu.hash.rodascontabilidad.models.ReporteDiarioLaboralEntity;
import cu.hash.rodascontabilidad.repository.ReporteDiarioLaboralRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ReporteDiarioLaboralService {
    @Autowired
    private ReporteDiarioLaboralRepository repository;

    public List<ReporteDiarioLaboralEntity> findAll(){
        return repository.findAll();
    }

    public Optional<ReporteDiarioLaboralEntity> findById(Long id){
        return repository.findById(id);
    }

    public ReporteDiarioLaboralEntity findByIdTrabajador(Long idTrabajador){
        return repository.findByIdTrabajador(idTrabajador);
    }

    public ReporteDiarioLaboralEntity addReporteDiarioLaboral(ReporteDiarioLaboralEntity reporteDiarioLaboralEntity){
        return repository.save(reporteDiarioLaboralEntity);
    }

    public ReporteDiarioLaboralEntity updateOrDeleteReporteDiarioLaboral(ReporteDiarioLaboralEntity reporteDiarioLaboralEntity){
        return repository.saveAndFlush(reporteDiarioLaboralEntity);
    }
}
