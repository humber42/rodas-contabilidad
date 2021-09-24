package cu.hash.rodascontabilidad.repository;

import cu.hash.rodascontabilidad.models.ConfiguracionEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConfiguracionRepository extends JpaRepository<ConfiguracionEntity, Long> {
}
