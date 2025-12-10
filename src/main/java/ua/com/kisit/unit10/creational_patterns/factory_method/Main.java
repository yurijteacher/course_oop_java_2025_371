package ua.com.kisit.unit10.creational_patterns.factory_method;

public class Main {

    public static void main(String[] args) {

        FactoryDriver driver = new FactoryDriver();
        Driver driverForMySQL = driver.getDriver("mysql");
        System.out.println(driverForMySQL.getConnection("jdbc:mysql://localhost:3306/test", "root", "root"));

        driverForMySQL.execute("insert into test values ('test')");
        driverForMySQL.query("select * from test");


    }

}
