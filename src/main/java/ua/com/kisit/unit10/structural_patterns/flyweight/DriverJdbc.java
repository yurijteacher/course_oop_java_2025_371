package ua.com.kisit.unit10.structural_patterns.flyweight;

public interface DriverJdbc {

    Object getConnection(String url, String username, String password);

    void execute(String sql);
}
