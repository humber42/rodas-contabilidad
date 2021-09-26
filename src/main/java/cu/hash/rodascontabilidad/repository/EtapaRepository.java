package cu.hash.rodascontabilidad.repository;

import cu.hash.rodascontabilidad.models.EtapaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EtapaRepository extends JpaRepository<EtapaEntity, Long> {
    EtapaEntity findByNombre(String nombre);
    EtapaEntity findByIdAndNombre(Long id, String nombre);
}
