package Day27;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

	public static void main(String[] args) {
		
		String url = "jdbc:mysql://localhost:3306/studentdb";
		String username = "root";
		String password = "YOUR_MYSQL_PASSWORD";
		
		try (Connection connection =
				DriverManager.getConnection(url, username, password)) {
			
			System.out.println("Database connected successfully!");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
