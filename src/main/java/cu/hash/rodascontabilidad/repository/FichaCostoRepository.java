package cu.hash.rodascontabilidad.repository;

import cu.hash.rodascontabilidad.models.FichaCostoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FichaCostoRepository extends JpaRepository<FichaCostoEntity, Long> {
    List<FichaCostoEntity> findAllByIdActividad(Long idActividad);
    FichaCostoEntity findByIdAndIdActividad(Long id, Long idActividad);
}
