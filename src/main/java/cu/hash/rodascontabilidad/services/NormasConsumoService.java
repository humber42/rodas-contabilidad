package cu.hash.rodascontabilidad.services;

import cu.hash.rodascontabilidad.dto.NormasConsumoDto;
import cu.hash.rodascontabilidad.dto.classesWhithoutCollections.NormasConsumoWithoutList;
import cu.hash.rodascontabilidad.models.NormasConsumoEntity;
import cu.hash.rodascontabilidad.repository.NormasConsumoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class NormasConsumoService {
    @Autowired
    private NormasConsumoRepository repository;
    @Autowired
    private ActividadService actividadService;
    @Autowired
    private PlanProduccionService planProduccionService;
    @Autowired
    private UebService uebService;
    @Autowired
    private ListResolvers listResolvers;

    public List<NormasConsumoDto> findAll() {
        return repository.findAll()
                .stream()
                .map(this::mapper)
                .collect(Collectors.toList());
    }


    public List<NormasConsumoEntity> findAllWithoutMapping(){
        return repository.findAll();
    }
    public void deleteById(long id){
        repository.deleteById(id);
    }

    public Optional<NormasConsumoDto> findById(Long id) {
        return repository.findById(id).map(this::mapper);
    }

    public Optional<NormasConsumoWithoutList> findByIdToListResolvers(Long id) {
        return repository.findById(id).map(this::mapperToListResolver);
    }

    public NormasConsumoDto addNormaConsumo(NormasConsumoEntity normasConsumoEntity) {
        return this.mapper(repository.save(normasConsumoEntity));
    }

    public NormasConsumoDto updateOrDeleteNormaConsumo(NormasConsumoEntity normasConsumoEntity) {
        return this.mapper(repository.saveAndFlush(normasConsumoEntity));
    }

    private NormasConsumoDto mapper(NormasConsumoEntity entity) {
        return NormasConsumoDto.builder()
                .id(entity.getId())
                .idActividad(entity.getIdActividad())
                .idPlanProduccion(entity.getIdPlanProduccion())
                .capacidadInstalada(entity.getCapacidadInstalada())
                .capacidadInstaladaUtilizacionPercent(entity.getCapacidadInstaladaUtilizacionPercent())
                .produccionPeriodoAnterior(entity.getProduccionPeriodoAnterior())
                .margenUtilidadPercentCuc(entity.getMargenUtilidadPercentCuc())
                .margenUtilidadPercentMt(entity.getMargenUtilidadPercentMt())
                .precio(entity.getPrecio())
                .idUeb(entity.getIdUeb())
                .nombreAprueba(entity.getNombreAprueba())
                .cargoAprueba(entity.getCargoAprueba())
                .actividad(actividadService.findById(entity.getIdActividad()).get())
                .planProduccion(planProduccionService.findById(entity.getIdPlanProduccion()).get())
                .ueb(uebService.findById(entity.getIdUeb()).get())
                .fichaCostoList(listResolvers.getFichaCostoByNormaConsumo(entity.getId()))
                .build();
    }

    private NormasConsumoWithoutList mapperToListResolver(NormasConsumoEntity entity) {
        return NormasConsumoWithoutList.builder()
                .id(entity.getId())
                .idActividad(entity.getIdActividad())
                .idPlanProduccion(entity.getIdPlanProduccion())
                .capacidadInstalada(entity.getCapacidadInstalada())
                .capacidadInstaladaUtilizacionPercent(entity.getCapacidadInstaladaUtilizacionPercent())
                .produccionPeriodoAnterior(entity.getProduccionPeriodoAnterior())
                .margenUtilidadPercentCuc(entity.getMargenUtilidadPercentCuc())
                .margenUtilidadPercentMt(entity.getMargenUtilidadPercentMt())
                .precio(entity.getPrecio())
                .idUeb(entity.getIdUeb())
                .nombreAprueba(entity.getNombreAprueba())
                .cargoAprueba(entity.getCargoAprueba())
                .build();
    }
}
