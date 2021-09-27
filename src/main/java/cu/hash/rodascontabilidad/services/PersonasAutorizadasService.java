package cu.hash.rodascontabilidad.services;

import cu.hash.rodascontabilidad.dto.PersonasAutorizadasDto;
import cu.hash.rodascontabilidad.feignInterface.UserInterface;
import cu.hash.rodascontabilidad.models.PersonasAutorizadasEntity;
import cu.hash.rodascontabilidad.repository.PersonasAutorizadasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class PersonasAutorizadasService {
    @Autowired
    private PersonasAutorizadasRepository repository;
    @Autowired
    private CargoService cargoService;
    @Autowired
    private UserInterface userInterface;

    public List<PersonasAutorizadasDto> findAll() {
        return repository.findAll()
                .stream()
                .map(this::mapper)
                .collect(Collectors.toList());
    }
    public void deleteById(long id){
        repository.deleteById(id);
    }

    public Optional<PersonasAutorizadasDto> findById(Long id) {
        return repository.findById(id).map(this::mapper);
    }

    public List<PersonasAutorizadasDto> findAllByIdCargo(Long idCargo) {
        return repository.findAllByIdCargo(idCargo)
                .stream()
                .map(this::mapper)
                .collect(Collectors.toList());
    }

    public PersonasAutorizadasDto findByIdUsuario(String userID) {
        return this.mapper(repository.findByIdUsuario(userID));
    }

    public PersonasAutorizadasDto addPersonaAutorizada(PersonasAutorizadasEntity personasAutorizadasEntity) {
        return this.mapper(repository.save(personasAutorizadasEntity));
    }

    public PersonasAutorizadasDto updateOrDeletePersonaAutorizada(PersonasAutorizadasEntity personasAutorizadasEntity) {
        return this.mapper(repository.saveAndFlush(personasAutorizadasEntity));
    }

    private PersonasAutorizadasDto mapper(PersonasAutorizadasEntity entity) {
        return PersonasAutorizadasDto.builder()
                .id(entity.getId())
                .idUsuario(entity.getIdUsuario())
                .idCargo(entity.getIdCargo())
                .cargoDto(cargoService.findById(entity.getIdCargo()).get())
                .usuario(userInterface.searchById(Integer.valueOf(entity.getIdUsuario())))
                .build();
    }
}
