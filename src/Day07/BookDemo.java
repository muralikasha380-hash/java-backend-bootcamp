package Day07;

class Book {

	    String title;
	    double price;

	    Book(String title, double price) {

	        this.title = title;
	        this.price = price;
	    }

	    void display() {
	        System.out.println("Title: " + title);
	        System.out.println("Price: " + price);
	    }
	}

public class BookDemo {

	 public static void main(String[] args) {
		 
	     Book b1 = new Book("Java Programming", 500);

	        b1.display();

	}

}
