package Day29;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class EmployeeDAO {


	public void insertEmployee(Employee employee) {
		
		try {
			
			Connection con =DBConnection.getConnection();
			
			Statement stmt =con.createStatement();
			
			String query ="INSERT INTO employee " + "(id, name, salary) VALUES (" + employee.getId() + ", '" + employee.getName() + "', " + employee.getSalary() + ")";
			
			int rows =stmt.executeUpdate(query);
			
			System.out.println(rows + " employee inserted.");
			
			stmt.close();
			con.close();
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}

	public void displayEmployees() {
		
		try {
			
			Connection con =DBConnection.getConnection();
			
			Statement stmt =con.createStatement();
			
			String query ="SELECT * FROM employee";
			
			ResultSet rs =stmt.executeQuery(query);
			
			System.out.println("\n--- Employee Data ---");
			
			while (rs.next()) {
				
				System.out.println("ID: " + rs.getInt("id") + " | Name: " + rs.getString("name") + " | Salary: " + rs.getDouble("salary"));
			}	
			
			rs.close();
			stmt.close();
			con.close();
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}
	
	public void updateEmployee(int id, double salary) {
		
		try {
			
			Connection con =DBConnection.getConnection();
			
			Statement stmt =con.createStatement();
			
			String query ="UPDATE employee SET salary = " + salary + " WHERE id = "  + id;
			
			int rows = stmt.executeUpdate(query);
			
			System.out.println( rows + " employee updated.");
			
			stmt.close();
			con.close();
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}
	
	public void deleteEmployee(int id) {
		
		try {
			
			Connection con = DBConnection.getConnection();
			
			Statement stmt = con.createStatement();
			
			String query = "DELETE FROM employee WHERE id = " + id;
			
			int rows = stmt.executeUpdate(query);
			
			System.out.println( rows + " employee deleted.");
			
			stmt.close();
			con.close();
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}
}
