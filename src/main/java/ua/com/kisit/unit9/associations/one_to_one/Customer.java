package ua.com.kisit.unit9.associations.one_to_one;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class Customer {

    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private int phone;

    private User user;
}
