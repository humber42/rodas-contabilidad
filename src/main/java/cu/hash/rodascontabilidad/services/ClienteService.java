package cu.hash.rodascontabilidad.services;

import cu.hash.rodascontabilidad.dto.ClienteDto;
import cu.hash.rodascontabilidad.models.ClienteEntity;
import cu.hash.rodascontabilidad.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ClienteService {
    @Autowired
    private ClienteRepository repository;
    @Autowired
    private ListResolvers listResolvers;

    public List<ClienteDto> findAll() {
        return repository.findAll()
                .stream()
                .map(this::mapper)
                .collect(Collectors.toList());
    }

    public void deleteById(long id){
        repository.deleteById(id);
    }
    public Optional<ClienteDto> findById(Long id) {
        return repository.findById(id).map(this::mapper);
    }

    public ClienteDto findByIdAndNombre(Long id, String nombre) {
        return this.mapper(repository.findByIdAndNombre(id, nombre));
    }

    public ClienteDto findByNombre(String nombre) {
        return this.mapper(repository.findByNombre(nombre));
    }

    public ClienteDto addCliente(ClienteEntity clienteEntity) {
        return this.mapper(repository.save(clienteEntity));
    }

    public ClienteDto updateOrDeleteCliente(ClienteEntity clienteEntity) {
        return this.mapper(repository.saveAndFlush(clienteEntity));
    }

    private ClienteDto mapper(ClienteEntity entity) {
        return ClienteDto.builder()
                .id(entity.getId())
                .nombre(entity.getNombre())
                .descripcion(entity.getDescripcion())
                .ordenTrabajoList(listResolvers.getOrdenTrabajoByCliente(entity.getId()))
                .build();
    }
}
