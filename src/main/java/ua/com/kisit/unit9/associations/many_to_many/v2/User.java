package ua.com.kisit.unit9.associations.many_to_many.v2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class User {

    private Long id;
    private String username;
    private String password;

}
