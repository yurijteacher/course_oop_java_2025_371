package ua.com.kisit.unit11.repository;

import ua.com.kisit.unit11.confin.ConnectionToDB;
import ua.com.kisit.unit11.dao.ProductDao;
import ua.com.kisit.unit11.entity.Products;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductRepository extends ConnectionToDB implements ProductDao {

    Connection connection;
    public ProductRepository() {
        this.connection = getConnection();
    }

    @Override
    public void save(Products products) {

        PreparedStatement preparedStatement = null;

        try {
            preparedStatement = connection.prepareStatement("INSERT INTO `product` (`name`, `description`, `image`, `price`, `category_id`) VALUES (?, ?, ?, ?, ?)");
            preparedStatement.setString(1, products.getName());
            preparedStatement.setString(2, products.getDescription());
            preparedStatement.setString(3, products.getImage());
            preparedStatement.setBigDecimal(4, products.getPrice());
            preparedStatement.setLong(5, products.getCategory().getId());
            preparedStatement.execute();

            preparedStatement.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            if (preparedStatement != null) {
                try {
                    preparedStatement.close();
                } catch (SQLException e) {}
            }
        }


    }

    @Override
    public void update(Products products) {

    }

    @Override
    public void delete(Products products) {

    }

    @Override
    public Products findById(Long id) {
        return null;
    }

    @Override
    public List<Products> findAll() {
        List<Products> products = new ArrayList<>();

        PreparedStatement preparedStatement = null;

        try {
            preparedStatement = connection.prepareStatement("select * from `product`");
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                Products product = new Products();
                product.setId(resultSet.getLong("id"));
                product.setName(resultSet.getString("name"));
                product.setDescription(resultSet.getString("description"));
                product.setImage(resultSet.getString("image"));
                product.setPrice(resultSet.getBigDecimal("price"));
                product.setCategory(new CategoryRepository().findById(resultSet.getLong("category_id")));

                products.add(product);
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


        return products;
    }
}
