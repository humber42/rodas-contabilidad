package cu.hash.rodascontabilidad.constants;

public class MicroservicesConstants {
    public static final String BASE_USER_API = "/api/user";

    public interface UserMicroserviceConstants {
        String BASE = "user-service";
        String FECTH_USER_BY_ID = "/fetch-user-by-id/{id}";
    }
}
