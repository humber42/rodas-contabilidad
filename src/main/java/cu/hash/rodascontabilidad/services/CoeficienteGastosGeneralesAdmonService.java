package cu.hash.rodascontabilidad.services;

import cu.hash.rodascontabilidad.dto.CoeficienteGastosGeneralesAdmonDto;
import cu.hash.rodascontabilidad.models.CoeficienteGastosGeneralesAdmonEntity;
import cu.hash.rodascontabilidad.repository.CoeficienteGastosGeneralesAdmonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class CoeficienteGastosGeneralesAdmonService {
    @Autowired
    private CoeficienteGastosGeneralesAdmonRepository repository;

    public List<CoeficienteGastosGeneralesAdmonDto> findAll() {
        return repository.findAll()
                .stream()
                .map(this::mapper)
                .collect(Collectors.toList());
    }

    public Optional<CoeficienteGastosGeneralesAdmonDto> findById(Long id) {
        return repository.findById(id).map(this::mapper);
    }

    public CoeficienteGastosGeneralesAdmonDto addCoeficienteGGA(CoeficienteGastosGeneralesAdmonEntity coeficienteGastosGeneralesAdmonEntity) {
        return this.mapper(repository.save(coeficienteGastosGeneralesAdmonEntity));
    }

    public CoeficienteGastosGeneralesAdmonDto updateOrDeleteCoeficienteGGA(CoeficienteGastosGeneralesAdmonEntity coeficienteGastosGeneralesAdmonEntity) {
        return this.mapper(repository.saveAndFlush(coeficienteGastosGeneralesAdmonEntity));
    }

    private CoeficienteGastosGeneralesAdmonDto mapper(CoeficienteGastosGeneralesAdmonEntity entity) {
        return CoeficienteGastosGeneralesAdmonDto.builder()
                .id(entity.getId())
                .coeficienteGastoTotalMn(entity.getCoeficienteGastoTotalMn())
                .coeficienteGastoTotalMlc(entity.getCoeficienteGastoTotalMlc())
                .coeficienteGastoTotalMt(entity.getCoeficienteGastoTotalMt())
                .coeficienteGastoDeprecMn(entity.getCoeficienteGastoDeprecMn())
                .coeficienteGastoDeprecMlc(entity.getCoeficienteGastoDeprecMlc())
                .coeficienteGastoDeprecMt(entity.getCoeficienteGastoDeprecMt())
                .coeficienteGastoMantenimientoYRepMn(entity.getCoeficienteGastoMantenimientoYRepMn())
                .coeficienteGastoMantenimientoYRepMlc(entity.getCoeficienteGastoMantenimientoYRepMlc())
                .coeficienteGastoMantenimientoYRepMt(entity.getCoeficienteGastoMantenimientoYRepMt())
                .build();
    }
}
