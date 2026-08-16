package Day16;

import java.util.HashSet;

public class HashSetDemo1 {

	public static void main(String[] args) {

		HashSet<String> students = new HashSet<>();

		// Adding students
		students.add("Murali");
		students.add("Rahul");
		students.add("Arun");
		students.add("Murali");
		students.add("Rahul");

        System.out.println("Students: " + students);

		// Check student
        System.out.println("Contains Murali: "
					+ students.contains("Murali"));

		// Remove student
        students.remove("Rahul");

		System.out.println("After removal: " + students);

	    // Number of unique students
	    System.out.println("Number of students: "
	                + students.size());

	    // Display students
	    System.out.println("Student names:");
	        
	    for (String student : students) {
	    	System.out.println(student);
	    }
	}
}
