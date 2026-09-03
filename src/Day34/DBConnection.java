package Day34;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

	public static Connection getConnection() throws SQLException {
		
		String url = "jdbc:oracle:thin:@//localhost:1521/XEPDB1";
		String username = "javauser";
		String password = "Java123";
		
		return DriverManager.getConnection(url, username, password);
	}	 
	
	public static void main(String[] args) {
		
		try {
			Connection con = getConnection();
			
			System.out.println("Database Connected Successfully");
			
			con.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}	  
}