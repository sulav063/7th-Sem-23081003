package lab4.servlet;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.*;
import java.util.Date;

public class Q42DisplayServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<html><body>");

        // Display message 10 times
        out.println("<h2>Message Display:</h2>");
        for (int i = 1; i <= 10; i++) {
            out.println("<p>" + i + ". Java is one of the powerful programming languages!</p>");
        }

        // Current date and time
        out.println("<h3>Current Date and Time:</h3>");
        out.println("<p>" + new Date() + "</p>");

        // Student details
        out.println("<h3>Student Details:</h3>");
        out.println("<p>Name: Sulav Adhikari</p>");
        out.println("<p>Roll No: 23081003</p>");
        out.println("<p>Lab No: 4</p>");
        out.println("</body></html>");
    }
}