package Day31;

import java.util.Scanner;

public class EmployeeApp {

	public static void main(String[] args) {
		
		Scanner sc =
				new Scanner(System.in);
		
		EmployeeDAO dao =
				new EmployeeDAO();
		
		while (true) {
			
			System.out.println(
					"\n===== Employee Management System =====");
			
			System.out.println("1. Insert Employee");
			System.out.println("2. View Employees");
			System.out.println("3. Search Employee");
			System.out.println("4. Update Employee");
			System.out.println("5. Delete Employee");
			System.out.println("6. Exit");
			
			System.out.print(
					"Enter your choice: ");
			
			int choice =
					sc.nextInt();
			
			sc.nextLine();
			
			switch (choice) {
			
			case 1:
				
				System.out.println(
						"\n***** Employee Data *****");
				
				System.out.print(
						"Enter Employee ID: ");
				
				String eid =
						sc.nextLine();
				
				System.out.print(
						"Enter First Name: ");
				
				String efname =
						sc.nextLine();
				
				System.out.print(
						"Enter Last Name: ");
				
				String elname =
						sc.nextLine();
				
				System.out.print(
						"Enter Salary: ");
				
				double esal =
						sc.nextDouble();
				
				sc.nextLine();
				
				System.out.print(
						"Enter Address: ");
				
				String eaddress =
						sc.nextLine();
				
				Employee emp =
						new Employee(
								eid,
								efname,
								elname,
								esal,
								eaddress);
				
				dao.insertEmployee(emp);
				
				break;
				
				
			case 2:
				
				dao.viewEmployees();
				
				break;
				
				
			case 3:
				
				System.out.print(
						"Enter Employee ID: ");
				
				String searchId =
						sc.nextLine();
				
				dao.searchEmployee(searchId);
				
				break;
				
				
			case 4:

				System.out.print(
						"Enter Employee ID: ");
				
				String updateId =
						sc.nextLine();
				
				System.out.print(
						"Enter New Salary: ");
				
				double newSalary =
						sc.nextDouble();
				
				sc.nextLine();
				
				dao.updateEmployee(
						updateId,
						newSalary);
				
				break;
				
				
			case 5:
				
				System.out.print(
						"Enter Employee ID: ");
				
				String deleteId =
	                        sc.nextLine();

				dao.deleteEmployee(deleteId);
				
				break;
				
				
			case 6:
				
				System.out.println(
						"Application closed.");
				
				sc.close();
				
				return;
				
				
			default:
				
				System.out.println(
						"Invalid choice!");
			}
		}
	}
}

