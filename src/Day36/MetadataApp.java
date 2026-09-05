package Day36;

import java.sql.Connection;
import java.sql.DatabaseMetaData;

public class MetadataApp {

	public static void main(String[] args) {
		
		Connection con = null;
		
		try {
			con = DBConnection.getConnection();
			
			DatabaseMetaData metaData = con.getMetaData();
			
			System.out.println("\n===== DATABASE METADATA =====");
			
			System.out.println("Database Name: "+ metaData.getDatabaseProductName());
			
			System.out.println("Database Version: "+ metaData.getDatabaseProductVersion());
			
			System.out.println("Driver Name: "+ metaData.getDriverName());
			
			System.out.println("Driver Version: "+ metaData.getDriverVersion());
			
			System.out.println("Username: "+ metaData.getUserName());
			
			System.out.println("URL: "+ metaData.getURL());
			
		} catch (Exception e) {
			
			e.printStackTrace();
			
		} finally {
			
			try {
				if (con != null) {
					con.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}