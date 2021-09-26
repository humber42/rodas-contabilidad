package cu.hash.rodascontabilidad.repository;


import cu.hash.rodascontabilidad.models.ReporteDiarioLaboralEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReporteDiarioLaboralRepository extends JpaRepository<ReporteDiarioLaboralEntity, Long> {
    ReporteDiarioLaboralEntity findByIdTrabajador(Long idTrabajador);
}
