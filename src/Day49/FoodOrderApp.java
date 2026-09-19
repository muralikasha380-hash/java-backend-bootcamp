package Day49;

public class FoodOrderApp {

    public static void main(String[] args) {

        System.out.println("===== FOOD DELIVERY ORDER MANAGEMENT =====");

        FoodOrderRowSetDAO dao =new FoodOrderRowSetDAO();

        dao.manageOrders();
    }
}