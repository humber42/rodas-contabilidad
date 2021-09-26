package cu.hash.rodascontabilidad.repository;

import cu.hash.rodascontabilidad.models.GastoDirectoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GastoDirectoRepository extends JpaRepository<GastoDirectoEntity, Long> {
    GastoDirectoEntity findByNombre(String nombre);
    GastoDirectoEntity findByCodigoAndNombre(String codigo, String nombre);
    GastoDirectoEntity findByIdAndCodigo(Long id, String codigo);
}
