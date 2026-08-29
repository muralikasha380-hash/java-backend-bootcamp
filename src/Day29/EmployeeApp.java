package Day29;

import java.util.Scanner;
	
public class EmployeeApp {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		EmployeeDAO dao =new EmployeeDAO();
		
		System.out.print("Enter Employee ID: ");
		int id = sc.nextInt();
		sc.nextLine();
		
		System.out.print("Enter Employee Name: ");
		String name = sc.nextLine();
		
		System.out.print("Enter Employee Salary: ");
		double salary = sc.nextDouble();
		
		Employee employee =new Employee(id, name, salary);
		
		dao.insertEmployee(employee);
		
		dao.displayEmployees();
		
		System.out.print("\nEnter Employee ID to update: ");
		
		int updateId = sc.nextInt();
		
		System.out.print("Enter new salary: ");
		
		double newSalary = sc.nextDouble();
		
		dao.updateEmployee(updateId, newSalary);
		
		dao.displayEmployees();
		
		System.out.print("\nEnter Employee ID to delete: ");
		
		int deleteId = sc.nextInt();
		
		dao.deleteEmployee(deleteId);
		
		dao.displayEmployees();
		
		sc.close();
	}
}	