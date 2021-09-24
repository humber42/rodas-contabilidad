package cu.hash.rodascontabilidad.repository;

import cu.hash.rodascontabilidad.models.CategoriaAgrupacionIndirectaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriaAgrupacionIndirectaRepository extends JpaRepository<CategoriaAgrupacionIndirectaEntity, Long> {
}
