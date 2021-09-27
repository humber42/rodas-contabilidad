package cu.hash.rodascontabilidad.services;

import cu.hash.rodascontabilidad.dto.CoeficienteDto;
import cu.hash.rodascontabilidad.models.CoeficienteEntity;
import cu.hash.rodascontabilidad.repository.CoeficienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class CoeficienteService {
    @Autowired
    private CoeficienteRepository repository;
    @Autowired
    private CoeficienteGastosBancariosService coeficienteGastosBancariosService;
    @Autowired
    private CoeficienteGastosDistribucionVentasService coeficienteGastosDistribucionVentasService;
    @Autowired
    private CoeficienteGastosGeneralesAdmonService coeficienteGastosGeneralesAdmonService;
    @Autowired
    private CoeficienteGastosindirectosProduccionService coeficienteGastosindirectosProduccionService;


    public void deleteById(long id){
        repository.deleteById(id);
    }
    public List<CoeficienteDto> findAll() {
        return repository.findAll().stream()
                .map(this::mapper)
                .collect(Collectors.toList());
    }

    public Optional<CoeficienteDto> findById(Long id) {
        return repository.findById(id).map(this::mapper);
    }

    public List<CoeficienteDto> findAllByFecha(Date date) {
        return repository.findAllByFecha(date)
                .stream()
                .map(this::mapper)
                .collect(Collectors.toList());
    }

    public CoeficienteDto findByFecha(Date date) {
        return this.mapper(repository.findByFecha(date));
    }

    public CoeficienteDto addCoeficienteGIP(CoeficienteEntity coeficienteEntity) {
        return this.mapper(repository.save(coeficienteEntity));
    }

    public CoeficienteDto updateOrDeleteCoeficienteGIP(CoeficienteEntity coeficienteEntity) {
        return this.mapper(repository.saveAndFlush(coeficienteEntity));
    }

    private CoeficienteDto mapper(CoeficienteEntity entity) {
        return CoeficienteDto.builder()
                .id(entity.getId())
                .fecha(entity.getFecha())
                .idCoeficienteGastoGeneralesAdmon(entity.getIdCoeficienteGastoGeneralesAdmon())
                .idCoeficientesGastosIndirectosProduccion(entity.getIdCoeficientesGastosIndirectosProduccion())
                .idCoeficienteGastosBancarios(entity.getIdCoeficienteGastosBancarios())
                .idCoeficienteGastosDistribucionVentas(entity.getIdCoeficienteGastosDistribucionVentas())
                .coeficienteGastosBancarios(coeficienteGastosBancariosService.findById(entity.getIdCoeficienteGastosBancarios()).get())
                .coeficienteGastosindirectosProduccion(coeficienteGastosindirectosProduccionService.findById(entity.getIdCoeficientesGastosIndirectosProduccion()).get())
                .coeficienteGastosGeneralesAdmon(coeficienteGastosGeneralesAdmonService.findById(entity.getIdCoeficienteGastoGeneralesAdmon()).get())
                .coeficienteGastosDistribucionVentas(coeficienteGastosDistribucionVentasService.findById(entity.getIdCoeficienteGastosDistribucionVentas()).get())
                .build();
    }
}
