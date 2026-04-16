<%@ page import="java.util.*" %>

<html>
<head>
    <title>Result</title>
</head>
<body>

<h2>Lab 4 - Sulav Adhikari - 23081003</h2>

<h3>Form Data:</h3>

Name: <%= request.getParameter("name") %><br>
Roll No: <%= request.getParameter("roll") %><br>

<hr>

<h3>Implicit Objects Demo:</h3>

<!-- request object -->
Request Method: <%= request.getMethod() %><br>

<!-- session object -->
Session ID: <%= session.getId() %><br>

<!-- application object -->
Server Info: <%= application.getServerInfo() %><br>

<!-- out object -->
<%
    out.println("This is printed using out implicit object");
%>

</body>
</html>