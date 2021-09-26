package cu.hash.rodascontabilidad.repository;

import cu.hash.rodascontabilidad.models.GastoIndirectoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GastoIndirectoRepository extends JpaRepository<GastoIndirectoEntity, Long> {
    GastoIndirectoEntity findByNombre(String nombre);
    GastoIndirectoEntity findByCodigoAndNombre(String codigo, String nombre);
    GastoIndirectoEntity findByIdAndCodigo(Long id, String codigo);
}
