package q45;

import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;

public class SessionServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        // Create session
        HttpSession session = request.getSession();

        session.setAttribute("username", "Sulav");
        session.setAttribute("roll", "23081003");

        out.println("<html><body>");
        out.println("<h2>Session Created ✔</h2>");

        out.println("<h3>Session Data:</h3>");
        out.println("Username: " + session.getAttribute("username") + "<br>");
        out.println("Roll: " + session.getAttribute("roll") + "<br>");

        out.println("</body></html>");
    }
}