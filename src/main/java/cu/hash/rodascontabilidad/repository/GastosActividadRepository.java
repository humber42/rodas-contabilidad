package cu.hash.rodascontabilidad.repository;

import cu.hash.rodascontabilidad.models.GastosActividadEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GastosActividadRepository extends JpaRepository<GastosActividadEntity, Long> {
    List<GastosActividadEntity> findAllByIdActividad(Long idActividad);
}
