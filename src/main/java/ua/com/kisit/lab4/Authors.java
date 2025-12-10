package ua.com.kisit.lab4;

import lombok.*;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Authors {

    private Long id;
    private String firstName;
    private String lastName;
    private String description;
    private Date dateOfBirth;

    private List<AuthorsHasBooks> authorsHasBooks;

    @Override
    public String toString() {
        return "Authors{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", description='" + description + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                '}';
    }
}
