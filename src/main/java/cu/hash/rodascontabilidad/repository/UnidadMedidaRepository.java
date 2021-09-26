package cu.hash.rodascontabilidad.repository;

import cu.hash.rodascontabilidad.models.UnidadMedidaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UnidadMedidaRepository extends JpaRepository<UnidadMedidaEntity, Long> {
    UnidadMedidaEntity findByIdAndNombre(Long id, String nombre);
    UnidadMedidaEntity findByCodigoUnidadMedida(String codigo);
}
