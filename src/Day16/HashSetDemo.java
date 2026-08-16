package Day16;

import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {

		HashSet<String> students = new HashSet<>();

		students.add("Murali");
		students.add("Rahul");
		students.add("Arun");
		
		//Duplicate values
		students.add("Murali");
		students.add("Rahul");
		
		//removing an element
		students.remove("Rahul");
		
		//checking whether element exist
		System.out.println(students.contains("Murali"));
		System.out.println(students.contains("Rahul"));
		
		

		System.out.println(students);
	}
}
