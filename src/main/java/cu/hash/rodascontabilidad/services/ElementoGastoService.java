package cu.hash.rodascontabilidad.services;

import cu.hash.rodascontabilidad.dto.ElementoGastoDto;
import cu.hash.rodascontabilidad.dto.classesWhithoutCollections.ElementoGastoWithoutList;
import cu.hash.rodascontabilidad.models.ElementoGastoEntity;
import cu.hash.rodascontabilidad.repository.ElementoGastoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ElementoGastoService {
    @Autowired
    private ElementoGastoRepository repository;
    @Autowired
    private ListResolvers listResolvers;

    public List<ElementoGastoDto> findAll() {
        return repository.findAll()
                .stream()
                .map(this::mapper)
                .collect(Collectors.toList());
    }
    public void deleteById(long id){
        repository.deleteById(id);
    }

    public Optional<ElementoGastoDto> findById(Long id) {
        return repository.findById(id).map(this::mapper);
    }

    public Optional<ElementoGastoWithoutList> findByIdToListResolver(long id) {
        return repository.findById(id).map(this::mapperToListResolvers);
    }

    public ElementoGastoDto findByCodigoElemento(String codigo) {
        return this.mapper(repository.findByCodigoElemento(codigo));
    }

    public ElementoGastoDto addElementoGasto(ElementoGastoEntity elementoGastoEntity) {
        return this.mapper(repository.save(elementoGastoEntity));
    }

    public ElementoGastoDto updateOrDeleteElementoGasto(ElementoGastoEntity elementoGastoEntity) {
        return this.mapper(repository.saveAndFlush(elementoGastoEntity));
    }

    private ElementoGastoDto mapper(ElementoGastoEntity entity) {
        return ElementoGastoDto.builder()
                .id(entity.getId())
                .elemento(entity.getElemento())
                .mostrar(entity.getMostrar())
                .orden(entity.getOrden())
                .descripcion(entity.getDescripcion())
                .codigoElemento(entity.getCodigoElemento())
                .subelementoGastoList(listResolvers.getSubElementoGastoByElemento(entity.getId()))
                .build();
    }

    private ElementoGastoWithoutList mapperToListResolvers(ElementoGastoEntity entity) {
        return ElementoGastoWithoutList.builder()
                .id(entity.getId())
                .elemento(entity.getElemento())
                .mostrar(entity.getMostrar())
                .orden(entity.getOrden())
                .descripcion(entity.getDescripcion())
                .codigoElemento(entity.getCodigoElemento())
                .build();
    }
}
