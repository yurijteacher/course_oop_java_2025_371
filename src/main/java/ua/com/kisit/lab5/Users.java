package ua.com.kisit.lab5;

import lombok.*;

import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Users {

    private Long id;
    private String username;
    private String password;

    private Set<Roles> roles;



}
