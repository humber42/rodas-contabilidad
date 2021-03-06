package cu.hash.rodascontabilidad.services;

import cu.hash.rodascontabilidad.dto.NormaConsumoFichaCostoDto;
import cu.hash.rodascontabilidad.models.NormaConsumoFichaCostoEntity;
import cu.hash.rodascontabilidad.repository.NormaConsumoFichaCostoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class NormaConsumoFichaCostoService {
    @Autowired
    private NormaConsumoFichaCostoRepository repository;

    @Autowired
    private NormasConsumoService normasConsumoService;
    @Autowired
    private FichaCostoService fichaCostoService;

    public List<NormaConsumoFichaCostoDto> findAll() {
        return repository.findAll()
                .stream()
                .map(this::mapper)
                .collect(Collectors.toList());
    }
    public void deleteById(long id){
        repository.deleteById(id);
    }

    public Optional<NormaConsumoFichaCostoDto> findById(Long id) {
        return repository.findById(id).map(this::mapper);
    }

    public NormaConsumoFichaCostoDto addNormaConsumoFichaCosto(NormaConsumoFichaCostoEntity normaConsumoFichaCostoEntity) {
        return this.mapper(repository.save(normaConsumoFichaCostoEntity));
    }

    public void deleteNormaConsumoFichaCostoByIds(long idNormaConsumo, long idFichaCosto) {
        repository.getByIdNormaConsumoAndIdFichaCosto(idNormaConsumo, idFichaCosto).ifPresent(
                p ->
                        this.deleteById(p.getId())
        );
    }

    public NormaConsumoFichaCostoDto updateOrDeleteNormaConsumoFichaCosto(NormaConsumoFichaCostoEntity normaConsumoFichaCostoEntity) {
        return this.mapper(repository.saveAndFlush(normaConsumoFichaCostoEntity));
    }

    private NormaConsumoFichaCostoDto mapper(NormaConsumoFichaCostoEntity entity) {
        return NormaConsumoFichaCostoDto.builder()
                .id(entity.getId())
                .idNormaConsumo(entity.getIdNormaConsumo())
                .idFichaCosto(entity.getIdFichaCosto())
                .fichaCosto(fichaCostoService.findByIdToListResolver(entity.getIdFichaCosto()).get())
                .normasConsumo(normasConsumoService.findByIdToListResolvers(entity.getIdNormaConsumo()).get())
                .build();
    }
}
