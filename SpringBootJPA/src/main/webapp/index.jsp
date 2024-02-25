<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@page import="com.example.demo.*" %>
    <%@page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee Registration</title>
</head>
<body>
<form action="insert">
<table>
<tr><td>Employee no</td><td><input type="text" name="empno"><br></td></tr>
<tr><td>Employee name</td><td><input type="text" name="empname"><br></td></tr>
<tr><td>Employee Ph.no</td><td><input type="text" name="phono"><br></td></tr>
<tr><td><input type="submit" value="Insert"><br></td></tr>
</table>
</form>
<br>
<form action="getall">
<input type="submit" value="Display All">
</form>
</body>
</html>
