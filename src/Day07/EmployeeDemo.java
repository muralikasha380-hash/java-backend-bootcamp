//this keyword

package Day07;

class Employee {

	int id;
	String name;

	Employee(int id, String name) {

	     this.id = id;
	     this.name = name;
	     
	     }
	
	void display() {
		
	    System.out.println("ID: " + id);
	    System.out.println("Name: " + name);
	    
	    }
	}

public class EmployeeDemo {
	
	public static void main(String[] args) {
		
		Employee e1 = new Employee(101, "Murali");

		e1.display();
		
	}

}
