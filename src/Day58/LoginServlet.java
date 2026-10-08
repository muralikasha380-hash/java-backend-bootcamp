package Day58;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/login")

public class LoginServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res)throws ServletException, IOException {
		String username =req.getParameter("username");

		String password =req.getParameter("password");
		UserDAO dao = new UserDAO();
		User user =dao.login(username, password);
		
		if (user != null) {
			HttpSession session =req.getSession();
			session.setAttribute("user", user);
			res.sendRedirect("profile");
		
		} else {
			res.setContentType("text/html");
			res.getWriter().println("<h2>Invalid Username or Password</h2>");
			res.getWriter().println("<a href='login.html'>Try Again</a>");
		}
	}
}
