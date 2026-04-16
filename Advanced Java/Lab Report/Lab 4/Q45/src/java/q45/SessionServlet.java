package q45;

import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;

public class SessionServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        HttpSession session = request.getSession();

        session.setAttribute("user", "Sulav Adhikari");
        session.setAttribute("roll", "23081003");

        out.println("<html><body>");
        out.println("<h2>Lab 4 - Sulav Adhikari - 23081003</h2>");

        out.println("<h3>Session Created ✔</h3>");
        out.println("User: " + session.getAttribute("user") + "<br>");
        out.println("Roll: " + session.getAttribute("roll"));

        out.println("</body></html>");
    }
}