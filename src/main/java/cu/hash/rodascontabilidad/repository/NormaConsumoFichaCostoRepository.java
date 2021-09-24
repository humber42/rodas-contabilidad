package cu.hash.rodascontabilidad.repository;

import cu.hash.rodascontabilidad.models.NormaConsumoFichaCostoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NormaConsumoFichaCostoRepository extends JpaRepository<NormaConsumoFichaCostoEntity, Long> {
}
