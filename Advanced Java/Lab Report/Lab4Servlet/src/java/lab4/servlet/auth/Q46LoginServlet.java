package lab4.servlet.auth;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.WebServlet;
import java.io.*;

@WebServlet("/Q46LoginServlet")
public class Q46LoginServlet extends HttpServlet {

    private final String USERNAME = "admin";
    private final String PASSWORD = "admin";

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String action = request.getParameter("action");
        HttpSession session = request.getSession(false);

        if ("logout".equals(action) && session != null) {
            session.invalidate();
            out.println("<h3>You are logged out successfully!</h3>");
            showLoginForm(out);
            return;
        }

        if (session != null && session.getAttribute("username") != null) {
            // User already logged in
            out.println("<h3>Welcome, " + session.getAttribute("username") + "!</h3>");
            out.println("<a href='Q46LoginServlet?action=logout'>Logout</a>");
        } else {
            // Show login form
            showLoginForm(out);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String username = request.getParameter("username");
        String password = request.getParameter("password");

        if (USERNAME.equals(username) && PASSWORD.equals(password)) {
            HttpSession session = request.getSession();
            session.setAttribute("username", username);
            out.println("<h3>Login successful! Welcome, " + username + "</h3>");
            out.println("<a href='Q46LoginServlet'>Go to Home</a>");
        } else {
            out.println("<h3>Invalid username or password!</h3>");
            showLoginForm(out);
        }
    }

    private void showLoginForm(PrintWriter out) {
        out.println("<h2>Login</h2>");
        out.println("<form action='Q46LoginServlet' method='post'>");
        out.println("Username: <input name='username'><br><br>");
        out.println("Password: <input name='password' type='password'><br><br>");
        out.println("<input type='submit' value='Login'>");
        out.println("</form>");
    }
}