package Day35;

import java.util.Scanner;

public class EmployeeApp {
	
    public static void main(String[] args) {
    	
        Scanner sc = new Scanner(System.in);
        
        EmployeeDAO dao = new EmployeeDAO();
        
        System.out.println("===== EMPLOYEE SALARY MANAGEMENT =====");
        
        System.out.print("Enter Employee ID: ");
        int empId = sc.nextInt();
        
        System.out.print("Enter New Salary: ");
        double salary = sc.nextDouble();
        
        if (salary <= 0) {
            System.out.println("Salary must be greater than 0.");
        } else {
            dao.updateSalary(empId, salary);
        }
        
        sc.close();
    }
}