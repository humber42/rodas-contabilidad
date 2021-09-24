package cu.hash.rodascontabilidad.repository;

import cu.hash.rodascontabilidad.models.TipoGastoIndirectoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TipoGastoIndirectoRepositrory extends JpaRepository<TipoGastoIndirectoEntity, Long> {
}
