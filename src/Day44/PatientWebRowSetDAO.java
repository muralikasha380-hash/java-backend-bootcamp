package Day44;

import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.sql.rowset.WebRowSet;
import javax.sql.rowset.RowSetProvider;
import java.io.FileWriter;

public class PatientWebRowSetDAO {
    public void viewPatients() {
        String sql = "SELECT * FROM patient";
        
        try {
            Connection con =DBConnection.getConnection();
            PreparedStatement ps =con.prepareStatement(sql);
            WebRowSet webRowSet =RowSetProvider.newFactory().createWebRowSet();
            webRowSet.populate(ps.executeQuery());
            System.out.println("\n===== PATIENT DETAILS =====");
            while (webRowSet.next()) {
                System.out.println(webRowSet.getString("pid")+ " "+ webRowSet.getString("pname")+ " "+ webRowSet.getInt("age")+ " "+ webRowSet.getLong("contact"));
            }
            
            // Move back to beginning
            webRowSet.beforeFirst();

            // Create XML file
            FileWriter writer =new FileWriter("patient.xml");
            webRowSet.writeXml(writer);
            writer.close();
            System.out.println("\nPatient data written to patient.xml");
            webRowSet.close();
            ps.close();
            con.close();

            System.out.println("Database connection closed.");
       
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}