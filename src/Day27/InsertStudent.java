package Day27;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
	
public class InsertStudent {
	
	public static void main(String[] args) {
		
		String url = "jdbc:mysql://localhost:3306/studentdb";
		String username = "root";
		String password = "YOUR_MYSQL_PASSWORD";
		
		String query =
				"INSERT INTO students (id, name, course) VALUES (?, ?, ?)";
		
		try (
				Connection connection =
				DriverManager.getConnection(url, username, password);
				
				PreparedStatement statement =
						connection.prepareStatement(query)
				) {
			
			statement.setInt(1, 101);
			statement.setString(2, "Murali");
			statement.setString(3, "Java Backend");
			
			int rows = statement.executeUpdate();
			
			System.out.println(rows + " student inserted successfully!");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
