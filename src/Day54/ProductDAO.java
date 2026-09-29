package Day54;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ProductDAO {

    public void addProduct(Product p) {

        String sql ="INSERT INTO product " +"(product_id, product_name, category, price, stock) " +"VALUES (?, ?, ?, ?, ?)";

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
            System.out.println(count + " product inserted successfully.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void viewProducts() {
        String sql = "SELECT * FROM product ORDER BY product_id";
        try (
            Connection con = DBConnection.getConnection();
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery()
        ) {
            System.out.println("\n===== PRODUCT DETAILS =====");
            while (rs.next()) {
                System.out.println(rs.getInt("product_id") + " " +rs.getString("product_name") + " " +rs.getString("category") + " " +rs.getDouble("price") + " " +rs.getInt("stock"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void updateStock(int productId, int stock) {
        String sql ="UPDATE product SET stock = ? " +"WHERE product_id = ?";
        try (
            Connection con = DBConnection.getConnection();
            PreparedStatement ps = con.prepareStatement(sql)
        ) {
            ps.setInt(1, stock);
            ps.setInt(2, productId);
            int count = ps.executeUpdate();
            System.out.println(count + " product stock updated.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void deleteProduct(int productId) {
        String sql ="DELETE FROM product WHERE product_id = ?";
        try (
            Connection con = DBConnection.getConnection();
            PreparedStatement ps = con.prepareStatement(sql)
        ) {
            ps.setInt(1, productId);
            int count = ps.executeUpdate();
            System.out.println(count + " product deleted.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}