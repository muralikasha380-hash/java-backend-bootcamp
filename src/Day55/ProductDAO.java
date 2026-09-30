package Day55;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ProductDAO {

    // 1. ADD PRODUCT
    public void addProduct(Product p) {

        String sql = "INSERT INTO product "+ "(product_id, product_name, category, price, stock) "+ "VALUES (?, ?, ?, ?, ?)";

        try (
            Connection con = DBConnection.getConnection();
            PreparedStatement ps = con.prepareStatement(sql)
        ) {

            ps.setInt(1, p.getProductId());
            ps.setString(2, p.getProductName());
            ps.setString(3, p.getCategory());
            ps.setDouble(4, p.getPrice());
            ps.setInt(5, p.getStock());

            int count = ps.executeUpdate();

            System.out.println(
                count + " product inserted successfully.");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    // 2. VIEW ALL PRODUCTS
    public void viewProducts() {

        String sql = "SELECT * FROM product ORDER BY product_id";

        try (
            Connection con = DBConnection.getConnection();
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery()
        ) {

            System.out.println("\n===== PRODUCT DETAILS =====");

            while (rs.next()) {

                Product p = new Product();

                p.setProductId(
                    rs.getInt("product_id"));

                p.setProductName(
                    rs.getString("product_name"));

                p.setCategory(
                    rs.getString("category"));

                p.setPrice(
                    rs.getDouble("price"));

                p.setStock(
                    rs.getInt("stock"));

                System.out.println(p);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    // 3. SEARCH PRODUCT
    public Product searchProduct(int productId) {

        String sql = "SELECT * FROM product "+ "WHERE product_id = ?";

        try (
            Connection con = DBConnection.getConnection();
            PreparedStatement ps = con.prepareStatement(sql)
        ) {

            ps.setInt(1, productId);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {

                Product p = new Product();

                p.setProductId(
                    rs.getInt("product_id"));

                p.setProductName(
                    rs.getString("product_name"));

                p.setCategory(
                    rs.getString("category"));

                p.setPrice(
                    rs.getDouble("price"));

                p.setStock(
                    rs.getInt("stock"));

                return p;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }


    // 4. UPDATE STOCK
    public void updateStock(int productId, int stock) {

        String sql = "UPDATE product SET stock = ? "+ "WHERE product_id = ?";

        try (
            Connection con = DBConnection.getConnection();
            PreparedStatement ps = con.prepareStatement(sql)
        ) {

            ps.setInt(1, stock);
            ps.setInt(2, productId);

            int count = ps.executeUpdate();

            if (count > 0) {
                System.out.println(
                    "Stock updated successfully.");
            } else {
                System.out.println(
                    "Product not found.");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    // 5. DELETE PRODUCT
    public void deleteProduct(int productId) {

        String sql = "DELETE FROM product " + "WHERE product_id = ?";

        try (
            Connection con = DBConnection.getConnection();
            PreparedStatement ps = con.prepareStatement(sql)
        ) {

            ps.setInt(1, productId);

            int count = ps.executeUpdate();

            if (count > 0) {
                System.out.println(
                    "Product deleted successfully.");
            } else {
                System.out.println(
                    "Product not found.");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}