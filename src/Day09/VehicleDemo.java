package Day09;

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

public class VehicleDemo {

	public static void main(String[] args) {

	    Car c1 = new Car();

	    c1.start();
	   
	}
}
