package ua.com.kisit.unit13.repository;

import org.springframework.jdbc.core.RowMapper;
import ua.com.kisit.unit13.entity.Author;

import java.sql.ResultSet;
import java.sql.SQLException;

public class RowMapperAuthor implements RowMapper<Author> {

    @Override
    public Author mapRow(ResultSet rs, int rowNum) throws SQLException {
        Author author = new Author();
        author.setId(rs.getLong("id"));
        author.setName(rs.getString("name"));
        return author;
    }
}
