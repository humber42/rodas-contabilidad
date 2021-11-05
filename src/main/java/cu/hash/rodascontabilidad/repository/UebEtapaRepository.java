package cu.hash.rodascontabilidad.repository;

import cu.hash.rodascontabilidad.models.UebEtapaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UebEtapaRepository extends JpaRepository<UebEtapaEntity, Long> {
    Optional<UebEtapaEntity> getByIdEtapaAndIdUeb(long idEtapa,long idUeb);
}
