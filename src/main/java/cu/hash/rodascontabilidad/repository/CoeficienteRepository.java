package cu.hash.rodascontabilidad.repository;

import cu.hash.rodascontabilidad.models.CoeficienteEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CoeficienteRepository extends JpaRepository<CoeficienteEntity, Long> {
}
