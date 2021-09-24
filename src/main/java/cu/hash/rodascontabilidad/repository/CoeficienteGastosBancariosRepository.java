package cu.hash.rodascontabilidad.repository;

import cu.hash.rodascontabilidad.models.CoeficienteGastosBancariosEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CoeficienteGastosBancariosRepository extends JpaRepository<CoeficienteGastosBancariosEntity, Long> {
}
