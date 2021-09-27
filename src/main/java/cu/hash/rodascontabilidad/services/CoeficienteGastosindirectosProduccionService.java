package cu.hash.rodascontabilidad.services;

import cu.hash.rodascontabilidad.dto.CoeficienteGastosindirectosProduccionDto;
import cu.hash.rodascontabilidad.models.CoeficienteGastosIndirectosProduccionEntity;
import cu.hash.rodascontabilidad.repository.CoeficienteGastosIndirectosProduccionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class CoeficienteGastosindirectosProduccionService {
    @Autowired
    private CoeficienteGastosIndirectosProduccionRepository repository;

    public List<CoeficienteGastosindirectosProduccionDto> findAll() {
        return repository.findAll().stream()
                .map(this::mapper)
                .collect(Collectors.toList());
    }

    public Optional<CoeficienteGastosindirectosProduccionDto> findById(Long id) {
        return repository.findById(id).map(this::mapper);
    }

    public CoeficienteGastosindirectosProduccionDto addCoeficienteGIP(CoeficienteGastosIndirectosProduccionEntity coeficienteGastosIndirectosProduccionEntity) {
        return this.mapper(repository.save(coeficienteGastosIndirectosProduccionEntity));
    }

    public CoeficienteGastosindirectosProduccionDto updateOrDeleteCoeficienteGIP(CoeficienteGastosIndirectosProduccionEntity coeficienteGastosIndirectosProduccionEntity) {
        return this.mapper(repository.saveAndFlush(coeficienteGastosIndirectosProduccionEntity));
    }

    private CoeficienteGastosindirectosProduccionDto mapper(CoeficienteGastosIndirectosProduccionEntity entity) {
        return CoeficienteGastosindirectosProduccionDto.builder()
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
