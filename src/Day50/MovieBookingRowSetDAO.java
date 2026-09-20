package Day50;

import java.sql.Connection;

import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.RowSetProvider;

public class MovieBookingRowSetDAO {

    public void viewBookings() {

        String sql ="SELECT booking_id, customer_name, "+ "movie_name, ticket_count, "+ "ticket_price, booking_status "+ "FROM movie_booking "+ "ORDER BY ticket_price DESC";

        Connection con = null;

        try {

            con = DBConnection.getConnection();

            CachedRowSet rowSet =RowSetProvider.newFactory().createCachedRowSet();

            rowSet.setCommand(sql);

            rowSet.execute(con);

            System.out.println("\n===== ALL MOVIE BOOKINGS =====");

            while (rowSet.next()) {

                System.out.println(rowSet.getInt("booking_id")+ "  "+ rowSet.getString("customer_name")+ "  "+ rowSet.getString("movie_name")+ "  Tickets: "+ rowSet.getInt("ticket_count")+ "  ₹"+ rowSet.getDouble("ticket_price")+ "  " + rowSet.getString("booking_status")
                );
            }

            /*
             * Move back to first row
             */
            rowSet.beforeFirst();

            System.out.println("\n===== CONFIRMED BOOKINGS =====");

            while (rowSet.next()) {

                String status =
                        rowSet.getString("booking_status");

                if ("Confirmed".equalsIgnoreCase(status)) {

                    System.out.println(rowSet.getInt("booking_id")+ "  "+ rowSet.getString("customer_name")+ "  "+ rowSet.getString("movie_name")+ "  Tickets: "+ rowSet.getInt("ticket_count")+ "  ₹"+ rowSet.getDouble("ticket_price"));
                }
            }

            /*
             * Navigate to second booking
             */
            if (rowSet.absolute(2)) {

                System.out.println("\n===== SECOND BOOKING =====");

                System.out.println("Booking ID: "+ rowSet.getInt("booking_id"));

                System.out.println("Customer: "+ rowSet.getString("customer_name"));

                System.out.println("Movie: "+ rowSet.getString("movie_name"));
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