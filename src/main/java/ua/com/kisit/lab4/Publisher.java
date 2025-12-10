package ua.com.kisit.lab4;

import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class Publisher {

    private Long id;
    private String name;
    private String description;
    private String address;

    private List<Books> booksList;

}
