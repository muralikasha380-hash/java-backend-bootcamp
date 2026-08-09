package Day09;

class Employee {
	
	String name;
	double salary;

	void displayEmployee() {
		System.out.println("Name: " + name);
	    System.out.println("Salary: " + salary);
	}
}

class Manager extends Employee {
	
	String department;
	
	void displayManager() {
	    System.out.println("Department: " + department);
	}
}

public class EmployeeDemo {

	public static void main(String[] args) {

	    Manager m1 = new Manager();

	    m1.name = "Murali";
	    m1.salary = 50000;
	    m1.department = "IT";

	    m1.displayEmployee();
	    m1.displayManager();
	    
	}	
}
