package Day28;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DeleteStudent {
	
	public static void main(String[] args) {
		
		 String DBurl = "jdbc:oracle:thin:@//localhost:1521/XEPDB1";
		 String username = "javauser";
		 String password = "Java123";
		
		 String query =
				 "DELETE FROM student WHERE id = ?";
		 
		 try (
				 Connection connection =
				 DriverManager.getConnection(DBurl, username, password);
				
				 PreparedStatement statement =
						 connection.prepareStatement(query)
			 ) {
			
			 statement.setInt(1, 101);
			 
			 int rows = statement.executeUpdate();
			 
			if (rows > 0) {
				System.out.println("Student deleted successfully!");
			} else {
				System.out.println("Student not found.");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}