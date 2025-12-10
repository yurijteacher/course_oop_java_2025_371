package ua.com.kisit.unit11.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor

public class Category {

    private Long id;
    private String name;
    private String description;
    private String image;

    private List<Products> products;


}
