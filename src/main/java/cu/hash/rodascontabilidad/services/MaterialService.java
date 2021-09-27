package cu.hash.rodascontabilidad.services;

import cu.hash.rodascontabilidad.dto.MaterialDto;
import cu.hash.rodascontabilidad.models.MaterialEntity;
import cu.hash.rodascontabilidad.repository.MaterialRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class MaterialService {
    @Autowired
    private MaterialRepository repository;
    @Autowired
    private OrdenTrabajoService ordenTrabajoService;

    public List<MaterialDto> findAll() {
        return repository.findAll()
                .stream()
                .map(this::mapper)
                .collect(Collectors.toList());
    }

    public Optional<MaterialDto> findById(Long id) {
        return repository.findById(id).map(this::mapper);
    }

    public MaterialDto addMaterial(MaterialEntity materialEntity) {
        return this.mapper(repository.save(materialEntity));
    }

    public MaterialDto updateOrDeleteMaterial(MaterialEntity materialEntity) {
        return this.mapper(repository.saveAndFlush(materialEntity));
    }

    private MaterialDto mapper(MaterialEntity entity) {
        return MaterialDto.builder()
                .id(entity.getId())
                .fecha(entity.getFecha())
                .importeMn(entity.getImporteMn())
                .importeMlc(entity.getImporteMlc())
                .noVSalida(entity.getNoVSalida())
                .total(entity.getTotal())
                .idOrdenTrabajo(entity.getIdOrdenTrabajo())
                .ordenTrabajoDto(ordenTrabajoService.findById(entity.getIdOrdenTrabajo()).get())
                .build();
    }
}
