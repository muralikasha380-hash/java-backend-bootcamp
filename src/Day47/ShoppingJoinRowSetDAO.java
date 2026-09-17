package Day47;

import java.sql.Connection;

import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.JoinRowSet;
import javax.sql.rowset.RowSetProvider;

public class ShoppingJoinRowSetDAO {

    public void showCustomerOrders() {

        String customerSQL ="SELECT customer_id, customer_name, city "+ "FROM shop_customer";
        String orderSQL ="SELECT order_id, customer_id, " + "product_name, amount " + "FROM shop_order";
        
        try {
            Connection con =DBConnection.getConnection();

            // Customer RowSet
            CachedRowSet customerRowSet =RowSetProvider.newFactory() .createCachedRowSet();
            customerRowSet.setCommand(customerSQL);
            customerRowSet.execute(con);

            // Order RowSet
            CachedRowSet orderRowSet =RowSetProvider.newFactory().createCachedRowSet();
            orderRowSet.setCommand(orderSQL);
            orderRowSet.execute(con);

            // Join RowSet
            JoinRowSet joinRowSet =RowSetProvider.newFactory().createJoinRowSet();

            /*
             * customer_id is the matching column
             */

            customerRowSet.setMatchColumn("customer_id");
            orderRowSet.setMatchColumn("customer_id");
            joinRowSet.addRowSet(customerRowSet);
            joinRowSet.addRowSet(orderRowSet);
            System.out.println("\n===== CUSTOMER ORDER DETAILS =====");

            while (joinRowSet.next()) {
                System.out.println( "Customer ID: "+ joinRowSet.getInt("customer_id") + " Customer: "+ joinRowSet.getString("customer_name")+ "  City " + joinRowSet.getString("city") + "  Order ID: " + joinRowSet.getInt("order_id")+ " | Product: "+ joinRowSet.getString("product_name")+ " | Amount: ₹" + joinRowSet.getDouble("amount")
                );
            }
            
            con.close();
            customerRowSet.close();
            orderRowSet.close();
            joinRowSet.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}