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
<%Employee e= (Employee)request.getAttribute("emp");%>
<%="HEY "+e.getUser()+" Welcome!!" %><br>
<form action="getallemp">
<input type="submit" value="Display All">
</form>
</body>
</html>