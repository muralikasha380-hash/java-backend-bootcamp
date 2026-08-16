package Day16;

import java.util.HashSet;

public class EmployeeSet {
	public static void main(String[]args) {
		
		HashSet<String> Employee = new HashSet<>();
		
		Employee.add("Murali");
		Employee.add("Krishna");
		Employee.add("Ravi");
		Employee.add("Vardhan");
		Employee.add("Yash");
		
		//Duplicate Values
		Employee.add("Murali");
		
		System.out.println(Employee);
		
		//checking the Employee
		System.out.println(Employee.contains("Murali"));
		
		//Remove an Employee
		Employee.remove("Yash");
		
		System.out.println("Final Employees: " + Employee);
		
		 System.out.println("Unique Employees: "
	                + Employee.size());
	}

}
