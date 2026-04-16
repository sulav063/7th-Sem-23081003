<%@ page import="jakarta.servlet.http.*,jakarta.servlet.*" %>

<%
    HttpSession session1 = request.getSession(false);

    if(session1 == null || session1.getAttribute("user") == null){
        response.sendRedirect("index.html");
    }
%>

<h2>Lab 4 - Sulav Adhikari - 23081003</h2>

<h3>Welcome to Dashboard</h3>

User: <%= session1.getAttribute("user") %>

<br><br>
<a href="logout">Logout</a>