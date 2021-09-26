package cu.hash.rodascontabilidad.repository;

import cu.hash.rodascontabilidad.models.PlanProduccionEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PlanProduccionRepository extends JpaRepository<PlanProduccionEntity, Long> {
    List<PlanProduccionEntity> findAllByIdUeb(Long idUEB);
}
