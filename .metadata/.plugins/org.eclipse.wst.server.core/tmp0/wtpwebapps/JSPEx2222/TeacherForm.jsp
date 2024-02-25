<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ page import = "com.simpli.*" %>
       <%@ page import = "java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Teacher Registration</h1>
<form action="insert.jsp" >
<input type="submit" value="Add Data">
</form>
<br><br>


<br><br>
<%
TeachersDAO dao= new TeachersDAO();
List<Teachers> list=dao.getAllTe(); 
%>

<h1>Displaying data</h1>
<table border='1'><thead><tr><th>Id</th><th>Subject Taught</th><th>Name</th><th>Phone</th><th>Email</th><th>Edit Data</th><th>Delete Data</th></thead>

<% for(Teachers t:list){ %>
	
<tbody><tr><td><%= t.gettId() %></td><td><%= t.gettSub()%></td><td><%= t.gettName() %></td><td><%=t.gettPh() %></td><td><%= t.gettEmail() %></td>
	<td><form action="edit.jsp">
	<input type="hidden" name="tid" value=<%=t.gettId() %>>
	<input type="submit" value="Edit Data">
	</form>
	</td>
	<td><form action="delete.jsp">
	<input type="hidden" name="tid" value=<%=t.gettId() %>>
	<input type="submit" value="Delete">
	</form>
	</td>
	
	
<%} %>
</tr>
</table>
</body>
</html>