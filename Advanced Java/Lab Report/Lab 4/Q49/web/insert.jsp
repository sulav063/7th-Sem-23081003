 <%@ page import="java.sql.*" %>

<%
String name = request.getParameter("name");

try {
    Class.forName("com.mysql.cj.jdbc.Driver");

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

%>

<h2>Lab 4 - Sulav Adhikari - 23081003</h2>

<%
    if(i > 0){
%>
        <h3 style="color:green">Inserted Successfully ?</h3>
<%
    } else {
%>
        <h3 style="color:red">Insert Failed ?</h3>
<%
    }

    con.close();

} catch(Exception e){
%>
    <h3 style="color:red">Error: <%= e.getMessage() %></h3>
<%
}
%>

<br><a href="index.jsp">Go Back</a>