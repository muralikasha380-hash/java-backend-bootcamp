package Day51;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.sql.Connection;

import javax.sql.rowset.WebRowSet;
import javax.sql.rowset.RowSetProvider;

public class HotelBookingWebRowSetDAO {

    public void generateXML() {
        String sql ="SELECT booking_id, guest_name, "+ "room_type, nights, room_price, "+ "booking_status "+ "FROM hotel_booking";
        Connection con = null;
        try {
            con = DBconnection.getConnection();
            WebRowSet webRowSet =RowSetProvider.newFactory().createWebRowSet();
            webRowSet.setCommand(sql);
            webRowSet.execute(con);
            System.out.println("\n===== HOTEL BOOKING DETAILS =====");
            while (webRowSet.next()) {
                System.out.println(webRowSet.getInt("booking_id")+ "  "+ webRowSet.getString("guest_name") + "  " + webRowSet.getString("room_type") + "  Nights: " + webRowSet.getInt("nights") + "  ₹"+ webRowSet.getDouble("room_price") + "  " + webRowSet.getString("booking_status"));
            }
            webRowSet.beforeFirst();
            FileWriter fw =new FileWriter("hotel_booking.xml");
            PrintWriter pw =new PrintWriter(fw);
            webRowSet.writeXml(pw);
            pw.close();
            fw.close();

            System.out.println("\nXML file created successfully!");
            System.out.println("File Name: hotel_booking.xml");
            webRowSet.close();
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