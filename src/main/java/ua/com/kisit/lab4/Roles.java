package ua.com.kisit.lab4;

import lombok.*;

import java.util.HashSet;
import java.util.Set;

@Getter
@AllArgsConstructor
@Setter
@NoArgsConstructor
@ToString

public class Roles {

    private Long id;
    private String name;

    private Set<Users> usersSet = new HashSet<>();

}
