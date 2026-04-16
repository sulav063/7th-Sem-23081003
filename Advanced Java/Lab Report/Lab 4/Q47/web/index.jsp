<%@ page import="java.util.*" %>   <!-- JSP Directive -->

<%! 
    // JSP Declaration
    String name = "Sulav Adhikari";
    int roll = 23081003;
%>

<html>
<head>
    <title>Q47 JSP Demo</title>
</head>
<body>

<h2>Lab 4 - Sulav Adhikari - 23081003</h2>

<h3>1. JSP Scriptlet</h3>
<%
    out.println("This is Scriptlet Example");
%>

<h3>2. JSP Expression</h3>
Current Date & Time: <%= new Date() %>

<br><br>
Name: <%= name %>  
<br>
Roll No: <%= roll %>

<h3>3. JSP Declaration Used Above</h3>

<h3>4. JSP Comment</h3>
<%-- This is a JSP comment (not visible in browser) --%>

</body>
</html>