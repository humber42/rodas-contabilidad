package cu.hash.rodascontabilidad.repository;

import cu.hash.rodascontabilidad.models.OrdenFacturacionEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrdenFacturacionRepository extends JpaRepository<OrdenFacturacionEntity, Long> {
}
