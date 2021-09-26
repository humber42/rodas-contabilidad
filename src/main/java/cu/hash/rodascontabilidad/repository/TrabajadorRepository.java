package cu.hash.rodascontabilidad.repository;

import cu.hash.rodascontabilidad.models.TrabajadorEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TrabajadorRepository extends JpaRepository<TrabajadorEntity, Long> {
    TrabajadorEntity findFirstByNombre(String nombre);
    List<TrabajadorEntity> findAllByNombre(String nombre);
    List<TrabajadorEntity> findAllByIdUeb(Long idUEB);
    List<TrabajadorEntity> findAllByIdCargoAndIdUeb(Long idCargo, Long idUEB);
}
