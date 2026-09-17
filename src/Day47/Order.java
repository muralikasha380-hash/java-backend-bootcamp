package Day47;

public class Order {

    private int orderId;
    private int customerId;
    private String productName;
    private double amount;

    public Order(
            int orderId,
            int customerId,
            String productName,
            double amount) {

        this.orderId = orderId;
        this.customerId = customerId;
        this.productName = productName;
        this.amount = amount;
    }

    public int getOrderId() {
        return orderId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public String getProductName() {
        return productName;
    }

    public double getAmount() {
        return amount;
    }

    @Override
    public String toString() {

        return "Order ID: " + orderId
                + ", Customer ID: " + customerId
                + ", Product: " + productName
                + ", Amount: " + amount;
    }
}