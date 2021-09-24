package cu.hash.rodascontabilidad.repository;

import cu.hash.rodascontabilidad.models.ElementoGastoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ElementoGastoRepository extends JpaRepository<ElementoGastoEntity, Long> {
}
