package cu.hash.rodascontabilidad.services;

import cu.hash.rodascontabilidad.dto.FichaCostoDto;
import cu.hash.rodascontabilidad.models.FichaCostoEntity;
import cu.hash.rodascontabilidad.repository.FichaCostoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class FichaCostoService {
    @Autowired
    private FichaCostoRepository repository;
    @Autowired
    private ActividadService actividadService;
    @Autowired
    private ListResolvers listResolvers;

    public List<FichaCostoDto> findAll() {
        return repository.findAll().stream().map(this::mapper).collect(Collectors.toList());
    }

    public Optional<FichaCostoDto> findById(Long id) {
        return repository.findById(id).map(this::mapper);
    }

    public List<FichaCostoDto> findAllByIdActividad(Long idActividad) {
        return repository.findAllByIdActividad(idActividad).stream().map(this::mapper).collect(Collectors.toList());
    }

    public FichaCostoDto findByIdAndIdActividad(Long id, Long idActividad) {
        return this.mapper(repository.findByIdAndIdActividad(id, idActividad));
    }

    public FichaCostoDto addFichaCosto(FichaCostoEntity fichaCostoEntity) {
        return this.mapper(repository.save(fichaCostoEntity));
    }

    public FichaCostoDto updateOrDeleteFichaCosto(FichaCostoEntity fichaCostoEntity) {
        return this.mapper(repository.saveAndFlush(fichaCostoEntity));
    }

    private FichaCostoDto mapper(FichaCostoEntity entity) {
        return FichaCostoDto.builder()
                .id(entity.getId())
                .idActividad(entity.getIdActividad())
                .aprobada(entity.getAprobada())
                .actividad(actividadService.findById(entity.getIdActividad()).get())
                .normasConsumoList(listResolvers.getNormaConsumoByFichaCosto(entity.getId()))
                .ordenTrabajoList(listResolvers.getOrdenTrabajoByFichaCosto(entity.getId()))
                .build();
    }
}
