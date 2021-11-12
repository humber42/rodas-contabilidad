package cu.hash.rodascontabilidad.repository;

import cu.hash.rodascontabilidad.models.CategoriaAgrupacionIndirectaSubelementoGastoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CategoriaAgrupacionIndirectaSubelementoGastoRepository extends JpaRepository<CategoriaAgrupacionIndirectaSubelementoGastoEntity, Long> {
    Optional<CategoriaAgrupacionIndirectaSubelementoGastoEntity> getByIdCategoriaAgrupacionIndirectaAndIdSubelementoGasto(Long idCategoria, Long idSubelemento);
}
