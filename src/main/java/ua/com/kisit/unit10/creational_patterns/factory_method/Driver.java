package ua.com.kisit.unit10.creational_patterns.factory_method;

import java.util.List;

public interface Driver {

    Object getConnection(String url, String user, String password);
    void execute(String sql);
    List<Object> query(String sql);

}
