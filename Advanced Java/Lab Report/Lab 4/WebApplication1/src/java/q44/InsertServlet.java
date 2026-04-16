package q44;

import java.io.*;
import java.sql.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;

public class InsertServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<html><body>");
        out.println("<h2>Lab 4 - Sulav Adhikari - 23081003</h2>");

        String name = request.getParameter("name");

        try {
            // ⭐ FORCE LOAD DRIVER (VERY IMPORTANT)
            Class.forName("com.mysql.cj.jdbc.Driver");

            // ⭐ DB CONNECTION
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/lab",
                "root",
                "Mp40awm@#"
            );

            PreparedStatement ps = con.prepareStatement(
                "INSERT INTO student(name) VALUES(?)"
            );

            ps.setString(1, name);

            int i = ps.executeUpdate();

            if(i > 0){
                out.println("<h3 style='color:green'>Inserted Successfully ✔</h3>");
            } else {
                out.println("<h3 style='color:red'>Insert Failed ❌</h3>");
            }

            con.close();

        } catch(Exception e){
            out.println("<h3 style='color:red'>Error: " + e.getMessage() + "</h3>");
        }

        out.println("<br><a href='index.html'>Go Back</a>");
        out.println("</body></html>");
    }
}