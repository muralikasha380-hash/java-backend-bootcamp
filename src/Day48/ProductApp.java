package Day48;

public class ProductApp {

    public static void main(String[] args) {

        System.out.println("===== PRODUCT INVENTORY MANAGEMENT =====");

        ProductRowSetDAO dao =new ProductRowSetDAO();

        dao.manageProducts();
    }
}