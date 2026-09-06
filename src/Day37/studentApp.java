package Day37;

import java.util.Scanner;

public class studentApp {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        System.out.println("===== STUDENT MANAGEMENT SYSTEM =====");

        System.out.println("Enter Student ID:");
        int id = scn.nextInt();

        scn.nextLine(); // consume Enter

        System.out.println("Enter New Course:");
        String course = scn.nextLine();

        studentDAO dao = new studentDAO();

        dao.updateCourse(id, course);

        scn.close();
    }
}