package Day34;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
	
public class employeeDAO {
		
	public void addEmployees(List<employee> employees) {
		
		String sql = "INSERT INTO employee_batch (emp_id, emp_name, salary) VALUES (?, ?, ?)";
		
		try (Connection con = DBConnection.getConnection();
				PreparedStatement ps = con.prepareStatement(sql)) {
					
			for (employee e : employees) {
				
				ps.setInt(1, e.getEmpId());
				ps.setString(2, e.getEmpName());
				ps.setDouble(3, e.getSalary());
				
				ps.addBatch();
			}
			
			int[] results = ps.executeBatch();
			
			System.out.println("Employees inserted successfully.");	
			System.out.println("Number of records processed: " + results.length);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}