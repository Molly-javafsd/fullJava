<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="UpdateController.jsp" >
Updated name: <input type="text" name="name"><br>
Updated subject name: <input type="text" name="sub"><br>
Updated phone: <input type="number" name="phono"><br>
Updated Email: <input type="email" name="email"><br>
<input type="hidden" name="tid" value=<%=request.getParameter("tid") %>><br>  
<input type="submit" value="Update Now">

</form>
</body>
</html>