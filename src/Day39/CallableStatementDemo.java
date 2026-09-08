package Day39;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;

public class CallableStatementDemo {

    public static void main(String[] args) {

        String driver = "oracle.jdbc.OracleDriver";
        String url = "jdbc:oracle:thin:@localhost:1521/XEPDB1";
        String username = "javauser";
        String password = "your_password";

        try {
            Class.forName(driver);

            Connection con = DriverManager.getConnection(
                    url, username, password);

            System.out.println("Database Connected Successfully");

            CallableStatement cstmt =
                    con.prepareCall("{call greet_employee(?)}");

            cstmt.setString(1, "Murali");

            cstmt.execute();

            System.out.println("Procedure executed successfully");

            cstmt.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}