package lab4.servlet;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.*;

public class Q43InterestServlet extends HttpServlet {

    // Handles GET request (shows a message)
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<html><body>");
        out.println("<h3>Please use the form to calculate Simple Interest.</h3>");
        out.println("<a href='index.html'>Go to Form</a>");
        out.println("</body></html>");
    }

    // Handles POST request (form submission)
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        try {
            double principal = Double.parseDouble(request.getParameter("principal"));
            double time = Double.parseDouble(request.getParameter("time"));
            double rate = Double.parseDouble(request.getParameter("rate"));

            double si = (principal * time * rate) / 100;

            out.println("<html><body>");
            out.println("<h2>Simple Interest Result</h2>");
            out.println("<p>Principal: " + principal + "</p>");
            out.println("<p>Time: " + time + "</p>");
            out.println("<p>Rate: " + rate + "</p>");
            out.println("<h3>Simple Interest = " + si + "</h3>");
            out.println("<br><a href='index.html'>Back</a>");
            out.println("</body></html>");

        } catch (Exception e) {
            out.println("<html><body>");
            out.println("<h3>Error: Invalid Input</h3>");
            out.println("<a href='index.html'>Try Again</a>");
            out.println("</body></html>");
        }
    }
}

/*write the index.html too*/