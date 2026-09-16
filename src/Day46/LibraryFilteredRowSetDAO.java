package Day46;

import java.sql.Connection;
import javax.sql.rowset.FilteredRowSet;
import javax.sql.rowset.RowSetProvider;

public class LibraryFilteredRowSetDAO {

    public void viewAffordableBooks() {

        String sql ="SELECT * FROM library_book";

        try {
            Connection con =DBConnection.getConnection();
            FilteredRowSet rowSet =RowSetProvider.newFactory().createFilteredRowSet();
            rowSet.setCommand(sql);
            rowSet.execute(con);
            System.out.println("\n===== ALL BOOKS =====");
            while (rowSet.next()) {
                System.out.println(rowSet.getInt("book_id")+ "  " + rowSet.getString("book_name") + "  "+ rowSet.getString("author") + "  " + rowSet.getString("category") + "  ₹" + rowSet.getDouble("price"));
            }

            BookFilter filter = new BookFilter(500);
            rowSet.beforeFirst();
            rowSet.setFilter(filter);
            System.out.println("\n===== BOOKS BELOW ₹500 =====");
            while (rowSet.next()) {
                System.out.println( rowSet.getInt("book_id") + "  " + rowSet.getString("book_name") + "  " + rowSet.getString("author") + "  " + rowSet.getString("category") + "  ₹"+ rowSet.getDouble("price"));
            }
            
            con.close();
            rowSet.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}