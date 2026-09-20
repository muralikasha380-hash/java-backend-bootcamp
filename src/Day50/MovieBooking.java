package Day50;

public class MovieBooking {

    private int bookingId;
    private String customerName;
    private String movieName;
    private int ticketCount;
    private double ticketPrice;
    private String bookingStatus;

    public MovieBooking(
            int bookingId,
            String customerName,
            String movieName,
            int ticketCount,
            double ticketPrice,
            String bookingStatus) {

        this.bookingId = bookingId;
        this.customerName = customerName;
        this.movieName = movieName;
        this.ticketCount = ticketCount;
        this.ticketPrice = ticketPrice;
        this.bookingStatus = bookingStatus;
    }

    public int getBookingId() {
        return bookingId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getMovieName() {
        return movieName;
    }

    public int getTicketCount() {
        return ticketCount;
    }

    public double getTicketPrice() {
        return ticketPrice;
    }

    public String getBookingStatus() {
        return bookingStatus;
    }

    @Override
    public String toString() {

        return "Booking ID: " + bookingId+ ", Customer: " + customerName+ ", Movie: " + movieName + ", Tickets: " + ticketCount + ", Price: ₹" + ticketPrice + ", Status: " + bookingStatus;
    }
}