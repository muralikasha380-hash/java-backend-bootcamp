package Day53;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class EventRegistrationDAO {

	    // INSERT

public void registerEvent(int regId,String participantName,String eventName,String email,int ticketCount) {

String sql = "INSERT INTO EVENT_REGISTRATION "+ "(REG_ID, PARTICIPANT_NAME, EVENT_NAME, EMAIL, TICKET_COUNT) "+ "VALUES (?, ?, ?, ?, ?)";
	       try (
	    		   Connection con = DBConnection.getConnection();
	    		   PreparedStatement pstmt = con.prepareStatement(sql)) {

	    	   pstmt.setInt(1, regId);
	    	   pstmt.setString(2, participantName);
	    	   pstmt.setString(3, eventName);
	    	   pstmt.setString(4, email);
	    	   pstmt.setInt(5, ticketCount);
	    	   
	    	   int rowCount = pstmt.executeUpdate();

	    	   if (rowCount > 0) {
	    		   System.out.println("Registration Successful!");
	    	   }
	    	   
	       } catch (Exception e) {
	    	   e.printStackTrace();
	       }
	}


	    // SELECT
	public void viewRegistrations() {

	String sql = "SELECT * FROM EVENT_REGISTRATION";

	try (
			Connection con = DBConnection.getConnection();
	        PreparedStatement pstmt = con.prepareStatement(sql);
	        ResultSet rs = pstmt.executeQuery()) {

			System.out.println();
			System.out.println("===== EVENT REGISTRATIONS =====");

			while (rs.next()) {

				System.out.println("Registration ID : " + rs.getInt("REG_ID"));

				System.out.println("Participant Name : " +rs.getString("PARTICIPANT_NAME"));

				System.out.println("Event Name       : " +rs.getString("EVENT_NAME"));

				System.out.println("Email            : " +rs.getString("EMAIL"));

				System.out.println("Ticket Count     : " +rs.getInt("TICKET_COUNT"));

				System.out.println("-------------------------------");
	            }

	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }


	    // UPDATE
	    public void updateTicketCount(int regId,int newTicketCount) {

	        String sql = "UPDATE EVENT_REGISTRATION "+ "SET TICKET_COUNT = ? "+ "WHERE REG_ID = ?";

	        try (Connection con = DBConnection.getConnection();
	             PreparedStatement pstmt = con.prepareStatement(sql)) {

	            pstmt.setInt(1, newTicketCount);
	            pstmt.setInt(2, regId);

	            int rowCount = pstmt.executeUpdate();

	            if (rowCount > 0) {
	                System.out.println("Ticket Count Updated Successfully!");
	            } else {
	                System.out.println("Registration ID not found.");
	            }

	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }


	    // DELETE
	    public void cancelRegistration(int regId) {

	        String sql =
	                "DELETE FROM EVENT_REGISTRATION WHERE REG_ID = ?";

	        try (Connection con = DBConnection.getConnection();
	             PreparedStatement pstmt = con.prepareStatement(sql)) {

	            pstmt.setInt(1, regId);

	            int rowCount = pstmt.executeUpdate();

	            if (rowCount > 0) {
	                System.out.println("Registration Cancelled Successfully!");
	            } else {
	                System.out.println("Registration ID not found.");
	            }

	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }
	}