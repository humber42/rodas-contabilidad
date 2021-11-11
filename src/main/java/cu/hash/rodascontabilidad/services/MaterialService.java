package cu.hash.rodascontabilidad.services;

import cu.hash.rodascontabilidad.controlers.especialRequest.MaterialEspecial;
import cu.hash.rodascontabilidad.controlers.especialRequest.OrdenTrabajoMaterialRequest;
import cu.hash.rodascontabilidad.dto.MaterialDto;
import cu.hash.rodascontabilidad.models.MaterialEntity;
import cu.hash.rodascontabilidad.repository.MaterialRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class MaterialService {
    @Autowired
    private MaterialRepository repository;
    @Autowired
    private OrdenTrabajoService ordenTrabajoService;

    public List<MaterialDto> findAll() {
        return repository.findAll()
                .stream()
                .map(this::mapper)
                .collect(Collectors.toList());
    }

    public List<MaterialEntity> findAllWithoutMapping(){
        return repository.findAll();
    }
    public void deleteById(long id){
        repository.deleteById(id);
    }

    public Optional<MaterialDto> findById(Long id) {
        return repository.findById(id).map(this::mapper);
    }

    public MaterialDto addMaterial(MaterialEntity materialEntity) {
        return this.mapper(repository.save(materialEntity));
    }

    public MaterialDto updateOrDeleteMaterial(MaterialEntity materialEntity) {
        return this.mapper(repository.saveAndFlush(materialEntity));
    }

    public void saveEspecialMaterial(OrdenTrabajoMaterialRequest request){
        if(!request.getEspecialList().isEmpty()){
            for(MaterialEspecial materialDto: request.getEspecialList()){
                MaterialEntity entity = new MaterialEntity();
                entity.setFecha(materialDto.getFecha());
                entity.setImporteMn(materialDto.getImporteMN());
                entity.setImporteMlc(materialDto.getImporteMLC());
                entity.setNoVentaSalida(materialDto.getNoVentaSalida());
                entity.setTotal(materialDto.getTotal());
                entity.setIdOrdenTrabajo(request.getOrdenTrabajoId());
                this.addMaterial(entity);
            }
        }
    }

    private MaterialDto mapper(MaterialEntity entity) {
        return MaterialDto.builder()
                .id(entity.getId())
                .fecha(entity.getFecha())
                .importeMn(entity.getImporteMn())
                .importeMlc(entity.getImporteMlc())
                .noVSalida(entity.getNoVentaSalida())
                .total(entity.getTotal())
                .idOrdenTrabajo(entity.getIdOrdenTrabajo())
                .ordenTrabajoDto(ordenTrabajoService.findById(entity.getIdOrdenTrabajo()).get())
                .build();
    }
}
