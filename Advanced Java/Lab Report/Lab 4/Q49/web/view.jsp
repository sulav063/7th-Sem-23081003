<%@ page import="java.sql.*" %>

<h2>Lab 4 - Sulav Adhikari - 23081003</h2>

<h3>Student List</h3>

<table border="1">
<tr>
    <th>ID</th>
    <th>Name</th>
</tr>

<%
try {
    Class.forName("com.mysql.cj.jdbc.Driver");

    Connection con = DriverManager.getConnection(
        "jdbc:mysql://localhost:3306/lab",
        "root",
        "Mp40awm@#"
    );

    Statement st = con.createStatement();
    ResultSet rs = st.executeQuery("SELECT * FROM student");

    while(rs.next()){
%>
<tr>
    <td><%= rs.getInt("id") %></td>
    <td><%= rs.getString("name") %></td>
</tr>
<%
    }

    con.close();

} catch(Exception e){
%>
<tr>
    <td colspan="2">Error: <%= e.getMessage() %></td>
</tr>
<%
}
%>

</table>

<br><a href="index.jsp">Back</a>