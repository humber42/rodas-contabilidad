package cu.hash.rodascontabilidad.repository;

import cu.hash.rodascontabilidad.models.ActividadEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;


@Repository
public interface ActividadRepository extends JpaRepository<ActividadEntity, Long> {
    List<ActividadEntity> findAllByIdTipoActividad(Long id);
    ActividadEntity findByIdAndCodigo(Long id, String codigo);
}
