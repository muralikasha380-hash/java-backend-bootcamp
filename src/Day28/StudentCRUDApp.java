package Day28;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class StudentCRUDApp {

    static String url =
            "jdbc:oracle:thin:@//localhost:1521/XEPDB1";

    static String username = "YOUR_ORACLE_USERNAME";

    static String password = "YOUR_ORACLE_PASSWORD";

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        while (true) {

            System.out.println("\n--- Student Management System ---");

            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Update Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {

                case 1:
                    addStudent();
                    break;

                case 2:
                    viewStudents();
                    break;

                case 3:
                    updateStudent();
                    break;

                case 4:
                    deleteStudent();
                    break;

                case 5:
                    System.out.println("Application closed.");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }

    // CREATE
    public static void addStudent() {

        System.out.print("Enter ID: ");
        int id = scanner.nextInt();

        System.out.print("Enter Age: ");
        int age = scanner.nextInt();

        scanner.nextLine();

        System.out.print("Enter Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Course: ");
        String course = scanner.nextLine();

        String query =
                "INSERT INTO student (id, name, age, course) VALUES (?, ?, ?, ?)";

        try (
                Connection connection =
                        DriverManager.getConnection(url, username, password);

                PreparedStatement statement =
                        connection.prepareStatement(query)
        ) {

            statement.setInt(1, id);
            statement.setString(2, name);
            statement.setInt(3, age);
            statement.setString(4, course);

            int rows = statement.executeUpdate();

            if (rows > 0) {
                System.out.println("Student added successfully!");
            }

        } catch (Exception e) {

            System.out.println("Error: " + e.getMessage());
        }
    }

    // READ
    public static void viewStudents() {

        String query = "SELECT * FROM student";

        try (
                Connection connection =
                        DriverManager.getConnection(url, username, password);

                PreparedStatement statement =
                        connection.prepareStatement(query);

                ResultSet result =
                        statement.executeQuery()
        ) {

            System.out.println("\n--- Students ---");

            while (result.next()) {

                System.out.println(
                        "ID: " + result.getInt("ID")
                        + " | Name: " + result.getString("NAME")
                        + " | Age: " + result.getInt("AGE")
                        + " | Course: " + result.getString("COURSE"));
            }

        } catch (Exception e) {

            System.out.println("Error: " + e.getMessage());
        }
    }

    // UPDATE
    public static void updateStudent() {

        System.out.print("Enter Student ID: ");
        int id = scanner.nextInt();

        scanner.nextLine();

        System.out.print("Enter New Course: ");
        String course = scanner.nextLine();

        String query =
                "UPDATE student SET course = ? WHERE id = ?";

        try (
                Connection connection =
                        DriverManager.getConnection(url, username, password);

                PreparedStatement statement =
                        connection.prepareStatement(query)
        ) {

            statement.setString(1, course);
            statement.setInt(2, id);

            int rows = statement.executeUpdate();

            if (rows > 0) {
                System.out.println("Student updated successfully!");
            } else {
                System.out.println("Student not found.");
            }

        } catch (Exception e) {

            System.out.println("Error: " + e.getMessage());
        }
    }

    // DELETE
    public static void deleteStudent() {

        System.out.print("Enter Student ID: ");
        int id = scanner.nextInt();

        String query =
                "DELETE FROM student WHERE id = ?";

        try (
                Connection connection =
                        DriverManager.getConnection(url, username, password);

                PreparedStatement statement =
                        connection.prepareStatement(query)
        ) {

            statement.setInt(1, id);

            int rows = statement.executeUpdate();

            if (rows > 0) {
                System.out.println("Student deleted successfully!");
            } else {
                System.out.println("Student not found.");
            }

        } catch (Exception e) {

            System.out.println("Error: " + e.getMessage());
        }
    }
}