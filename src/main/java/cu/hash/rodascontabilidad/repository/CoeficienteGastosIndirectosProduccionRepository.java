package cu.hash.rodascontabilidad.repository;

import cu.hash.rodascontabilidad.models.CoeficienteGastosIndirectosProduccionEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CoeficienteGastosIndirectosProduccionRepository extends JpaRepository<CoeficienteGastosIndirectosProduccionEntity, Long> {
}
