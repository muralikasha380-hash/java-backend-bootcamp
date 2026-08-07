//Default Constructor

package Day07;

class Laptop {
	
	String brand;
	int price;

	 Laptop() {
	        System.out.println("Laptop object created");
	    }

	  void display() {
	        System.out.println(brand);
	        System.out.println(price);
	    }
	}

public class LaptopDemo {

	    public static void main(String[] args) {

	        Laptop l1 = new Laptop();

	        l1.brand = "Dell";
	        l1.price = 60000;

	        l1.display();
	
	}

}
