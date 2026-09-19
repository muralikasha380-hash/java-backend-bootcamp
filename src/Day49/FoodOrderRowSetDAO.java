package Day49;

import java.sql.Connection;

import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.RowSetProvider;

public class FoodOrderRowSetDAO {

    public void manageOrders() {

        String sql =
                "SELECT order_id, customer_name, "
              + "food_item, quantity, amount, order_status "
              + "FROM food_order";

        Connection con = null;

        try {

            con = DBConnection.getConnection();

            CachedRowSet rowSet =RowSetProvider.newFactory().createCachedRowSet();

            rowSet.setCommand(sql);

            rowSet.execute(con);

            System.out.println("\n===== ORIGINAL ORDERS =====");

            while (rowSet.next()) {

                System.out.println(rowSet.getInt("order_id")+ "  " + rowSet.getString("customer_name")+ "  " + rowSet.getString("food_item") + "  Qty: " + rowSet.getInt("quantity") + "  ₹" + rowSet.getDouble("amount")+ "  " + rowSet.getString("order_status"));
            }
            
            /*
             * DELETE ORDER 1005
             */
            rowSet.beforeFirst();

            while (rowSet.next()) {

                if (rowSet.getInt("order_id") == 1005) {

                    System.out.println("\nDeleting cancelled order: 1005");

                    rowSet.deleteRow();

                    break;
                }
            }

            /*
             * INSERT NEW ORDER
             */

            rowSet.moveToInsertRow();

            rowSet.updateInt("order_id",1006);

            rowSet.updateString("customer_name","Vijay");

            rowSet.updateString("food_item","Chicken Biryani");

            rowSet.updateInt("quantity",2);

            rowSet.updateDouble("amount",600);

            rowSet.updateString( "order_status", "Preparing");

            rowSet.insertRow();

            rowSet.moveToCurrentRow();

            /*
             * SAVE CHANGES
             */

            rowSet.acceptChanges(con);

            System.out.println( "\nOrder changes saved successfully!");

            /*
             * DISPLAY FINAL DATA
             */

            rowSet.beforeFirst();

            System.out.println("\n===== FINAL ORDER DETAILS =====");

            while (rowSet.next()) {

                System.out.println(rowSet.getInt("order_id")+ "  " + rowSet.getString("customer_name") + "  " + rowSet.getString("food_item") + "  Qty: " + rowSet.getInt("quantity") + "  ₹" + rowSet.getDouble("amount") + "  " + rowSet.getString("order_status"));
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