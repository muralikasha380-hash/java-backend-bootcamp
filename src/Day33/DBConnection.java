package Day33;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
	
	private String driver ="oracle.jdbc.OracleDriver";

    private static final String DBurl ="jdbc:oracle:thin:@localhost:1521/XEPDB1";

    private static final String DBusername = "javauser";

    private static final String DBpwd = "Java123";

    public static Connection getConnection() {

        Connection con = null;

        try {
            Class.forName("oracle.jdbc.OracleDriver");

            con = DriverManager.getConnection(DBurl,DBusername,DBpwd);

            System.out.println("Database Connected Successfully!");

        } catch (Exception e) {
            e.printStackTrace();
        }

        return con;
    }
}