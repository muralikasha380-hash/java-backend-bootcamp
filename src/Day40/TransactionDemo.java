package Day40;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class TransactionDemo {

    public static void main(String[] args) {

        String url = "jdbc:oracle:thin:@localhost:1521/XEPDB1";
        String username = "javauser";
        String password = "Java123";

        String sql = "UPDATE employee SET esal = esal + ? WHERE eid = ?";

        try {
            Class.forName("oracle.jdbc.OracleDriver");

            Connection con = DriverManager.getConnection(
                    url, username, password);

            con.setAutoCommit(false);

            PreparedStatement pstmt = con.prepareStatement(sql);

            // Employee 1001
            pstmt.setInt(1, 5000);
            pstmt.setString(2, "1001");
            pstmt.executeUpdate();

            // Employee 1002
            pstmt.setInt(1, 3000);
            pstmt.setString(2, "1002");
            pstmt.executeUpdate();

            con.commit();

            System.out.println("Transaction completed successfully.");

            pstmt.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}