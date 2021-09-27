package cu.hash.rodascontabilidad.services;

import cu.hash.rodascontabilidad.dto.UebDto;
import cu.hash.rodascontabilidad.models.UebEntity;
import cu.hash.rodascontabilidad.repository.UEBRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class UebService {
    @Autowired
    private UEBRepository repository;
    @Autowired
    private ListResolvers listResolvers;

    public List<UebDto> findAll() {
        return repository.findAll()
                .stream()
                .map(this::mapper)
                .collect(Collectors.toList());
    }

    public Optional<UebDto> findById(Long id) {
        return repository.findById(id).map(this::mapper);
    }

    public UebDto findByCodigoUeb(String codigo) {
        return this.mapper(repository.findByCodigoUeb(codigo));
    }

    public UebDto findByIdAndNombreUeb(Long id, String nombre) {
        return this.mapper(repository.findByIdAndNombreUeb(id, nombre));
    }

    public UebDto addUEB(UebEntity ueb) {
        return this.mapper(repository.save(ueb));
    }

    public UebDto updateOrDeleteUEB(UebEntity ueb) {
        return this.mapper(repository.saveAndFlush(ueb));
    }

    private UebDto mapper(UebEntity entity) {
        return UebDto.builder()
                .id(entity.getId())
                .codigoUeb(entity.getCodigoUeb())
                .nombreUeb(entity.getNombreUeb())
                .descripcion(entity.getDescripcion())
                .coeficienteEstMn(entity.getCoeficienteEstMn())
                .coeficienteEstMlc(entity.getCoeficienteEstMlc())
                .pagoResultadoPercent(entity.getPagoResultadoPercent())
                .planProduccionList(listResolvers.getPlanProduccionByUeb(entity.getId()))
                .normasConsumoList(listResolvers.getNormaConsumoByUeb(entity.getId()))
                .ordenTrabajoList(listResolvers.getOrdenTrabajoByUeb(entity.getId()))
                .trabajadorList(listResolvers.getTrabajadorByUeb(entity.getId()))
                .etapaList(listResolvers.getEtapaByUeb(entity.getId()))
                .build();
    }
}
