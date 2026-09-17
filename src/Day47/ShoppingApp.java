package Day47;

public class ShoppingApp {

    public static void main(String[] args) {

        System.out.println("===== ONLINE SHOPPING ORDER MANAGEMENT =====");
        ShoppingJoinRowSetDAO dao = new ShoppingJoinRowSetDAO();
        dao.showCustomerOrders();
    }
}