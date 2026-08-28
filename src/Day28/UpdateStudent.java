package Day28;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class UpdateStudent {

    public static void main(String[] args) {

        String DBurl = "jdbc:oracle:thin:@//localhost:1521/XEPDB1";
        String username = "javauser";
        String password = "Java123";

        String query = "UPDATE student SET course = ? WHERE id = ?";

        try {

            Connection connection =
                    DriverManager.getConnection(
                            DBurl, username, password);

            System.out.println("Database connected successfully!");

            PreparedStatement statement =
                    connection.prepareStatement(query);

            statement.setString(1, "Spring Boot");
            statement.setInt(2, 1);

            int rows = statement.executeUpdate();

            if (rows > 0) {
                System.out.println("Student updated successfully!");
            } else {
                System.out.println("Student not found.");
            }

            statement.close();
            connection.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}