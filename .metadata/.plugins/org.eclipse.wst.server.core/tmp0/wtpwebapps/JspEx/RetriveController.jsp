<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
      <%@ page import = "com.jspex.*" %>
       <%@ page import = "java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% 
StudentDAO dao=new StudentDAO();


List<Student> list=dao.getall();%>
	
<h1>Student Table</h1>
<table border='1'><thead><tr><th>Name</th><th>Email</th><th>PassWord</th><th>Phone</th></thead>
	
<%for(Student s:list) { %>
	
<tbody><tr><td><%= s.getName() %></td><td><%= s.getEmail() %></td><td><%=s.getPassword() %></td><td><%=s.getPhno() %></td>

	
<%} %>
	
</table>
</body>
</html>