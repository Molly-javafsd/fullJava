<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ page import="com.glvc.bean.*" %>
      <%@ page import="com.glvc.dao.*" %>
        <%@ page import="com.glvc.dbutil.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Adding a product</h1>
<form action="AddController.jsp">
<table>

<tr><td>Product ID:</td><td><input type="number" name="pid"></td></tr>
<tr><td>Product Name:</td><td><input type="text" name="pname"></td></tr>
<tr><td>Product Cost:</td><td><input type="text" name="pcost"></td></tr>
<tr><td><input type="submit" value="Add Product">


</table>
</form>
</body>
</html>