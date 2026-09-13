package Day43;

import java.sql.Connection;
import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.RowSetProvider;

	public class EmployeeCachedRowSetDAo {
		public void viewEmployees() {
			
	        String sql ="SELECT * FROM employee_attendance";
	        
	        try {
	            Connection con =DBConnection.getConnection();
	            CachedRowSet rowSet =RowSetProvider.newFactory().createCachedRowSet();
	            rowSet.setCommand(sql);
	            rowSet.execute(con);
	            System.out.println("\n===== EMPLOYEE ATTENDANCE DETAILS =====");
	            while (rowSet.next()) {
	                System.out.println(rowSet.getInt("emp_id")+ "  " + rowSet.getString("emp_name")+ "  "+ rowSet.getString("department")+ "  "+ rowSet.getInt("attendance_days"));
	            }
	            /*
	             * CachedRowSet stores the retrieved data.
	             * Therefore, the database connection
	             * can be closed after fetching the data.
	             */
	            con.close();
	            System.out.println("\nDatabase connection closed.");
	            rowSet.close();
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }
	}