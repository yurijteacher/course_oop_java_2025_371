package ua.com.kisit.unit11.confin;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionToDB {

    public Connection  getConnection() {

        Connection connection = null;

        try {
            connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/shop_371_2025_opp",
                    "root",
                    "root1234");
            System.out.println("Connected to database successfully");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return connection;
    }

}
