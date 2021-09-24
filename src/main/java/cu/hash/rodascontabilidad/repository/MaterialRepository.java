package cu.hash.rodascontabilidad.repository;

import cu.hash.rodascontabilidad.models.MaterialEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MaterialRepository extends JpaRepository<MaterialEntity, Long> {
}
