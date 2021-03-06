package cu.hash.rodascontabilidad.repository;

import cu.hash.rodascontabilidad.models.OrdenTrabajoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrdenTrabajoRepository extends JpaRepository<OrdenTrabajoEntity, Long> {
}
