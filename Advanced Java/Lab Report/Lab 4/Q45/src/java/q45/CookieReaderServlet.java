package q45;

import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;

public class CookieReaderServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        // ✅ CREATE COOKIES (NO SPACE!)
        Cookie c1 = new Cookie("name", "Sulav_Adhikari");
        Cookie c2 = new Cookie("roll", "23081003");

        response.addCookie(c1);
        response.addCookie(c2);

        out.println("<html><body>");
        out.println("<h2>Lab 4 - Sulav Adhikari - 23081003</h2>");

        out.println("<h3>Cookie Created ✔</h3>");

        // ✅ READ COOKIES
        Cookie[] cookies = request.getCookies();

        out.println("<h3>Reading Cookies:</h3>");

        if (cookies != null) {
            for (Cookie c : cookies) {
                out.println(c.getName() + " = " + c.getValue() + "<br>");
            }
        } else {
            out.println("No cookies found!");
        }

        out.println("</body></html>");
    }
}