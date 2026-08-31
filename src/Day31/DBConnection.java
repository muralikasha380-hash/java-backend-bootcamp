package Day31;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

	private static String driver ="oracle.jdbc.OracleDriver";
	
	private static String DBurl ="jdbc:oracle:thin:@localhost:1521/XEPDB1";
	
	private static String DBuname ="your_DBusername";
	
	private static String DBpwd ="your_DBpassword";

	public static Connection getConnection() {
		
		Connection con = null;
		
		try {
			
			Class.forName(driver);
			
			con = DriverManager.getConnection(DBurl,DBuname,DBpwd);
			
			System.out.println("Database Connected");
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}

		return con;
	}
}