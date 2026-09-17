package Day47;

public class Customer {

    private int customerId;
    private String customerName;
    private String city;

    public Customer(int customerId, String customerName, String city) {

        this.customerId = customerId;
        this.customerName = customerName;
        this.city = city;
    }
    public int getCustomerId() {
        return customerId;
    }
    public String getCustomerName() {
        return customerName;
    }
    public String getCity() {
        return city;
    }

    @Override
    public String toString() {

        return "Customer ID: " + customerId + ", Name: " + customerName + ", City: " + city;
    }
}