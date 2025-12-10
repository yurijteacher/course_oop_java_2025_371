package ua.com.kisit.unit9.associations.many_to_many.v1;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Role {

    private Long id;
    private String name;

    private Set<User> users;

}
