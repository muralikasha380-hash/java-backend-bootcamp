package Day51;

public class HotelBookingApp {

	public static void main(String[] args) {

		System.out.println("===== HOTEL BOOKING XML MANAGEMENT =====");

		HotelBookingWebRowSetDAO dao = new HotelBookingWebRowSetDAO();

		dao.generateXML();
	}

}
