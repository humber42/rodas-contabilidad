package cu.hash.rodascontabilidad.repository;

import cu.hash.rodascontabilidad.models.ActividadEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ActividadRepository extends JpaRepository<ActividadEntity, Long> {
}
