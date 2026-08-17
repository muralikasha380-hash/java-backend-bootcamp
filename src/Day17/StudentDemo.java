package Day17;

import java.util.HashMap;

public class StudentDemo {

	public static void main(String[] args) {

		HashMap<Integer, String> students = new HashMap<>();

		// Adding students
		students.put(101, "Murali");
		students.put(102, "Krishna");
		students.put(103, "Ravi");

		System.out.println("Students: " + students);

		// Get student
		System.out.println("Student 101: "
				+ students.get(101));

		// Update student
		students.put(103, "Arun");

		// Remove student
		students.remove(102);

		// Check key
		System.out.println("Contains ID 101: "
				+ students.containsKey(101));

		// Check value
		System.out.println("Contains Murali: "
				+ students.containsValue("Murali"));

		// Final map
		System.out.println("Final Students: " + students);

		// Size
		System.out.println("Number of students: "
				+ students.size());

		// Loop
		System.out.println("Student Details:");

		for (Integer id : students.keySet()) {
			System.out.println(id + " : " + students.get(id));
	     
	    }
	}
}
