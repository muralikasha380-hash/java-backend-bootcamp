package Day40;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class BankTransfer {

    public static void main(String[] args) {

        String url = "jdbc:oracle:thin:@localhost:1521/XEPDB1";
        String username = "javauser";
        String password = "Java123";

        String withdraw =
                "UPDATE bankaccount SET balance = balance - ? WHERE account_id = ?";

        String deposit =
                "UPDATE bankaccount SET balance = balance + ? WHERE account_id = ?";

        Connection con = null;

        try {

            Class.forName("oracle.jdbc.OracleDriver");

            con = DriverManager.getConnection(
                    url,
                    username,
                    password);

            con.setAutoCommit(false);

            PreparedStatement withdrawStmt =
                    con.prepareStatement(withdraw);

            PreparedStatement depositStmt =
                    con.prepareStatement(deposit);

            // Withdraw ₹200 from account 1001
            withdrawStmt.setInt(1, 200);
            withdrawStmt.setString(2, "1001");
            withdrawStmt.executeUpdate();

            // Deposit ₹200 into account 1002
            depositStmt.setInt(1, 200);
            depositStmt.setString(2, "1002");
            depositStmt.executeUpdate();

            con.commit();

            System.out.println("Money transferred successfully.");

            withdrawStmt.close();
            depositStmt.close();

        } catch (Exception e) {

            e.printStackTrace();

            try {
                if (con != null) {
                    con.rollback();
                    System.out.println("Transaction rolled back.");
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }

        } finally {

            try {
                if (con != null) {
                    con.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}