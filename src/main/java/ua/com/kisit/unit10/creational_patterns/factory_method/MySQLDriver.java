package ua.com.kisit.unit10.creational_patterns.factory_method;

import java.util.List;

public class MySQLDriver implements Driver {
    @Override
    public Object getConnection(String url, String user, String password) {
        return "connection to mysql server";
    }

    @Override
    public void execute(String sql) {
        System.out.println("Executing for mysql: " + sql);
    }

    @Override
    public List<Object> query(String sql) {
        return List.of("1","2","3");
    }
}
