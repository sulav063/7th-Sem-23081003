package q46;

import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;

public class LogoutServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException {

        HttpSession session = request.getSession(false);

        if(session != null){
            session.invalidate(); // destroy session
        }

        response.sendRedirect("index.html");
    }
}