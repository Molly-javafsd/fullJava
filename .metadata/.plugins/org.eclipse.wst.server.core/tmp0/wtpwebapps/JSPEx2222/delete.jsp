<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="DeleteController.jsp" method="post">
<input type="hidden" name="tid" value="<%=request.getParameter("tid") %>"><br>  
<input type="submit" value="Confirm Delete">
</form>
</body>
</html>