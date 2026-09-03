package Day34;

public class employee {
	
	private int empId;
	private String empName;
	private double salary;
	
	// Constructor
	public employee(int empId, String empName, double salary) {
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
	}
	
	// Getters
	public int getEmpId() {
		return empId;
	}

	public String getEmpName() {
		return empName;
	}
	
	public double getSalary() {
		return salary;
	}
	
	// Setters
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	
	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	// toString()
	@Override
	public String toString() {
		return "Employee ID: " + empId+ ", Name: " + empName+ ", Salary: " + salary;
	}
}