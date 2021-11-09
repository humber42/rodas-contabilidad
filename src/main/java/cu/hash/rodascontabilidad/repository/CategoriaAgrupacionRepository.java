package cu.hash.rodascontabilidad.repository;

import cu.hash.rodascontabilidad.models.CategoriaAgrupacionEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoriaAgrupacionRepository extends JpaRepository<CategoriaAgrupacionEntity, Long> {
    CategoriaAgrupacionEntity findByNombre(String nombre);
    CategoriaAgrupacionEntity findByIdAndNombre(Long id, String nombre);
    List<CategoriaAgrupacionEntity> findAllByTipoCategoria(String tipo);
}
