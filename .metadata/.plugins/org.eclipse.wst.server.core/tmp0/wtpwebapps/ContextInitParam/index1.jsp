<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page errorPage="show.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%


	int c= Integer.parseInt(request.getParameter("i1"))/Integer.parseInt(request.getParameter("i2"));
	out.print("Division is: "+c);

%>
</body>
</html>
