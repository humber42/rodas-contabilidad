package cu.hash.rodascontabilidad.repository;

import cu.hash.rodascontabilidad.models.UebEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UEBRepository extends JpaRepository<UebEntity, Long> {
    UebEntity findByCodigoUeb(String codigo);
    UebEntity findByIdAndNombreUeb(Long id, String nombre);
}
