package cu.hash.rodascontabilidad.services;

import cu.hash.rodascontabilidad.dto.CoeficienteGastosBancariosDto;
import cu.hash.rodascontabilidad.models.CoeficienteGastosBancariosEntity;
import cu.hash.rodascontabilidad.repository.CoeficienteGastosBancariosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class CoeficienteGastosBancariosService {
    @Autowired
    private CoeficienteGastosBancariosRepository repository;

    public List<CoeficienteGastosBancariosDto> findAll() {
        return repository.findAll()
                .stream()
                .map(this::mapper)
                .collect(Collectors.toList());
    }
    public void deleteById(long id){
        repository.deleteById(id);
    }

    public Optional<CoeficienteGastosBancariosDto> findById(Long id) {
        return repository.findById(id).map(this::mapper);
    }

    public CoeficienteGastosBancariosDto addCoeficienteGB(CoeficienteGastosBancariosEntity coeficienteGastosBancariosEntity) {
        return this.mapper(repository.save(coeficienteGastosBancariosEntity));
    }

    public CoeficienteGastosBancariosDto updateOrDeleteCoeficienteGB(CoeficienteGastosBancariosEntity coeficienteGastosBancariosEntity) {
        return this.mapper(repository.saveAndFlush(coeficienteGastosBancariosEntity));
    }

    private CoeficienteGastosBancariosDto mapper(CoeficienteGastosBancariosEntity entity) {
        return CoeficienteGastosBancariosDto.builder()
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
