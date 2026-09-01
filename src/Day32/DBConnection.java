package Day32;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

    private static String DBurl =
            "jdbc:oracle:thin:@//localhost:1521/XEPDB1";

    private static String username = "your_username";

    private static String password = "your_password";

    public static Connection getConnection() {

        Connection con = null;

        try {

            con = DriverManager.getConnection(
                    DBurl,
                    username,
                    password
            );

            System.out.println("Database Connected Successfully!");

        } catch (Exception e) {

            e.printStackTrace();
        }

        return con;
    }
}