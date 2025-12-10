package ua.com.kisit.lab4;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor


public class Clients {

    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private int phone;
    private Date dob;

    private Users user;

}
