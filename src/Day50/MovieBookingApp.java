package Day50;

public class MovieBookingApp {

    public static void main(String[] args) {

        System.out.println("===== MOVIE TICKET BOOKING MANAGEMENT =====" );

        MovieBookingRowSetDAO dao =new MovieBookingRowSetDAO();

        dao.viewBookings();
    }
}