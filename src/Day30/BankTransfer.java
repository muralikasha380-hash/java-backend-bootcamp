package Day30;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class BankTransfer {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Connection con = null;
		Statement stmt = null;
		
		try {
			
			con = DBConnection.geConnection();
			
			stmt = con.createStatement();
			
			System.out.print("Enter Sender Account No: ");
			int sender = sc.nextInt();
			
			System.out.print("Enter Receiver Account No: ");
			int receiver = sc.nextInt();
			
			System.out.print("Enter Amount: ");
			double amount = sc.nextDouble();
			
			// Start Transaction
			con.setAutoCommit(false);
			
			// Check sender balance
			String checkQuery ="SELECT balance FROM bank_account " + "WHERE account_no = " + sender;
			
			ResultSet rs = stmt.executeQuery(checkQuery);
			
			if (!rs.next()) {
				
				System.out.println("Sender account not found.");
				
				con.rollback();
				return;
			}
			
			double balance = rs.getDouble("balance");
			
			if (balance < amount) {
				
				System.out.println("Insufficient balance.");
				
				con.rollback();
				return;
	            	}
				
	            	// Deduct money from sender
	            String withdrawQuery = "UPDATE bank_account SET balance = balance - " + amount + " WHERE account_no = " + sender;

	            stmt.executeUpdate(withdrawQuery);

	            // Add money to receiver
	            String depositQuery ="UPDATE bank_account SET balance = balance + " + amount + " WHERE account_no = " + receiver;

	            int rows = stmt.executeUpdate(depositQuery);

	            if (rows > 0) {

	                con.commit();

	                System.out.println( "Transaction successful!");

	            } else {

	                con.rollback();

	                System.out.println(
	                        "Receiver account not found.");
	            }

	            rs.close();

	        } catch (Exception e) {

	            try {

	                if (con != null) {
	                    con.rollback();
	                }

	            } catch (Exception ex) {

	                ex.printStackTrace();
	            }

	            System.out.println( "Transaction failed. Changes rolled back.");

	            e.printStackTrace();

	        } finally {

	            try {

	                if (stmt != null)
	                    stmt.close();

	                if (con != null)
	                    con.close();

	                sc.close();

	            } catch (Exception e) {

	                e.printStackTrace();
	            }
	        }
	    }
	}