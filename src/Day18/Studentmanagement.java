package Day18;

import java.util.TreeMap;

public class Studentmanagement {

	public static void main(String[] args) {

		TreeMap<Integer, String> students = new TreeMap<>();

		// Add students
		students.put(105, "Murali");
		students.put(102, "Krishna");
		students.put(104, "Ravi");
		students.put(101, "Vardhan");
		students.put(103, "Yash");

		// Display all students
		System.out.println("All Students: " + students);

		// Search student
		System.out.println("Student with ID 103: "
				+ students.get(103));

		// Check student
		System.out.println("Student ID 105 exists: "
				+ students.containsKey(105));

		// Remove student
		students.remove(102);

		// Final list
		System.out.println("Final Students: " + students);

		// Total students
		System.out.println("Total Students: "
				+ students.size());
	}
}
