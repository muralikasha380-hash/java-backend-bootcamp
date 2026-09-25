package Day51;

public class HotelBooking {

    private int bookingId;
    private String guestName;
    private String roomType;
    private int nights;
    private double roomPrice;
    private String bookingStatus;

    public HotelBooking(int bookingId,String guestName,String roomType,int nights,double roomPrice,String bookingStatus) {

        this.bookingId = bookingId;
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
        this.roomPrice = roomPrice;
        this.bookingStatus = bookingStatus;
    }

    public int getBookingId() {
        return bookingId;
    }
    public String getGuestName() {
        return guestName;
    }
    public String getRoomType() {
        return roomType;
    }
    public int getNights() {
        return nights;
    }
    public double getRoomPrice() {
        return roomPrice;
    }
    public String getBookingStatus() {
        return bookingStatus;
    }

    @Override
    public String toString() {

        return "Booking ID: " + bookingId
                + ", Guest: " + guestName
                + ", Room: " + roomType
                + ", Nights: " + nights
                + ", Price: ₹" + roomPrice
                + ", Status: " + bookingStatus;
    }
}