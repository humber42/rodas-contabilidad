package cu.hash.rodascontabilidad.repository;

import cu.hash.rodascontabilidad.models.CategoriaAgrupacionIndirectaSubelementoGastoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriaAgrupacionIndirectaSubelementoGastoRepository extends JpaRepository<CategoriaAgrupacionIndirectaSubelementoGastoEntity, Long> {
}
