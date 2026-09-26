package Day52;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class InventoryDAO {

    public void insertProducts() {

        String sql = "INSERT INTO STORE_INVENTORY " + "(PRODUCT_ID, PRODUCT_NAME, CATEGORY, QUANTITY, PRICE) " + "VALUES (?, ?, ?, ?, ?)";
        try (Connection con = DBConnection.getConnection();
             PreparedStatement pstmt = con.prepareStatement(sql)) {
            con.setAutoCommit(false);

            // Product 1
            pstmt.setInt(1, 101);
            pstmt.setString(2, "Laptop");
            pstmt.setString(3, "Electronics");
            pstmt.setInt(4, 10);
            pstmt.setDouble(5, 55000);
            pstmt.addBatch();

            // Product 2
            pstmt.setInt(1, 102);
            pstmt.setString(2, "Keyboard");
            pstmt.setString(3, "Accessories");
            pstmt.setInt(4, 25);
            pstmt.setDouble(5, 1200);
            pstmt.addBatch();

            // Product 3
            pstmt.setInt(1, 103);
            pstmt.setString(2, "Mouse");
            pstmt.setString(3, "Accessories");
            pstmt.setInt(4, 30);
            pstmt.setDouble(5, 750);
            pstmt.addBatch();

            // Product 4
            pstmt.setInt(1, 104);
            pstmt.setString(2, "Monitor");
            pstmt.setString(3, "Electronics");
            pstmt.setInt(4, 15);
            pstmt.setDouble(5, 12500);
            pstmt.addBatch();

            int[] result = pstmt.executeBatch();
            con.commit();

            System.out.println("Batch executed successfully!");
            System.out.println("Records inserted: " + result.length);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}