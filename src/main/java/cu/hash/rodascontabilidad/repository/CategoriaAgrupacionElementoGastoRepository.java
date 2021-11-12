package cu.hash.rodascontabilidad.repository;

import cu.hash.rodascontabilidad.models.CategoriaAgrupacionElementoGastoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CategoriaAgrupacionElementoGastoRepository extends JpaRepository<CategoriaAgrupacionElementoGastoEntity, Long> {
    Optional<CategoriaAgrupacionElementoGastoEntity> getByIdCategoriaAgrupacionAndIdElementoGasto(Long idCategoria, Long idElemento);
}
