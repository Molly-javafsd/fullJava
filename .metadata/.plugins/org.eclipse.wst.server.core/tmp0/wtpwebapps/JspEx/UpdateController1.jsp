<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="UpdateController.jsp" method="post">
Updated Ph.no: <input type="text" name="phono"><br>
Update Email: <input type="email" name="email"><br>
<input type="hidden" name="name" value=<%=request.getParameter("name") %>><br>  
<input type="submit" value="Update">

</form>
</body>
</html>