package ua.com.kisit.lab5;


import lombok.*;

import java.util.List;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
//@ToString

public class Categories {

    private Long id;
    private String name;
    private String description;
    private String image;

    private List<Products> products;

    @Override
    public String toString() {
        return "Categories{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", image='" + image + '\'' +
                '}';
    }
}
