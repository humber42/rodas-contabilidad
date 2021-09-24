package cu.hash.rodascontabilidad.repository;

import cu.hash.rodascontabilidad.models.CategoriaAgrupacionEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriaAgrupacionRepository extends JpaRepository<CategoriaAgrupacionEntity, Long> {
}
