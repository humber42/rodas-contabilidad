package cu.hash.rodascontabilidad.repository;

import cu.hash.rodascontabilidad.models.NormasConsumoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NormasConsumoRepository extends JpaRepository<NormasConsumoEntity, Long> {
}
