package ua.com.kisit.unit10.creational_patterns.factory_method;

public class FactoryDriver {

    public Driver getDriver(String name) {

        String db = "mysql";


        Driver driver = null;

        switch (db) {
            case "mysql":
                driver = new MySQLDriver();
                break;
            case "postgres":
                driver = new PostgresDriver();
                break;
            default: driver = null;
                break;
        }

        return driver;
    }

}
