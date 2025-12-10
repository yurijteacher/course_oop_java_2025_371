package ua.com.kisit.unit9.associations.one_to_one;

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

   // private Customer customer;

}
