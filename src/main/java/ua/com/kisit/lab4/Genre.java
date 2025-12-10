package ua.com.kisit.lab4;

import lombok.*;

import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class Genre {

    private Long id;
    private String name;
    private Set<Books> books;


}
