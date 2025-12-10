package ua.com.kisit.unit8.v1;

import java.sql.SQLException;
import java.util.List;

public class MySQLDriver implements DriverJdbc{


    @Override
    public Object getConnection(String url, String username, String password)  {
        return "connection to MySQL Server";
    }

    @Override
    public void execute(String sql)  {
        System.out.println(sql);
    }

    @Override
    public void executeUpdate(String sql) {
        System.out.println(sql);
    }

    @Override
    public List<Object> executeQuery(String sql) {
        return List.of(sql);
    }
}
