package ua.com.kisit.unit13.dao;

import ua.com.kisit.unit13.entity.Author;

import java.util.List;

public interface AuthorDao {

    List<Author> findAll();
    Author findById(Long id);
    Author findByName(String name);
    void save(Author author);
    void update(Author author);
    void delete(Author author);
    void deleteAll();
}
