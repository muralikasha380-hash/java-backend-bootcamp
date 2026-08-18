package Day18;

import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {

		TreeMap<Integer, String> students = new TreeMap<>();

		//put adds a value
		students.put(103, "Ravi");
		students.put(101, "Murali");
		students.put(105, "Yash");
		students.put(102, "Krishna");
		students.put(104, "Vardhan");
		
		//get gets a value
		System.out.println(students.get(101));
		
		//remove removes a value
		students.remove(105);
		
		//size
		System.out.println(students.size());

		System.out.println("Students: " + students);
	    
	}
}
