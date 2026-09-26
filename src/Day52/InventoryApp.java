package Day52;

public class InventoryApp {

    public static void main(String[] args) {

        System.out.println("===== STORE INVENTORY BATCH PROCESSING =====");
        InventoryDAO dao = new InventoryDAO();
        dao.insertProducts();
    }
}