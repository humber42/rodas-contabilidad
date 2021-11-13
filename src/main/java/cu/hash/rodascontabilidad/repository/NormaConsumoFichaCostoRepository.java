package cu.hash.rodascontabilidad.repository;

import cu.hash.rodascontabilidad.models.NormaConsumoFichaCostoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface NormaConsumoFichaCostoRepository extends JpaRepository<NormaConsumoFichaCostoEntity, Long> {
    Optional<NormaConsumoFichaCostoEntity> getByIdNormaConsumoAndIdFichaCosto(long idNormaConsumo, long idFichaCosto);
}
