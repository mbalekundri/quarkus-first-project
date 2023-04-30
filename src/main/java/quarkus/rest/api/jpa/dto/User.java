package quarkus.rest.api.jpa.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

@Data
@EqualsAndHashCode
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class User {

    private String firstName;
    private String lastName;
    private String userName;
    @JsonIgnore
    private String password;
}
