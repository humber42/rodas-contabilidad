package cu.hash.rodascontabilidad.repository;

import cu.hash.rodascontabilidad.models.PersonasAutorizadasEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonasAutorizadasRepository extends JpaRepository<PersonasAutorizadasEntity, Long> {
    List<PersonasAutorizadasEntity> findAllByIdCargo(Long idCargo);
    PersonasAutorizadasEntity findByIdUsuario(String userID);
}
