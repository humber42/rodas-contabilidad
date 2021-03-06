package cu.hash.rodascontabilidad.services;

import cu.hash.rodascontabilidad.dto.SubelementoGastoDto;
import cu.hash.rodascontabilidad.dto.classesWhithoutCollections.SubElementoGastoWithoutList;
import cu.hash.rodascontabilidad.models.SubelementoGastoEntity;
import cu.hash.rodascontabilidad.repository.SubelementoGastoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class SubelementoGastoService {
    @Autowired
    private SubelementoGastoRepository repository;
    @Autowired
    private ElementoGastoService elementoGastoService;

    public List<SubelementoGastoDto> findAll() {
        return repository.findAll()
                .stream()
                .map(this::mapper)
                .collect(Collectors.toList());
    }

    public List<SubelementoGastoEntity> findAllWithoutMapping(){
        return repository.findAll();
    }
    public void deleteById(long id){
        repository.deleteById(id);
    }

    public Optional<SubelementoGastoDto> findById(Long id) {
        return repository.findById(id).map(this::mapper);
    }

    public SubelementoGastoDto findByCodigoSubelemento(String codigo) {
        return this.mapper(repository.findByCodigoSubelemento(codigo));
    }

    public Optional<SubElementoGastoWithoutList> findByIdToListResolver(long id) {
        return repository.findById(id).map(this::mapperToListResolver);
    }

    public SubelementoGastoDto addSubelementoGasto(SubelementoGastoEntity subelementoGastoEntity) {
        return this.mapper(repository.save(subelementoGastoEntity));
    }

    public SubelementoGastoDto updateOrDeleteSubelementoGasto(SubelementoGastoEntity subelementoGastoEntity) {
        return this.mapper(repository.saveAndFlush(subelementoGastoEntity));
    }

    private SubelementoGastoDto mapper(SubelementoGastoEntity entity) {
        return SubelementoGastoDto.builder()
                .id(entity.getId())
                .subelemento(entity.getSubelemento())
                .mostrar(entity.getMostrar())
                .orden(entity.getOrden())
                .idElemento(entity.getIdElemento())
                .codigoSubelemento(entity.getCodigoSubelemento())
                .descripcion(entity.getDescripcion())
                .elementoGasto(elementoGastoService.findByIdToListResolver(entity.getIdElemento()).get())
                .build();
    }

    private SubElementoGastoWithoutList mapperToListResolver(SubelementoGastoEntity entity){
        return SubElementoGastoWithoutList.builder()
                .id(entity.getId())
                .subelemento(entity.getSubelemento())
                .mostrar(entity.getMostrar())
                .orden(entity.getOrden())
                .idElemento(entity.getIdElemento())
                .codigoSubelemento(entity.getCodigoSubelemento())
                .descripcion(entity.getDescripcion())
                .build();
    }
}
