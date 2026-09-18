package Day48;

public class Product {

    private int productId;
    private String productName;
    private String category;
    private int quantity;
    private double price;

    public Product(int productId, String productName, String category, int quantity, double price) {

        this.productId = productId;
        this.productName = productName;
        this.category = category;
        this.quantity = quantity;
        this.price = price;
    }

    public int getProductId() {
        return productId;
    }
    public String getProductName() {
        return productName;
    }
    public String getCategory() {
        return category;
    }
    public int getQuantity() {
        return quantity;
    }
    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Product ID: " + productId+ ", Name: " + productName+ ", Category: " + category+ ", Quantity: " + quantity+ ", Price: ₹" + price;
    }
}