package Day39;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Types;
import java.util.Scanner;

public class CallableStatementMenu {

    static String driver = "oracle.jdbc.OracleDriver";
    static String url = "jdbc:oracle:thin:@localhost:1521/XEPDB1";
    static String username = "javauser";
    static String password = "Java123";

    static Connection connect() {

        Connection con = null;

        try {
            Class.forName(driver);

            con = DriverManager.getConnection(
                    url, username, password);

            System.out.println("Database Connected Successfully");

        } catch (Exception e) {
            e.printStackTrace();
        }

        return con;
    }

    static void getEmployeeName() {

        Scanner sc = new Scanner(System.in);

        try {
            Connection con = connect();

            if (con == null) {
                System.out.println("Database connection failed.");
                return;
            }

            System.out.print("Enter Employee ID: ");
            int eid = sc.nextInt();

            CallableStatement cstmt =
                    con.prepareCall("{call get_employee_name(?,?)}");

            cstmt.setInt(1, eid);
            cstmt.registerOutParameter(2, Types.VARCHAR);

            cstmt.execute();

            System.out.println("Employee Name: "
                    + cstmt.getString(2));

            cstmt.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static void getEmployeeSalary() {

        Scanner sc = new Scanner(System.in);

        try {
            Connection con = connect();

            if (con == null) {
                System.out.println("Database connection failed.");
                return;
            }

            System.out.print("Enter Employee ID: ");
            int eid = sc.nextInt();

            CallableStatement cstmt =
                    con.prepareCall(
                            "{? = call get_employee_salary(?)}");

            cstmt.registerOutParameter(1, Types.FLOAT);
            cstmt.setInt(2, eid);

            cstmt.execute();

            System.out.println("Employee Salary: "
                    + cstmt.getFloat(1));

            cstmt.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println();
            System.out.println("===== DAY 39 =====");
            System.out.println("1. Get Employee Name");
            System.out.println("2. Get Employee Salary");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    getEmployeeName();
                    break;

                case 2:
                    getEmployeeSalary();
                    break;

                case 3:
                    System.out.println("Thank you!");
                    sc.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}