package Day35;

import java.sql.CallableStatement;
import java.sql.Connection;

public class EmployeeDAO {
    public void updateSalary(int empId, double salary) {
        Connection con = null;
        CallableStatement cs = null;
        
        try {
            con = DBConnection.getConnection();
            
            // Calling Oracle stored procedure
            cs = con.prepareCall("{call update_salary(?, ?)}");
            
            // Setting IN parameters
            cs.setInt(1, empId);
            cs.setDouble(2, salary);
            
            // Execute procedure
            cs.execute();
            
            System.out.println("Salary updated successfully!");
            
        } catch (Exception e) {
        	
            e.printStackTrace();
            
        } finally {        	
        		try {
        			if (cs != null) {
        				cs.close();
        			}
                
        			if (con != null) {
        				con.close();
        			}                
        		} catch (Exception e) {
        			e.printStackTrace();
            }
        }
    }
}