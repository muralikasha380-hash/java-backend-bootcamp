package Day39;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Types;
import java.util.Scanner;

public class EmployeeFunction {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String driver = "oracle.jdbc.OracleDriver";
        String url = "jdbc:oracle:thin:@localhost:1521/XEPDB1";
        String username = "javauser";
        String password = "Java123";

        try {
            Class.forName(driver);

            Connection con = DriverManager.getConnection(
                    url, username, password);

            System.out.println("Database Connected Successfully");

            System.out.print("Enter Employee ID: ");
            int eid = sc.nextInt();

            CallableStatement cstmt =
                    con.prepareCall("{? = call get_employee_salary(?)}");

            // Return value
            cstmt.registerOutParameter(1, Types.FLOAT);

            // IN parameter
            cstmt.setInt(2, eid);

            cstmt.execute();

            float salary = cstmt.getFloat(1);

            System.out.println("----------------------------");
            System.out.println("Employee ID : " + eid);
            System.out.println("Salary      : " + salary);
            System.out.println("----------------------------");

            cstmt.close();
            con.close();
            sc.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}