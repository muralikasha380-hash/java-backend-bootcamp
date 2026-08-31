package Day31;

	import java.sql.Connection;
	import java.sql.ResultSet;
	import java.sql.Statement;

public class EmployeeDAO {
	
	// INSERT
	public void insertEmployee(Employee emp) {
		
		try {
			
			Connection con =DBConnection.getConnection();

			Statement stmt=con.createStatement();
			
			String query =
					"INSERT INTO employee "
							+ "(eid, efname, elname, esal, eaddress) "
							+ "VALUES ('"
							+ emp.getEid() + "', '"
							+ emp.getEfname() + "', '"
							+ emp.getElname() + "', "
							+ emp.getEsal() + ", '"
							+ emp.getEaddress() + "')";
			
			int rows=stmt.executeUpdate(query);

			if (rows > 0) {
				System.out.println("Employee inserted successfully!");
			}
			
			stmt.close();
			con.close();
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}


	// VIEW
	public void viewEmployees() {
		
		try {
			
			Connection con =DBConnection.getConnection();

			Statement stmt=con.createStatement();
			
			String query =
					"SELECT * FROM employee";
			
			ResultSet rs =
					stmt.executeQuery(query);
			
			System.out.println(
					"\n===== Employee Details =====");
			
			while (rs.next()) {
				
				System.out.println(
						"ID      : "
								+ rs.getString("eid"));
				
				System.out.println(
	                        "Name    : "
	                        + rs.getString("efname")
	                        + " "
	                        + rs.getString("elname"));

	                System.out.println(
	                        "Salary  : "
	                        + rs.getDouble("esal"));

	                System.out.println(
	                        "Address : "
	                        + rs.getString("eaddress"));

	                System.out.println(
	                        "---------------------------");
	            }

	            rs.close();
	            stmt.close();
	            con.close();

	        } catch (Exception e) {

	            e.printStackTrace();
	        }
	    }


	    // SEARCH
	public void searchEmployee(String eid) {
		
		try {
			
			Connection con =
					DBConnection.getConnection();
			
			Statement stmt =
					con.createStatement();
			
			String query =
					"SELECT * FROM employee "
							+ "WHERE eid = '"
							+ eid + "'";
			
			ResultSet rs =
					stmt.executeQuery(query);
			
			if (rs.next()) {
				
				System.out.println(
						"\nEmployee Found!");
				
				System.out.println(
						"ID      : "
								+ rs.getString("eid"));
				
				System.out.println(
						"Name    : "
								+ rs.getString("efname")
								+ " "
								+ rs.getString("elname"));
				
				System.out.println(
						"Salary  : "
								+ rs.getDouble("esal"));
				
				System.out.println(
						"Address : "
								+ rs.getString("eaddress"));
				
	            	} else {
	            		
	            		System.out.println(
	            				"Employee not found!");
	            	}
			
			rs.close();
			stmt.close();
			con.close();
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}
	
	
	// UPDATE
	public void updateEmployee(
			String eid, double salary) {
		
		try {
			
			Connection con =
					DBConnection.getConnection();
			
			Statement stmt =
					con.createStatement();
			
			String query =
					"UPDATE employee SET esal = "
							+ salary
							+ " WHERE eid = '"
							+ eid + "'";
			
			int rows =
					stmt.executeUpdate(query);
			
			if (rows > 0) {
				
				System.out.println(
						"Employee updated successfully!");
				
			} else {
				
				System.out.println(
						"Employee not found!");
			}
			
			stmt.close();
			con.close();
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}
	
	// DELETE
	public void deleteEmployee(String eid) {
		
		try {
			
			Connection con =
					DBConnection.getConnection();
			
			Statement stmt =
					con.createStatement();
			
			String query =
					"DELETE FROM employee "
							+ "WHERE eid = '"
							+ eid + "'";
			
			int rows =
					stmt.executeUpdate(query);
			
			if (rows > 0) {
				
				System.out.println(
						"Employee deleted successfully!");
				
			} else {
				
				System.out.println(
						"Employee not found!");
			}
			
			stmt.close();
			con.close();
			
		} catch (Exception e) {
			
			e.printStackTrace();
			
		}
	}
}