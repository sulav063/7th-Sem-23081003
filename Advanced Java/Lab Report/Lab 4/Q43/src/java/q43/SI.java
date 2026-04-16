package q43;

import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;

public class SI extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        double p = Double.parseDouble(request.getParameter("p"));
        double t = Double.parseDouble(request.getParameter("t"));
        double r = Double.parseDouble(request.getParameter("r"));

        double si = (p * t * r) / 100;

        out.println("<h2>Lab 4 - Sulav Adhikari - 23081003</h2>");
        out.println("<h3>Simple Interest = " + si + "</h3>");
    }
}