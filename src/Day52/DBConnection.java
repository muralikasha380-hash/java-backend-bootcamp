package Day52;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

    private static final String DRIVER = "oracle.jdbc.OracleDriver";
    private static final String URL ="jdbc:oracle:thin:@//localhost:1521/XEPDB1";
    private static final String USERNAME = "javauser";
    private static final String PASSWORD = "Java123";
    public static Connection getConnection() {
        Connection con = null;
        try {
            Class.forName(DRIVER);
            con = DriverManager.getConnection(URL, USERNAME,PASSWORD);
            System.out.println("Database Connected Successfully!");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return con;
    }
}