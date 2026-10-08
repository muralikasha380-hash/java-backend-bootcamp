package Day58;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/profile")
public class ProfileServlet extends HttpServlet {

    @Override
    protected void doGet( HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException {

        HttpSession session =req.getSession(false);
        res.setContentType("text/html");
        PrintWriter out =res.getWriter();

        if (session == null ||
            session.getAttribute("user") == null) {
            out.println("<h2>Please Login First</h2>");
            out.println("<a href='login.html'>Login</a>");
            return;
        }

        User user =(User) session.getAttribute("user");
        out.println("<html>");
        out.println("<body>");
        out.println("<center>");
        
        out.println("<h1>===== USER PROFILE =====</h1>");
        
        out.println("<h3>Welcome, "+ user.getFullName()+ "</h3>");
        out.println("<p>User ID: "+ user.getUserId()+ "</p>");
        out.println("<p>Username: "+ user.getUsername()+ "</p>");
        out.println("<br>");
        out.println("<a href='logout'>Logout</a>");
        out.println("</center>");
        out.println("</body>");
        out.println("</html>");
    }
}