package ua.com.kisit.lab4;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Users {

    private Long id;
    private String username;
    private String password;

    private Set<Roles> rolesSet;

}
