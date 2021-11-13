package cu.hash.rodascontabilidad.repository;

import cu.hash.rodascontabilidad.models.UebActividadesPlanProduccionEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UebActividadesPlanProduccionRepository extends JpaRepository<UebActividadesPlanProduccionEntity, Long> {

    Optional<UebActividadesPlanProduccionEntity> getByIdActividadAndIdPlanProduccion(long idActividad, long idPlanProduccion);

}
