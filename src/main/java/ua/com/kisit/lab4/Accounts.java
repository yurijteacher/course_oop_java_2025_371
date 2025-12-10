package ua.com.kisit.lab4;

import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder


public class Accounts {

    private Long id;
    private double balance;
    private Users user;

}
