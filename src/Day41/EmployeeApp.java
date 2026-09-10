package Day41;

public class EmployeeApp {

    public static void main(String[] args) {

        EmployeeDAO dao = new EmployeeDAO();

        System.out.println("===== JDBC RESULTSET NAVIGATION =====");

        dao.showEmployees();
    }
}