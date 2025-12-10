package ua.com.kisit.lab5;

import lombok.*;
import org.springframework.core.annotation.Order;

import java.util.List;

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
    private String phoneNumber;
    private String address;

    private Users user;

    private List<Order> orders;

}
