package ua.com.kisit.unit10.structural_patterns.flyweight;


public class PostgresDriver implements DriverJdbc {

    @Override
    public Object getConnection(String url, String username, String password) {
        return "connection to postgres";
    }

    @Override
    public void execute(String sql) {
        System.out.println("Executing from postgres : " + sql);
    }
}
