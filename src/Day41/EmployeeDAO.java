package Day41;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class EmployeeDAO {

    public void showEmployees() {

        String sql = "SELECT * FROM employee_resultset";

        try (
            Connection con = DBConnection.getConnection();

            PreparedStatement ps = con.prepareStatement(sql,ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);

            ResultSet rs = ps.executeQuery()
        ) {

            System.out.println("\n===== ALL EMPLOYEES =====");

            while (rs.next()) {

                System.out.println(
                        rs.getInt("emp_id") + " | "
                        + rs.getString("emp_name") + " | "
                        + rs.getString("department") + " | "
                        + rs.getDouble("salary")
                );
            }

            System.out.println("\n===== LAST EMPLOYEE =====");

            if (rs.last()) {

                System.out.println(rs.getInt("emp_id") + "  " + rs.getString("emp_name") + "  "+ rs.getString("department") + " | "+ rs.getDouble("salary")
                );
            }

            System.out.println("\n===== FIRST EMPLOYEE =====");

            if (rs.first()) {

                System.out.println(rs.getInt("emp_id") + "  "+ rs.getString("emp_name") + "  "+ rs.getString("department") + " "+ rs.getDouble("salary"));
            }

            System.out.println("\n===== THIRD EMPLOYEE =====");

            if (rs.absolute(3)) {

                System.out.println(rs.getInt("emp_id") + "  " + rs.getString("emp_name") + "  " + rs.getDouble("salary"));
            }

            System.out.println("\n===== PREVIOUS EMPLOYEE =====");

            if (rs.previous()) {

                System.out.println(rs.getInt("emp_id") + "  "+ rs.getString("emp_name") + "  "+ rs.getString("department") + " | " + rs.getDouble("salary")
                );
            }

            System.out.println("\nCurrent Row Number: "
                    + rs.getRow());

        } catch (Exception e) {

            e.printStackTrace();
        }
    }
}