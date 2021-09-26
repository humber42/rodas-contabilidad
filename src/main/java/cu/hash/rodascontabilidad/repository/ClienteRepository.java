package cu.hash.rodascontabilidad.repository;

import cu.hash.rodascontabilidad.models.ClienteEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<ClienteEntity, Long> {
    ClienteEntity findByIdAndNombre(Long id, String nombre);
    ClienteEntity findByNombre(String nombre);
}
