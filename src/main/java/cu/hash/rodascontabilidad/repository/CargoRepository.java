package cu.hash.rodascontabilidad.repository;

import cu.hash.rodascontabilidad.models.CargoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CargoRepository extends JpaRepository<CargoEntity, Long> {
}
