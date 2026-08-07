package Day07;

class Car {
	String brand;
	int price;

	void display() {
		
		System.out.println("Brand: " + brand);
	    System.out.println("Price: " + price);
	    
	    }
	}

public class CarDemo {
	
	public static void main(String[] args) {
		
		Car c1 = new Car();
	    Car c2 = new Car();
	    
	    c1.brand = "Toyota";
	    c1.price = 1500000;
	        
	    c2.brand = "Mustang";
	    c2.price = 7400000;

	    c1.display();
	    c2.display();
	}

}
