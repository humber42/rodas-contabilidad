package cu.hash.rodascontabilidad.services;

import cu.hash.rodascontabilidad.dto.ConfiguracionDto;
import cu.hash.rodascontabilidad.models.ConfiguracionEntity;
import cu.hash.rodascontabilidad.repository.ConfiguracionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ConfiguracionService {
    @Autowired
    private ConfiguracionRepository repository;
    @Autowired
    private ElementoGastoService elementoGastoService;
    @Autowired
    private SubelementoGastoService subelementoGastoService;
    @Autowired
    private UebService uebService;
    @Autowired
    private ClienteService clienteService;

    public List<ConfiguracionDto> findAll() {
        return repository.findAll().stream().map(this::mapper).collect(Collectors.toList());
    }
    public void deleteById(long id){
        repository.deleteById(id);
    }

    public Optional<ConfiguracionDto> findById(Long id) {
        return repository.findById(id).map(this::mapper);
    }

    public ConfiguracionDto addConfiguracion(ConfiguracionEntity configuracionEntity) {
        return this.mapper(repository.save(configuracionEntity));
    }

    public ConfiguracionDto updateOrDeleteConfiguracion(ConfiguracionEntity configuracionEntity) {
        return this.mapper(repository.saveAndFlush(configuracionEntity));
    }

    private ConfiguracionDto mapper(ConfiguracionEntity entity) {
        return ConfiguracionDto.builder()
                .idConfiguracion(entity.getIdConfiguracion())
                .nombreEntidad(entity.getNombreEntidad())
                .codigoEntidad(entity.getCodigoEntidad())
                .organismo(entity.getOrganismo())
                .horasPorMes(entity.getHorasPorMes())
                .gastoPromedioEstimacionDivisa(entity.getGastoPromedioEstimacionDivisa())
                .pagoPorResultadoPercent(entity.getPagoPorResultadoPercent())
                .fuerzaTrabajoPercent(entity.getFuerzaTrabajoPercent())
                .margenUtilidadProdMlc(entity.getMargenUtilidadProdMlc())
                .margenUtilidadProdMt(entity.getMargenUtilidadProdMt())
                .margenUtilidadServiciosMlc(entity.getMargenUtilidadServiciosMlc())
                .margenUtilidadServiciosMt(entity.getMargenUtilidadServiciosMt())
                .idElemento(entity.getIdElemento())
                .idSubelemento(entity.getIdSubelemento())
                .idUeb(entity.getIdUeb())
                .idCliente(entity.getIdCliente())
                .elementoGasto(elementoGastoService.findById(entity.getIdElemento()).get())
                .subelementoGasto(subelementoGastoService.findById(entity.getIdSubelemento()).get())
                .ueb(uebService.findById(entity.getIdUeb()).get())
                .cliente(clienteService.findById(entity.getIdCliente()).get())
                .build();
    }
}
