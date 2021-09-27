package cu.hash.rodascontabilidad.services;

import cu.hash.rodascontabilidad.dto.CoeficienteGastosDistribucionVentasDto;
import cu.hash.rodascontabilidad.models.CoeficienteGastosDistribucionVentasEntity;
import cu.hash.rodascontabilidad.repository.CoeficienteGastosDistribucionVentasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class CoeficienteGastosDistribucionVentasService {
    @Autowired
    private CoeficienteGastosDistribucionVentasRepository repository;

    public List<CoeficienteGastosDistribucionVentasDto> findAll() {
        return repository.findAll()
                .stream()
                .map(this::mapper)
                .collect(Collectors.toList());
    }

    public Optional<CoeficienteGastosDistribucionVentasDto> findById(Long id) {
        return repository.findById(id).map(this::mapper);
    }

    public CoeficienteGastosDistribucionVentasDto addCoeficienteGDV(CoeficienteGastosDistribucionVentasEntity coeficienteGastosDistribucionVentasEntity) {
        return this.mapper(repository.save(coeficienteGastosDistribucionVentasEntity));
    }

    public CoeficienteGastosDistribucionVentasDto updateOrDeleteCoeficienteGDV(CoeficienteGastosDistribucionVentasEntity coeficienteGastosDistribucionVentasEntity) {
        return this.mapper(repository.saveAndFlush(coeficienteGastosDistribucionVentasEntity));
    }

    public CoeficienteGastosDistribucionVentasDto mapper(CoeficienteGastosDistribucionVentasEntity entity) {
        return CoeficienteGastosDistribucionVentasDto.builder()
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
