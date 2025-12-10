package ua.com.kisit.unit8.v1;

public class Main {

    public static void main(String[] args) {

        String dbName = "postgres";

        DriverJdbc driver = null;

        switch (dbName) {
            case "mysql":
                driver = new MySQLDriver();
                break;
            case "oracle":
                driver = new OracleDriver();
                break;
            case "postgres":
                driver = new PostgresqlDriver();
            break;
            default:
                System.out.println("Database not found");
        }


        System.out.println(driver.getConnection("jdbc:mysql://localhost:3306/mysql", "root", "root"));
        driver.execute("insert ...");
        System.out.println(driver.executeQuery("select * from table from postgres"));
    }


}
