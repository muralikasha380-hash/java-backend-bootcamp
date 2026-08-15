package Day15;

import java.util.LinkedList;

public class EmployeeLinkedList {

	public static void main(String[] args) {
	        
		// Create LinkedList of employees
		LinkedList<String> employees = new LinkedList<>();

		// Add 5 employees
		employees.add("Murali");
		employees.add("Rahul");
		employees.add("Arun");
		employees.add("Sita");
		employees.add("Geeta");

		// Add one employee at the beginning
		employees.addFirst("FirstEmployee");

		// Add one employee at the end
		employees.addLast("LastEmployee");

		// Change one employee (replace index 2 for example)
		employees.set(2, "ChangedEmployee");

		// Remove the first employee
		employees.removeFirst();

		// Remove the last employee
		employees.removeLast();

		// Print the final list
		System.out.println("Final Employee List: " + employees);

		// Print the total number of employees
		System.out.println("Total number of employees: " + employees.size());

	}
}
