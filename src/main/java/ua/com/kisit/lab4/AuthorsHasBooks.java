package ua.com.kisit.lab4;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
//@ToString

public class AuthorsHasBooks {

    private Long id;
    private Authors author;
    private Books book;
    private String section;
    private String description;

    @Override
    public String toString() {
        return "AuthorsHasBooks{" +
                "id=" + id +
                ", author=" + author +
                ", section='" + section + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
