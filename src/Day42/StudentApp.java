package Day42;

public class StudentApp {

    public static void main(String[] args) {
        System.out.println("===== JDBC ROWSET STUDENT APPLICATION =====");
        StudentRowSetDAO dao = new StudentRowSetDAO();
        dao.viewStudents();
    }
}