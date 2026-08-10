package Day10;

class Vehicle {

	void start() {
	    System.out.println("Vehicle is starting");
	}
}

class Car extends Vehicle {

	@Override
	void start() {
	    System.out.println("Car is starting");
	}
}

class Bike extends Vehicle {

	@Override
	void start() {
	    System.out.println("Bike is starting");
	}
}

public class VehicleDemo {

	public static void main(String[] args) {

	    Vehicle v;

	    v = new Car();
	    v.start();

	    v = new Bike();
	    v.start();
	 
	}
}
