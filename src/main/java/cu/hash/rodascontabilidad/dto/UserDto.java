package cu.hash.rodascontabilidad.dto;

import lombok.*;

import java.sql.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@EqualsAndHashCode
public class UserDto {
    private String username;
    private String fullname;
    private String email;
    private String password;
    private Date dob;
    private String gender;
    private String lang;
}
