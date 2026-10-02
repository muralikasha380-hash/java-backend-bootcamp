package Day57;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/register")
public class Registerservlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException {

        int userId =Integer.parseInt(req.getParameter("userId"));
        String username =req.getParameter("username");
        String password =req.getParameter("password");
        String fullName =req.getParameter("fullName");
        User user = new User(userId, username, password, fullName);
        UserDAO dao = new UserDAO();
        boolean result =dao.registerUser(user);
        res.setContentType("text/html");
        PrintWriter out =res.getWriter();

        if (result) {
            out.println("<h2>Registration Successful!</h2>");
            out.println("<p>Welcome, " + fullName + "</p>");
            out.println("<a href='registration.html'>Register Another User</a>");
        
        } else {
            out.println("<h2>Registration Failed</h2>");
            out.println("<a href='registration.html'>Try Again</a>");
        }
    }
}