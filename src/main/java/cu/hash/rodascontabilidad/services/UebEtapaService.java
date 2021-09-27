package cu.hash.rodascontabilidad.services;

import cu.hash.rodascontabilidad.dto.UebEtapaDto;
import cu.hash.rodascontabilidad.models.UebEtapaEntity;
import cu.hash.rodascontabilidad.repository.UebEtapaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class UebEtapaService {
    @Autowired
    private UebEtapaRepository repository;
    @Autowired
    private UebService uebService;
    @Autowired
    private EtapaService etapaService;

    public List<UebEtapaDto> findAll() {
        return repository.findAll().stream().map(this::mapper).collect(Collectors.toList());
    }

    public Optional<UebEtapaDto> findById(Long id) {
        return repository.findById(id).map(this::mapper);
    }

    public UebEtapaDto addUebEtapa(UebEtapaEntity uebEtapaEntity) {
        return this.mapper(repository.save(uebEtapaEntity));
    }

    public UebEtapaDto updateOrDeleteUebEtapa(UebEtapaEntity uebEtapaEntity) {
        return this.mapper(repository.saveAndFlush(uebEtapaEntity));
    }

    private UebEtapaDto mapper(UebEtapaEntity entity) {
        return UebEtapaDto.builder()
                .id(entity.getId())
                .idUeb(entity.getIdUeb())
                .idEtapa(entity.getIdEtapa())
                .ueb(uebService.findById(entity.getIdUeb()).get())
                .etapa(etapaService.findById(entity.getIdEtapa()).get())
                .build();
    }
}
