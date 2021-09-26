package cu.hash.rodascontabilidad.repository;

import cu.hash.rodascontabilidad.models.SubelementoGastoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubelementoGastoRepository extends JpaRepository<SubelementoGastoEntity, Long> {
    SubelementoGastoEntity findByCodigoSubelemento(String codigo);
}
