package Day12;

public class vehicleDemo {
	
	public static void main(String[] args) {

			vehicle v;

			v = new car();
			v.start();
			v.stop();

			v = new Bike();
			v.start();
			v.stop();
	    }
}
