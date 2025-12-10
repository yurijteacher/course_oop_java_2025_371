package ua.com.kisit.unit11.entity;

import lombok.*;

import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

@ToString

public class Products {

    private Long id;
    private String name;
    private String description;
    private BigDecimal price;
    private String image;

    private Category category;

}
