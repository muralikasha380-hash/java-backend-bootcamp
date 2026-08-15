package Day15;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {

		LinkedList<String> students = new LinkedList<>();

		// Add students
		students.add("Murali");
		students.add("Rahul");
		students.add("Arun");

		System.out.println("Students: " + students);

		// Add at beginning
	        students.addFirst("Kiran");

	    // Add at end
	    students.addLast("Ravi");

	    System.out.println("After adding: " + students);

	    // Get element
		System.out.println("First student: " + students.get(0));

		// Update element
		students.set(1, "Suresh");

		System.out.println("After update: " + students);

		// Remove first
		students.removeFirst();

		// Remove last
		students.removeLast();

		System.out.println("After removal: " + students);

		// Size
		System.out.println("Number of students: " + students.size());

	}
}
