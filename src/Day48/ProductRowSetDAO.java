package Day48;

import java.sql.Connection;

import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.RowSetProvider;

public class ProductRowSetDAO {

    public void manageProducts() {

        String sql ="SELECT product_id, product_name, " + "category, quantity, price " + "FROM product_inventory";

        Connection con = null;
        try {
            con = DBConnection.getConnection();
            CachedRowSet rowSet =RowSetProvider.newFactory().createCachedRowSet();
            rowSet.setCommand(sql);
            rowSet.execute(con);
            System.out.println("\n===== ORIGINAL PRODUCT DETAILS =====");

            while (rowSet.next()) {
                System.out.println( rowSet.getInt("product_id") + "  " + rowSet.getString("product_name") + "  "+ rowSet.getString("category") + "  Quantity: " + rowSet.getInt("quantity") + "  Price: ₹"+ rowSet.getDouble("price"));
            }

            rowSet.absolute(3);
            System.out.println("\n===== UPDATING PRODUCT 103 =====");
            System.out.println( "Old Quantity: "+ rowSet.getInt("quantity"));
            rowSet.updateInt("quantity", 50);
            rowSet.updateRow();
            System.out.println( "New Quantity: "+ rowSet.getInt("quantity"));
            rowSet.acceptChanges(con);

            System.out.println( "Product quantity updated successfully!");
            rowSet.beforeFirst();

            System.out.println("\n===== UPDATED PRODUCT DETAILS =====");

            while (rowSet.next()) {
                System.out.println(rowSet.getInt("product_id")+ " " + rowSet.getString("product_name") + "  "+ rowSet.getString("category") + "  Quantity: " + rowSet.getInt("quantity")+ "  Price: ₹" + rowSet.getDouble("price"));
            }

            rowSet.close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (con != null) {
                    con.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}