package cu.hash.rodascontabilidad.services;

import cu.hash.rodascontabilidad.dto.EtapaDto;
import cu.hash.rodascontabilidad.models.EtapaEntity;
import cu.hash.rodascontabilidad.repository.EtapaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class EtapaService {
    @Autowired
    private EtapaRepository repository;
    @Autowired
    private ListResolvers resolvers;

    public List<EtapaDto> findAll() {
        return repository.findAll()
                .stream()
                .map(this::mapper)
                .collect(Collectors.toList());
    }

    public void deleteById(long id){
        repository.deleteById(id);
    }
    public Optional<EtapaDto> findById(Long id) {
        return repository.findById(id).map(this::mapper);
    }

    public EtapaDto findByNombre(String nombre) {
        return this.mapper(repository.findByNombre(nombre));
    }

    public EtapaDto findByIdAndNombre(Long id, String nombre) {
        return this.mapper(repository.findByIdAndNombre(id, nombre));
    }

    public EtapaDto addEtapa(EtapaEntity etapaEntity) {
        return this.mapper(repository.save(etapaEntity));
    }

    public EtapaDto updateOrDeleteEtapa(EtapaEntity etapaEntity) {
        return this.mapper(repository.saveAndFlush(etapaEntity));
    }

    private EtapaDto mapper(EtapaEntity entity) {
        return EtapaDto.builder()
                .id(entity.getId())
                .nombre(entity.getNombre())
                .descripcion(entity.getDescripcion())
                .orden(entity.getOrden())
                .uebList(resolvers.getUebByEtapa(entity.getId()))
                .build();
    }
}
