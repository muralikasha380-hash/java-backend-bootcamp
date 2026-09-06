package Day37;

import java.sql.CallableStatement;
import java.sql.Connection;

public class studentDAO {

    public void updateCourse(int id, String course) {

        try {

            // Get database connection
            Connection con = DBConeection.getConnection();

            // Call Oracle stored procedure
            CallableStatement cs =con.prepareCall("{call update_student_course(?, ?)}");

            // Give values to the procedure
            cs.setInt(1, id);
            cs.setString(2, course);

            // Execute procedure
            cs.execute();

            System.out.println("Student course updated successfully!");

            // Close resources
            cs.close();
            con.close();

        } catch (Exception e) {

            e.printStackTrace();
        }
    }
}