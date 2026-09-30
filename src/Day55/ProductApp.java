package Day55;

import java.util.Scanner;

public class ProductApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ProductDAO dao = new ProductDAO();
        while (true) {
            System.out.println( "\n===== PRODUCT INVENTORY MANAGEMENT =====");

            System.out.println("1. Add Product");
            System.out.println("2. View Products");
            System.out.println("3. Search Product");
            System.out.println("4. Update Stock");
            System.out.println("5. Delete Product");
            System.out.println("6. Exit");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            switch (choice) {
            
            case 1:

                System.out.print("Enter Product ID: ");
                int id = sc.nextInt();

                sc.nextLine();

                System.out.print("Enter Product Name: ");
                String name = sc.nextLine();

                System.out.print("Enter Category: ");
                String category = sc.nextLine();

                System.out.print("Enter Price: ");
                double price = sc.nextDouble();
                
                System.out.print("Enter Stock: ");
                int stock = sc.nextInt();
                Product p =new Product(id,name,category,price,stock);
                dao.addProduct(p);
                break;

            case 2:
                dao.viewProducts();
                break;

            case 3:

                System.out.print("Enter Product ID: ");
                int searchId = sc.nextInt();
                Product result =dao.searchProduct(searchId);
                if (result != null) {
                    System.out.println("\nProduct Found:");
                    System.out.println(result);
                } else {
                    System.out.println(
                        "Product not found.");
                }
                break;

            case 4:

                System.out.print("Enter Product ID: ");
                int updateId = sc.nextInt();
                System.out.print("Enter New Stock: ");
                int newStock = sc.nextInt();
                dao.updateStock(updateId,newStock);
                break;

            case 5:

                System.out.print("Enter Product ID: ");
                int deleteId = sc.nextInt();
                dao.deleteProduct(deleteId);
                break;

            case 6:
            	
                System.out.println("Exiting Product Management...");
                sc.close();
                return;
            default:
                System.out.println("Invalid choice.");
            }
        }
    }
}