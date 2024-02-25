<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="InsertController.jsp" >
<table>
<tr><td>Teacher's ID: </td><td><input type="number" name="tid"></td></tr>
<tr><td>Subject taught: </td><td><input type="text" name="tsub"></td></tr>
<tr><td>Teacher's name: </td><td><input type="text" name="tname"></td></tr>
<tr><td>Teacher's phone: </td><td><input type="number" name="tphono"></td></tr>
<tr><td>Teacher's Email: </td><td><input type="email" name="temail"></td></tr>
<tr><td><input type="submit" name="Confirm Add"></td></tr>


</table>
</form>
</body>
</html>