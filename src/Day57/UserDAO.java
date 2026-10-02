package Day57;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class UserDAO {
	
	public boolean registerUser(User user) {
		
		String sql ="INSERT INTO app_user " +"(user_id, username, password, full_name) " +"VALUES (?, ?, ?, ?)";
		
        try (
            Connection con = DBConnection.getConnection();
            PreparedStatement ps = con.prepareStatement(sql)
        ) {
            ps.setInt(1, user.getUserId());
            ps.setString(2, user.getUsername());
            ps.setString(3, user.getPassword());
            ps.setString(4, user.getFullName());
            int count = ps.executeUpdate();
            return count > 0;
            
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}