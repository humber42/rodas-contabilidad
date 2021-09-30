package cu.hash.rodascontabilidad.constants;

public class MicroServiceConstants {

    public static final String BASE_API ="/api/user";

    public interface UserMicroserviceConstants{
        String BASE ="user-service";
        String FETCH_BY_USERNAME ="/fetch-user/{username}";
        String FETCH_BY_ID="/fetch-user-by-id/{id}";
    }
}
