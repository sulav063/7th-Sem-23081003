package q46;

import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;

public class LoginServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws IOException {

        String user = request.getParameter("user");
        String pass = request.getParameter("pass");

        // simple validation
        if(user.equals("admin") && pass.equals("123")){

            HttpSession session = request.getSession();
            session.setAttribute("user", user);

            response.sendRedirect("home.jsp");

        } else {
            PrintWriter out = response.getWriter();
            response.setContentType("text/html");

            out.println("<h2>Lab 4 - Sulav Adhikari - 23081003</h2>");
            out.println("<h3 style='color:red'>Invalid Login ❌</h3>");
            out.println("<a href='index.html'>Try Again</a>");
        }
    }
}