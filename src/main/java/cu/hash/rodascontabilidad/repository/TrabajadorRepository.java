package cu.hash.rodascontabilidad.repository;

import cu.hash.rodascontabilidad.models.TrabajadorEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TrabajadorRepository extends JpaRepository<TrabajadorEntity, Long> {
}
