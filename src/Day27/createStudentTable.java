package Day27;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CreateStudentTable {

	public static void main(String[] args) {
		
		String url = "jdbc:mysql://localhost:3306/studentdb";
		String username = "root";
		String password = "YOUR_MYSQL_PASSWORD";
		
		String query = """
				CREATE TABLE students (
				                 id INT PRIMARY KEY,
				                 name VARCHAR(50),
				                 course VARCHAR(50)
				             )
				             """;
		
		try (
				Connection connection =
				DriverManager.getConnection(url, username, password);
				
				Statement statement = connection.createStatement()
				) {
			
			statement.executeUpdate(query);
			
			System.out.println("Student table created successfully!");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
