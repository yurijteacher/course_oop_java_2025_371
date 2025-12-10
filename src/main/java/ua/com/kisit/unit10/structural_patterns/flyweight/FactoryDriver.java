package ua.com.kisit.unit10.structural_patterns.flyweight;

import java.util.HashMap;
import java.util.Map;

public class FactoryDriver {

    Map<String, DriverJdbc> drivers = new HashMap<>();

    public DriverJdbc getDriver(String name) {

        DriverJdbc driver = drivers.get(name);

        if (driver == null) {

            switch (name) {
                case "mysql":
                    driver = new MySQLDriver();
                    break;
                case "postgres":
                    driver = new PostgresDriver();
                    break;
            }
            drivers.put(name, driver);
        }

        return driver;
    }

}
