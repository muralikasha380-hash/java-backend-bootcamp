package Day10;

public class PaymentDemo {

	public static void main(String[] args) {

	    Payment p;

	    p = new UPI();
	    p.pay();

	    p = new Card();
	    p.pay();

	    p = new Cash();
	    p.pay();
	
	}
}
