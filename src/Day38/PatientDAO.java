package Day38;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class PatientDAO {

    // ADD PATIENT
    public void addPatient(Patient patient) {

        String sql = "INSERT INTO patient VALUES (?, ?, ?, ?)";

        try (
            Connection con = DBConnection.getConnection();
            PreparedStatement ps = con.prepareStatement(sql)
        ) {

            ps.setString(1, patient.getPid());
            ps.setString(2, patient.getPname());
            ps.setInt(3, patient.getAge());
            ps.setLong(4, patient.getContact());

            int rows = ps.executeUpdate();

            if (rows > 0) {
                System.out.println("Patient added successfully!");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    // VIEW ALL PATIENTS
    public void viewPatients() {

        String sql = "SELECT * FROM patient";

        try (
            Connection con = DBConnection.getConnection();
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery()
        ) {

            System.out.println("\n===== PATIENT DETAILS =====");

            while (rs.next()) {

                String pid = rs.getString("pid");
                String pname = rs.getString("pname");
                int age = rs.getInt("age");
                long contact = rs.getLong("contact");

                System.out.println( "Patient ID: " + pid + ", Name: " + pname + ", Age: " + age + ", Contact: " + contact
                );
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    // SEARCH PATIENT
    public void searchPatient(String pid) {

        String sql = "SELECT * FROM patient WHERE pid = ?";

        try (
            Connection con = DBConnection.getConnection();
            PreparedStatement ps = con.prepareStatement(sql)
        ) {

            ps.setString(1, pid);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {

                System.out.println("\nPatient Found!");

                System.out.println("Patient ID: " + rs.getString("pid") + ", Name: " + rs.getString("pname") + ", Age: " + rs.getInt("age") + ", Contact: " + rs.getLong("contact") );

            } else {

                System.out.println("Patient not found.");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    // UPDATE PATIENT
    public void updatePatient(String pid, String pname, int age, long contact) {

        String sql =
                "UPDATE patient SET pname = ?, age = ?, contact = ? WHERE pid = ?";

        try (
            Connection con = DBConnection.getConnection();
            PreparedStatement ps = con.prepareStatement(sql)
        ) {

            ps.setString(1, pname);
            ps.setInt(2, age);
            ps.setLong(3, contact);
            ps.setString(4, pid);

            int rows = ps.executeUpdate();

            if (rows > 0) {
                System.out.println("Patient updated successfully!");
            } else {
                System.out.println("Patient not found.");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    // DELETE PATIENT
    public void deletePatient(String pid) {

        String sql = "DELETE FROM patient WHERE pid = ?";

        try (
            Connection con = DBConnection.getConnection();
            PreparedStatement ps = con.prepareStatement(sql)
        ) {

            ps.setString(1, pid);

            int rows = ps.executeUpdate();

            if (rows > 0) {
                System.out.println("Patient deleted successfully!");
            } else {
                System.out.println("Patient not found.");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}