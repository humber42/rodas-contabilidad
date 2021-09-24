package cu.hash.rodascontabilidad.repository;

import cu.hash.rodascontabilidad.models.PlanProduccionEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlanProduccionRepository extends JpaRepository<PlanProduccionEntity, Long> {
}
