package ua.com.kisit.lab4;

import lombok.*;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.Set;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor

public class Books {

    private Long id;
    private String title;
    private List<AuthorsHasBooks> authorsHasBooks;

    private Category category;
    private Set<Genre> genres;
    private Publisher publisher;

    private Date datePublished;
    private int pages;
    private BigDecimal price;

}
