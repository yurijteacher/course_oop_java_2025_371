package ua.com.kisit.unit13.repository;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import ua.com.kisit.unit13.dao.AuthorDao;
import ua.com.kisit.unit13.entity.Author;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository("authorRepository")
public class AuthorRepository implements AuthorDao {

    JdbcTemplate jdbcTemplate;

    public AuthorRepository(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }


    @Override
    public List<Author> findAll() {

        String sql = "select * from `author`";

        return jdbcTemplate.query(sql, (rs, rowNum) -> {
            Author author = new Author();
            author.setId(rs.getLong("id"));
            author.setName(rs.getString("name"));
            return author;
        });
    }


//                new RowMapper<Author>() {
//            @Override
//            public Author mapRow(ResultSet rs, int rowNum) throws SQLException {
//                Author author = new Author();
//                author.setId(rs.getLong("id"));
//                author.setName(rs.getString("name"));
//                return author;
//            }
//        });
//    }


// v.1
//                new RowMapperAuthor(){
//            @Override
//            public Author mapRow(ResultSet rs, int rowNum) throws SQLException {
//                Author author = new Author();
//                author.setId(rs.getLong("id"));
//                author.setName(rs.getString("name"));
//                return author;
//            }
//        });


    @Override
    public Author findById(Long id) {
        return jdbcTemplate.queryForObject("SELECT * FROM `author` where id=" + id,
                (rs, rowNum) -> {
                    Author author = new Author();
                    author.setId(rs.getLong("id"));
                    author.setName(rs.getString("name"));
                    return author;
                });
    }

    @Override
    public Author findByName(String name) {
        return jdbcTemplate.queryForObject("SELECT * FROM `author` where id=" + name,
                (rs, rowNum) -> {
                    Long id = rs.getLong("id");
                    String name_ = rs.getString("name1");
                    return new Author(id, name_);
                });
    }

    @Override
    public void save(Author author) {
        jdbcTemplate.update("INSERT INTO `author` (`name`) VALUES (?)", author.getName());
    }

    @Override
    public void update(Author author) {
        jdbcTemplate.update("UPDATE `author` SET name=? where id=?", author.getName(), author.getId());
    }

    @Override
    public void delete(Author author) {
        jdbcTemplate.update("DELETE from `author` where id=?", author.getId());
    }

    @Override
    public void deleteAll() {
        jdbcTemplate.update("DELETE FROM `author`");
    }
}
