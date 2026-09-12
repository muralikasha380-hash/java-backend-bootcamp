package Day42;

import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetProvider;

public class StudentRowSetDAO {
    public void viewStudents() {
        String sql ="SELECT * FROM student";
        try {
            JdbcRowSet rowSet =RowSetProvider.newFactory().createJdbcRowSet();
            rowSet.setUrl("jdbc:oracle:thin:@//localhost:1521/XEPDB1");
            rowSet.setUsername("javauser");
            rowSet.setPassword("Java123");
            rowSet.setCommand(sql);
            rowSet.execute();
            
            System.out.println("===== STUDENT DETAILS =====/n");
            while (rowSet.next()) {
                System.out.println(rowSet.getInt("id")+ "  "+ rowSet.getString("name")+ "  "+ rowSet.getInt("age")+ "  "+ rowSet.getString("course"));
            }
            rowSet.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}