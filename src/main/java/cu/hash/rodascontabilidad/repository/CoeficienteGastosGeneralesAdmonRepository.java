package cu.hash.rodascontabilidad.repository;

import cu.hash.rodascontabilidad.models.CoeficienteGastosGeneralesAdmonEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CoeficienteGastosGeneralesAdmonRepository extends JpaRepository<CoeficienteGastosGeneralesAdmonEntity, Long> {
}
