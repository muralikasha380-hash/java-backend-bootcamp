package Day34;

import java.util.ArrayList;
import java.util.List;
	
public class employeeApp {
	
	public static void main(String[] args) {
		
		List<employee> employees = new ArrayList<>();
		
		employees.add(new employee(101, "Murali", 30000));
		employees.add(new employee(102, "Ravi", 35000));
		employees.add(new employee(103, "Kiran", 40000));
		employees.add(new employee(104, "Arjun", 45000));
		employees.add(new employee(105, "Rahul", 50000));
		
		employeeDAO dao = new employeeDAO();
		
		dao.addEmployees(employees);
	}
}
