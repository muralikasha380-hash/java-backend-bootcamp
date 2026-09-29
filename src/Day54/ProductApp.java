package Day54;

public class ProductApp {

    public static void main(String[] args) {

        System.out.println("===== PRODUCT INVENTORY MANAGEMENT =====");
        ProductDAO dao = new ProductDAO();
        dao.viewProducts();
        Product p = new Product(105,"Monitor","Electronics",12000,12);
        dao.addProduct(p);
        dao.updateStock(105, 20);
        dao.viewProducts();
        // dao.deleteProduct(105);
    }
}