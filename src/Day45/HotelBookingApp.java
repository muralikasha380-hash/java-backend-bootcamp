package Day45;

public class HotelBookingApp {

    public static void main(String[] args) {

        System.out.println("===== HOTEL BOOKING MANAGEMENT =====");

        HotelWebRowSetDAO dao = new HotelWebRowSetDAO();

        dao.viewBookings();
    }
}