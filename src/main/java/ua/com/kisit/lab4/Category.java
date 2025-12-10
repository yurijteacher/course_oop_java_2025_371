package ua.com.kisit.lab4;

import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class Category {

    private Long id;
    private String name;
    private List<Books> books;

}
