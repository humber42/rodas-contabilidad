package cu.hash.rodascontabilidad.repository;

import cu.hash.rodascontabilidad.models.CoeficienteGastosDistribucionVentasEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CoeficienteGastosDistribucionVentasRepository extends JpaRepository<CoeficienteGastosDistribucionVentasEntity, Long> {
}
