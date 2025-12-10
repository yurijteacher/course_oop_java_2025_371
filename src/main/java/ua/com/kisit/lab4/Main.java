package ua.com.kisit.lab4;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Authors author1 = new Authors();
        Authors author2 = new Authors();

        author1.setId(1L);
        author1.setFirstName("Vasya");
        author1.setLastName("Ivanov");
        author1.setDescription("descr");
        author1.setDateOfBirth(new Date(2005, 12,10));

        author2.setId(2L);
        author2.setFirstName("Ivanka");
        author2.setLastName("Pypkina");
        author2.setDescription("descr");
        author2.setDateOfBirth(new Date(2000, 12,10));

        Publisher publisher = new Publisher();
        publisher.setId(1L);
        publisher.setName("ABC");
        publisher.setAddress("Ukr, ...");
        publisher.setDescription("descr");

        Genre genre = new Genre();
        genre.setId(1L);
        genre.setName("Drama");

        Genre genre2 = new Genre();
        genre2.setId(2L);
        genre2.setName("Fantasy");

        Category category1 = new Category();
        category1.setId(1L);
        category1.setName("Books");

        Category category2 = new Category();
        category2.setId(2L);
        category2.setName("Article");

        Books book1 = new Books();
        book1.setId(1L);
        book1.setTitle("Title 1");

        AuthorsHasBooks authorHasBook1 = new AuthorsHasBooks();
        authorHasBook1.setId(1L);
        authorHasBook1.setAuthor(author1);
        authorHasBook1.setBook(book1);
        authorHasBook1.setSection("Section 1");


        AuthorsHasBooks authorHasBook2 = new AuthorsHasBooks();
        authorHasBook2.setId(2L);
        authorHasBook2.setAuthor(author2);
        authorHasBook2.setBook(book1);
        authorHasBook2.setSection("Section 2");

        List<AuthorsHasBooks> authorsHasBooks = new ArrayList<>();
        authorsHasBooks.add(authorHasBook1);
        authorsHasBooks.add(authorHasBook2);

        book1.setAuthorsHasBooks(authorsHasBooks);

        Set<Genre> genres = new HashSet<>();
        genres.add(genre);

        book1.setGenres(genres);
        book1.setCategory(category1);
        book1.setDatePublished(new Date(2015, 10,30));
        book1.setPages(300);


        Books book2 = new Books();
        book2.setId(2L);
        book2.setTitle("Title 2");
        AuthorsHasBooks authorHasBook3 = new AuthorsHasBooks();
        authorHasBook3.setId(3L);
        authorHasBook3.setAuthor(author2);
        authorHasBook3.setBook(book2);
        authorHasBook3.setSection("Section 1-12");
        book2.setAuthorsHasBooks(authorsHasBooks);

        Set<Genre> genres2 = new HashSet<>();
        genres.add(genre2);

        book2.setGenres(genres2);
        book2.setCategory(category2);
        book2.setDatePublished(new Date(2020, 11,25));
        book2.setPages(350);


        List<Books> booksList = new ArrayList<>();
        booksList.add(book1);
        booksList.add(book2);

        System.out.println(booksList);




    }



}
