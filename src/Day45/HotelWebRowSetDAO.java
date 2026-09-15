package Day45;

import java.sql.Connection;

import javax.sql.rowset.RowSetProvider;
import javax.sql.rowset.WebRowSet;

public class HotelWebRowSetDAO {
    public void viewBookings() {
        String sql ="SELECT * FROM hotel_booking";

        try {

            Connection con = DBConnection.getConnection();
            WebRowSet rowSet =RowSetProvider.newFactory().createWebRowSet();
            rowSet.setCommand(sql);
            rowSet.execute(con);
            System.out.println("\n===== HOTEL BOOKING DETAILS =====");

            while (rowSet.next()) {
                System.out.println(rowSet.getInt("booking_id") + " " + rowSet.getString("guest_name") + " Room: "+ rowSet.getInt("room_number")+ " "+ rowSet.getString("room_type") + " "+ rowSet.getString("booking_status"));
            }

            System.out.println( "\n===== XML REPRESENTATION =====" );
            rowSet.beforeFirst();
            rowSet.writeXml(new java.io.FileOutputStream("src/Day45/hotel_booking.xml"));           		
            con.close();
            rowSet.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}