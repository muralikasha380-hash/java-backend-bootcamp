package Day14;

import java.util.ArrayList;

public class StudentList {

	public static void main(String[] args) {

		ArrayList<String> students = new ArrayList<>();

		// Adding students
		students.add("Murali");
		students.add("Rahul");
		students.add("Arun");
		students.add("Kiran");

		System.out.println("Students: " + students);

		// Get student
		System.out.println("First student: " + students.get(0));

		// Update student
		students.set(1, "Ravi");

		System.out.println("After update: " + students);

		// Remove student
		students.remove("Arun");

		System.out.println("After removal: " + students);

		// Size
        System.out.println("Number of students: " + students.size());

        // Loop
        System.out.println("Student names:");

        for (String student : students) {
        	System.out.println(student);
        }
	}
}

