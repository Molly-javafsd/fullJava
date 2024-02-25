<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="com.example.*" %>
    <%@page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%List<Student> s=(List<Student>)request.getAttribute("list"); %>
<table border='1'>
<tr><th>SID</th><th>Email</th><th>Phone</th><th>Edit</th><th>Delete</th></tr>

<%for(Student ss:s){ %>


<tr><td><%=ss.getSid() %></td><td><%=ss.getEmail() %></td><td><%=ss.getPhono() %></td><td><a href="edit.jsp?sid=<%= ss.getSid() %>">Edit</a></td><td><a href="delete.jsp?sid=<%= ss.getSid() %>">Delete</a></td></tr>


<%} %>
</table>

</body>
</html>