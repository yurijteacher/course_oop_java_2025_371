package ua.com.kisit.unit9.associations.many_to_many.v2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class RolesHasUsers {

    private Long id;
    private User user;
    private Role role;
}
