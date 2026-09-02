package Day33;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class AccountDAO {

    public void transferMoney(int fromAccount, int toAccount, double amount) {

        Connection con = null;

        try {
            con = DBConnection.getConnection();

            // Start transaction
            con.setAutoCommit(false);

            // 1. Deduct money from sender
            String debitSQL ="UPDATE account SET balance = balance - ? WHERE account_id = ?";

            PreparedStatement debitStmt = con.prepareStatement(debitSQL);

            debitStmt.setDouble(1, amount);
            debitStmt.setInt(2, fromAccount);

            int debitResult = debitStmt.executeUpdate();

            // 2. Add money to receiver
            String creditSQL ="UPDATE account SET balance = balance + ? WHERE account_id = ?";

            PreparedStatement creditStmt = con.prepareStatement(creditSQL);

            creditStmt.setDouble(1, amount);
            creditStmt.setInt(2, toAccount);

            int creditResult = creditStmt.executeUpdate();

            // Check both operations
            if (debitResult > 0 && creditResult > 0) {

                con.commit();

                System.out.println("Money transferred successfully!");
                System.out.println("Transaction committed.");

            } else {

                con.rollback();

                System.out.println("Transaction failed.");
                System.out.println("Transaction rolled back.");
            }

            debitStmt.close();
            creditStmt.close();

        } catch (Exception e) {

            try {
                if (con != null) {
                    con.rollback();
                    System.out.println("Transaction rolled back.");
                }
            } catch (Exception rollbackError)
            {
                rollbackError.printStackTrace();
            }

            e.printStackTrace();

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