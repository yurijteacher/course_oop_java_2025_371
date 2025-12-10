package ua.com.kisit.unit8.v1;

import java.util.List;

public interface DriverJdbc {

    Object getConnection(String url, String username, String password) ;

    void execute(String sql) ;
    void executeUpdate(String sql) ;
    List<Object> executeQuery(String sql) ;

}
