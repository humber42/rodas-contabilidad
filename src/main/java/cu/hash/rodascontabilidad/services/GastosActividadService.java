package cu.hash.rodascontabilidad.services;

import cu.hash.rodascontabilidad.dto.GastosActividadDto;
import cu.hash.rodascontabilidad.models.GastosActividadEntity;
import cu.hash.rodascontabilidad.repository.GastosActividadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class GastosActividadService {
    @Autowired
    private GastosActividadRepository repository;
    @Autowired
    private GastoDirectoService gastoDirectoService;
    @Autowired
    private GastoIndirectoService gastoIndirectoService;
    @Autowired
    private ActividadService actividadService;

    public List<GastosActividadDto> findAll() {
        return repository.findAll()
                .stream()
                .map(this::mapper)
                .collect(Collectors.toList());
    }
    public void deleteById(long id){
        repository.deleteById(id);
    }

    public List<GastosActividadDto> findAllByIdActividad(Long idActividad) {
        return repository.findAllByIdActividad(idActividad).stream()
                .map(this::mapper)
                .collect(Collectors.toList());
    }

    public Optional<GastosActividadDto> findById(Long id) {
        return repository.findById(id).map(this::mapper);
    }

    public GastosActividadDto addGastosActividad(GastosActividadEntity gastosActividadEntity) {
        return this.mapper(repository.save(gastosActividadEntity));
    }

    public GastosActividadDto updateOrDeleteGastosActividad(GastosActividadEntity gastosActividadEntity) {
        return this.mapper(repository.saveAndFlush(gastosActividadEntity));
    }

    private GastosActividadDto mapper(GastosActividadEntity entity) {
        return GastosActividadDto.builder()
                .id(entity.getId())
                .idActividad(entity.getIdActividad())
                .idGastoDirecto(entity.getIdGastoDirecto())
                .idGastoIndirecto(entity.getIdGastoIndirecto())
                .gastoDirecto(gastoDirectoService.findById(entity.getIdGastoDirecto()).get())
                .gastoIndirecto(gastoIndirectoService.findById(entity.getIdGastoIndirecto()).get())
                .actividad(actividadService.findById(entity.getIdActividad()).get())
                .build();
    }
}
