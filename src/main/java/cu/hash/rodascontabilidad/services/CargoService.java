package cu.hash.rodascontabilidad.services;

import cu.hash.rodascontabilidad.models.CargoEntity;
import cu.hash.rodascontabilidad.repository.CargoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CargoService {
    @Autowired
    private CargoRepository repository;

    public List<CargoEntity> findAll(){
        return repository.findAll();
    }

    public Optional<CargoEntity> findById(Long id){
        return repository.findById(id);
    }

    public CargoEntity findByNombre(String nombre){
        return repository.findByNombre(nombre);
    }

    public CargoEntity findByIdAndNombre(Long id, String nombre){
        return repository.findByIdAndNombre(id, nombre);
    }

    public CargoEntity addCargo(CargoEntity cargoEntity){
        return repository.save(cargoEntity);
    }

    public CargoEntity updateOrDeleteCargo(CargoEntity cargoEntity){
        return repository.saveAndFlush(cargoEntity);
    }
}
