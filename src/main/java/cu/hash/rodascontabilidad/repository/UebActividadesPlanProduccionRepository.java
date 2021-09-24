package cu.hash.rodascontabilidad.repository;

import cu.hash.rodascontabilidad.models.UebActiviadesPlanProduccionEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UebActividadesPlanProduccionRepository extends JpaRepository<UebActiviadesPlanProduccionEntity, Long> {
}
