package cu.hash.rodascontabilidad.repository;

import cu.hash.rodascontabilidad.models.PersonasAutorizadasEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonasAutorizadasRepository extends JpaRepository<PersonasAutorizadasEntity, Long> {
}
