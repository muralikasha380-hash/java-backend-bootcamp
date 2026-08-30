package Day30;

import java.sql.Connection;
import java.sql.DriverManager;
	
public class DBConnection {
	
	static String DBurl =
			"jdbc:oracle:thin:@//localhost:1521/XEPDB1";
	
	static String DBuname = "javauser";
	static String DBpwd = "Java123";
	
	public static Connection geConnection() {
		
		Connection con = null;
		
		try {
			
			Class.forName("oracle.jdbc.OracleDriver");
			
			con = DriverManager.getConnection(DBurl,DBuname,DBpwd);

	            System.out.println("Database Connected");

	        } catch (Exception e) {

	            e.printStackTrace();
	        }

	        return con;
	    }
	}
