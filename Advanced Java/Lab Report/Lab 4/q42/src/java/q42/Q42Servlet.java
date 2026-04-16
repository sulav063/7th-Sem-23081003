package q42;

import java.io.*;
import java.util.Date;
import jakarta.servlet.*;
import jakarta.servlet.http.*;

public class Q42Servlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<html><body>");

        out.println("<h2>Lab 4 - Sulav Adhikari - 23081003</h2>");

        // Print message 10 times
        for(int i = 1; i <= 10; i++) {
            out.println(i + ". Java is one of the powerful programming languages!<br>");
        }

        // Date and Time
        out.println("<br><h3>Current Date and Time:</h3>");
        out.println(new Date());

        // Student Info
        out.println("<h3>Student Information:</h3>");
        out.println("Name: Sulav Adhikari<br>");
        out.println("Roll No: 23081003<br>");
        out.println("Section: B<br>");

        out.println("</body></html>");
    }
}