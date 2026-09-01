package Day32;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class patientDAO {

    // Add Patient
    public void addPatient(patient p) {

        String sql =
                "INSERT INTO patient (id, name, age, disease) VALUES (?, ?, ?, ?)";

        try {

            Connection con = DBConnection.getConnection();

            PreparedStatement ps =
                    con.prepareStatement(sql);

            ps.setInt(1, p.getId());
            ps.setString(2, p.getName());
            ps.setInt(3, p.getAge());
            ps.setString(4, p.getDisease());

            int rows = ps.executeUpdate();

            System.out.println(
                    rows + " patient added successfully!"
            );

            ps.close();
            con.close();

        } catch (Exception e) {

            e.printStackTrace();
        }
    }


    // View All Patients
    public void viewPatients() {

        String sql = "SELECT * FROM patient";

        try {

            Connection con = DBConnection.getConnection();

            PreparedStatement ps =
                    con.prepareStatement(sql);

            ResultSet rs =
                    ps.executeQuery();

            System.out.println();
            System.out.println("===== Patient List =====");

            while (rs.next()) {

                System.out.println(
                        "ID: " + rs.getInt("id")
                        + " | Name: " + rs.getString("name")
                        + " | Age: " + rs.getInt("age")
                        + " | Disease: " + rs.getString("disease")
                );
            }

            rs.close();
            ps.close();
            con.close();

        } catch (Exception e) {

            e.printStackTrace();
        }
    }


    // Retrieve Patient by ID
    public void retrievePatient(int id) {

        String sql =
                "SELECT * FROM patient WHERE id = ?";

        try {

            Connection con = DBConnection.getConnection();

            PreparedStatement ps =
                    con.prepareStatement(sql);

            ps.setInt(1, id);

            ResultSet rs =
                    ps.executeQuery();

            if (rs.next()) {

                System.out.println();
                System.out.println("===== Patient Details =====");

                System.out.println(
                        "ID: " + rs.getInt("id")
                );

                System.out.println(
                        "Name: " + rs.getString("name")
                );

                System.out.println(
                        "Age: " + rs.getInt("age")
                );

                System.out.println(
                        "Disease: " + rs.getString("disease")
                );

            } else {

                System.out.println(
                        "Patient not found!"
                );
            }

            rs.close();
            ps.close();
            con.close();

        } catch (Exception e) {

            e.printStackTrace();
        }
    }


    // Update Patient
    public void updatePatient(int id, String disease) {

        String sql =
                "UPDATE patient SET disease = ? WHERE id = ?";

        try {

            Connection con = DBConnection.getConnection();

            PreparedStatement ps =
                    con.prepareStatement(sql);

            ps.setString(1, disease);
            ps.setInt(2, id);

            int rows =
                    ps.executeUpdate();

            System.out.println(
                    rows + " patient updated successfully!"
            );

            ps.close();
            con.close();

        } catch (Exception e) {

            e.printStackTrace();
        }
    }


    // Delete Patient
    public void deletePatient(int id) {

        String sql =
                "DELETE FROM patient WHERE id = ?";

        try {

            Connection con = DBConnection.getConnection();

            PreparedStatement ps =
                    con.prepareStatement(sql);

            ps.setInt(1, id);

            int rows =
                    ps.executeUpdate();

            System.out.println(
                    rows + " patient deleted successfully!"
            );

            ps.close();
            con.close();

        } catch (Exception e) {

            e.printStackTrace();
        }
    }
}
