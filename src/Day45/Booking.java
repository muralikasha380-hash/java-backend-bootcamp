package Day45;

public class Booking {

    private int bookingId;
    private String guestName;
    private int roomNumber;
    private String roomType;
    private String bookingStatus;

    public Booking(int bookingId, String guestName, int roomNumber, String roomType, String bookingStatus) {

        this.bookingId = bookingId;
        this.guestName = guestName;
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.bookingStatus = bookingStatus;
    }

    public int getBookingId() {
        return bookingId;
    }
    public String getGuestName() {
        return guestName;
    }
    public int getRoomNumber() {
        return roomNumber;
    }
    public String getRoomType() {
        return roomType;
    }
    public String getBookingStatus() {
        return bookingStatus;
    }
    @Override
    public String toString() {

        return "Booking ID: " + bookingId + ", Guest: " + guestName + ", Room: " + roomNumber + ", Type: " + roomType + ", Status: " + bookingStatus;
    }
}