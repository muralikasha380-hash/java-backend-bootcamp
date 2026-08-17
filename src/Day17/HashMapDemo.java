package Day17;

import java.util.HashMap;

public class HashMapDemo {

	public static void main(String[] args) {

		HashMap<Integer, String> students = new HashMap<>();

		students.put(101, "Murali");
		students.put(102, "Krishna");
		students.put(103, "Ravi");
		
		System.out.println(students.get(101));
		
		//put is used to add element
		students.put(101, "Arun");
		
		//Remove a key-value pair
		students.remove(102);
		
		//containsKey Check whether a key exists
		System.out.println(students.containsKey(101));
		
		//containsValue Check whether a value exists
		System.out.println(students.containsValue("Murali"));
		
		//size Find the number of key-value pairs
		System.out.println(students.size());

		System.out.println(students);
	}
}
