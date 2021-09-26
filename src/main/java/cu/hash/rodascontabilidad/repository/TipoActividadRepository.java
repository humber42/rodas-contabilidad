package cu.hash.rodascontabilidad.repository;

import cu.hash.rodascontabilidad.models.TipoActividadEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TipoActividadRepository extends JpaRepository<TipoActividadEntity, Long> {
    TipoActividadEntity findByIdAndCodigo(Long id, String codigo);
    TipoActividadEntity findByIdAndNombre(Long id, String nombre);
}
