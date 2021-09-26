package cu.hash.rodascontabilidad.repository;

import cu.hash.rodascontabilidad.models.CoeficienteEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.sql.Date;
import java.util.List;

@Repository
public interface CoeficienteRepository extends JpaRepository<CoeficienteEntity, Long> {
    List<CoeficienteEntity> findAllByFecha(Date date);
    CoeficienteEntity findByFecha(Date date);
}
