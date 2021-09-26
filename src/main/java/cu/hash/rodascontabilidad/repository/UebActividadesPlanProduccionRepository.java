package cu.hash.rodascontabilidad.repository;

import cu.hash.rodascontabilidad.models.UebActividadesPlanProduccionEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UebActividadesPlanProduccionRepository extends JpaRepository<UebActividadesPlanProduccionEntity, Long> {
}
