package Day49;

public class FoodOrder {

    private int orderId;
    private String customerName;
    private String foodItem;
    private int quantity;
    private double amount;
    private String orderStatus;

    public FoodOrder( int orderId, String customerName, String foodItem, int quantity, double amount, String orderStatus) {

        this.orderId = orderId;
        this.customerName = customerName;
        this.foodItem = foodItem;
        this.quantity = quantity;
        this.amount = amount;
        this.orderStatus = orderStatus;
    }

    public int getOrderId() {
        return orderId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getFoodItem() {
        return foodItem;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getAmount() {
        return amount;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    @Override
    public String toString() {

        return "Order ID: " + orderId + ", Customer: " + customerName + ", Food: " + foodItem + ", Quantity: " + quantity + ", Amount: ₹" + amount + ", Status: " + orderStatus;
    }
}