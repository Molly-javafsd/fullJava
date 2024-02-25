<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="com.glvc.bean.*" %>
      <%@ page import="com.glvc.dao.*" %>
        <%@ page import="com.glvc.dbutil.*" %>
        <%@page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="addproduct.jsp">
<input type="submit" value="Add Product">
</form>

<h1><i>List of Products</i></h1>
<table border="1">
<tr><th>Product ID:</th><th>Product Name:</th><th>Product Cost:</th><th>Edit Action</th><th>Delete Action</th></tr>
<%
ProductDao dao=new ProductDao();
List<Product> list=dao.display();
for(Product p:list){%>
	<tr><td><%=p.getPid() %></td><td><%=p.getPname()%></td><td><%=p.getCost() %></td><td><a href="edit.jsp?pid=<%= p.getPid() %>">Edit with name</a></td><td><a href="delete.jsp?pid=<%= p.getPid() %>">Delete a Product</a></td></tr>


<%}%>



</table>
</body>
</html>