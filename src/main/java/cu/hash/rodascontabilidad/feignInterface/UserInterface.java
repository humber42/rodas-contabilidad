package cu.hash.rodascontabilidad.feignInterface;

import cu.hash.rodascontabilidad.constants.MicroServiceConstants;
import cu.hash.rodascontabilidad.dto.UserDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = MicroServiceConstants.UserMicroserviceConstants.BASE)
@Service
@RequestMapping(value = MicroServiceConstants.BASE_API)
public interface UserInterface {
    @RequestMapping(value = MicroServiceConstants.UserMicroserviceConstants.FETCH_BY_USERNAME)
    UserDto searchByUsername(@PathVariable(value = "username") String username);

    @RequestMapping(value=MicroServiceConstants.UserMicroserviceConstants.FETCH_BY_ID)
    UserDto searchById(@PathVariable(value = "id")int id);
}
