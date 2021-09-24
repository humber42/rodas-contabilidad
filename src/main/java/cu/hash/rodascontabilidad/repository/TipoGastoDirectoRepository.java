package cu.hash.rodascontabilidad.repository;

import cu.hash.rodascontabilidad.models.TipoGastoDirectoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TipoGastoDirectoRepository extends JpaRepository<TipoGastoDirectoEntity, Long> {
}
