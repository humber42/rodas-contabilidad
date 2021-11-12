package cu.hash.rodascontabilidad.repository;

import cu.hash.rodascontabilidad.models.CategoriaAgrupacionIndirectaElementoGastoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CategoriaAgrupacionIndirectaElementoGastoRepository extends JpaRepository<CategoriaAgrupacionIndirectaElementoGastoEntity, Long> {
    Optional<CategoriaAgrupacionIndirectaElementoGastoEntity> getByIdCategoriaAgrupacionIndirectaAndIdElementoGasto(Long idCategoria, Long idElemento);
}
