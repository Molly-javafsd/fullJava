<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="update">
Updated email: <input type="text" name="email">
Updated Phone: <input type="text"  name="phono">
<input type="hidden" name="sid" value=<%=request.getParameter("sid") %>>
<input type="submit" value="Edit Now">
</form>
</body>
</html>