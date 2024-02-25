<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="com.example.demo.*"  %>
        <%@page import="java.util.*"  %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table border='1'>
<%List<Employee> list=(List<Employee>)request.getAttribute("list"); 
for(Employee ee:list){
%>

<tr><th>Username</th><th>Password</th><th>Email</th><th>Delete</th></tr>
<tr><td><%=ee.getUser() %></td><td><%=ee.getPassword() %></td><td><%=ee.getEmail() %></td>
<td><form action="delete">
<input type="hidden" name="user" value=<%=ee.getUser() %>>
<input type="submit" value="Delete">
</form></td></tr>

<%} %>
</table>
</body>
</html>