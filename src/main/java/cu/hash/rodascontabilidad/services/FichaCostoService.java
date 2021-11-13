package cu.hash.rodascontabilidad.services;

import cu.hash.rodascontabilidad.dto.FichaCostoDto;
import cu.hash.rodascontabilidad.dto.classesWhithoutCollections.FichaCostoWhithoutList;
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
    public void deleteById(long id){
        repository.deleteById(id);
    }

    public Optional<FichaCostoDto> findById(Long id) {
        return repository.findById(id).map(this::mapper);
    }

    public Optional<FichaCostoWhithoutList> findByIdToListResolver(Long id) {
        return repository.findById(id).map(this::mapperToListResolvers);
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

    public FichaCostoDto approveOrDisaprove(long id) {
        Optional<FichaCostoEntity> entity = repository.findById(id);
        if (entity.isPresent()) {
            entity.get().setAprobada(!entity.get().getAprobada());
            return this.updateOrDeleteFichaCosto(entity.get());
        }
        return null;
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

    private FichaCostoWhithoutList mapperToListResolvers(FichaCostoEntity entity) {
        return FichaCostoWhithoutList.builder()
                .id(entity.getId())
                .idActividad(entity.getIdActividad())
                .aprobada(entity.getAprobada())
                .actividadWithoutList(actividadService.findByIdToListResolver(entity.getIdActividad()).get())
                .build();
    }
}
