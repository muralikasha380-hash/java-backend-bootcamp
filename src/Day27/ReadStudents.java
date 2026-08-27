package Day27;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
	
public class ReadStudents {
	
	public static void main(String[] args) {
		
		String url = "jdbc:mysql://localhost:3306/studentdb";
		String username = "root";
		String password = "YOUR_MYSQL_PASSWORD";
		
		String query = "SELECT * FROM students";
		
		try (
				Connection connection =
				DriverManager.getConnection(url, username, password);
				
				Statement statement =
						connection.createStatement();
				
				ResultSet result =
						statement.executeQuery(query)
				) {
			
			while (result.next()) {
				
				System.out.println(
						"ID: " + result.getInt("id")
						+ " | Name: " + result.getString("name")
						+ " | Course: " + result.getString("course"));
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}