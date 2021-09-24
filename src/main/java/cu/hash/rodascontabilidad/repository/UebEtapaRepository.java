package cu.hash.rodascontabilidad.repository;

import cu.hash.rodascontabilidad.models.UebEtapaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UebEtapaRepository extends JpaRepository<UebEtapaEntity, Long> {
}
