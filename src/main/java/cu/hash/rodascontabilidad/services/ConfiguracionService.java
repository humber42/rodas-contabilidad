package cu.hash.rodascontabilidad.services;

import cu.hash.rodascontabilidad.models.ConfiguracionEntity;
import cu.hash.rodascontabilidad.repository.ConfiguracionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ConfiguracionService {
    @Autowired
    private ConfiguracionRepository repository;

    public List<ConfiguracionEntity> findAll(){
        return repository.findAll();
    }

    public Optional<ConfiguracionEntity> findById(Long id){
        return repository.findById(id);
    }

    public ConfiguracionEntity addConfiguracion(ConfiguracionEntity configuracionEntity){
        return repository.save(configuracionEntity);
    }

    public ConfiguracionEntity updateOrDeleteConfiguracion(ConfiguracionEntity configuracionEntity){
        return repository.saveAndFlush(configuracionEntity);
    }
}
