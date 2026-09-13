package Day43;

public class EmployeeApp {

    public static void main(String[] args) {

        System.out.println("===== EMPLOYEE ATTENDANCE MANAGEMENT =====");

        EmployeeCachedRowSetDAo dao = new EmployeeCachedRowSetDAo();

        dao.viewEmployees();
    }
}