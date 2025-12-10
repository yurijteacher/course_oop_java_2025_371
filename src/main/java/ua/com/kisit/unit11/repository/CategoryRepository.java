package ua.com.kisit.unit11.repository;

import ua.com.kisit.unit11.confin.ConnectionToDB;
import ua.com.kisit.unit11.dao.CategoryDao;
import ua.com.kisit.unit11.dao.ProductDao;
import ua.com.kisit.unit11.entity.Category;
import ua.com.kisit.unit11.entity.Products;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CategoryRepository extends ConnectionToDB implements CategoryDao {

    Connection connection = null;

//    Statement statement = null;
//    PreparedStatement preparedStatement = null;
//    CallableStatement callableStatement = null;

    public CategoryRepository() {
        this.connection = getConnection();
    }


    @Override
    public void save(Category category) {

        Statement statement = null;

        try {
            statement = connection.createStatement();
            statement.execute("INSERT INTO `category` (`name`, `description`, `image`) " +
                    "VALUES ('"+category.getName()+"', '"+category.getDescription()+"', '"+category.getImage()+"')");

            statement.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException e) {}
            }
        }

    }

    @Override
    public void update(Category category) {

    }

    @Override
    public void delete(Category category) {

    }

    @Override
    public Category findById(Long id) {

        Category category = new Category();

        Statement statement = null;
        ResultSet resultSet = null;


        try {
            statement = connection.createStatement();

            resultSet = statement.executeQuery("SELECT * FROM `category` WHERE `id` = " + id);

            while (resultSet.next()) {

                category.setId(resultSet.getLong("id"));
                category.setName(resultSet.getString("name"));
                category.setDescription(resultSet.getString("description"));
                category.setImage(resultSet.getString("image"));

            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException e) {}
            }

            if (resultSet != null) {
                try {
                    resultSet.close();
                } catch (SQLException e) {}
            }
        }


        return category;
    }

    @Override
    public List<Category> findAll() {

        List<Category> categories = new ArrayList<>();

        Statement statement = null;
        ResultSet resultSet = null;

        try {
            statement = connection.createStatement();

            resultSet = statement.executeQuery("SELECT * FROM `category`");

            while (resultSet.next()) {
                Category category = new Category();
                category.setId(resultSet.getLong("id"));
                category.setName(resultSet.getString("name"));
                category.setDescription(resultSet.getString("description"));
                category.setImage(resultSet.getString("image"));

                categories.add(category);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException e) {}
            }

            if (resultSet != null) {
                try {
                    resultSet.close();
                } catch (SQLException e) {}
            }
        }




        return categories;
    }
}
