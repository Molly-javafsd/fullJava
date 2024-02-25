<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import = "com.jspex.*" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
Student s=new Student();

s.setName(request.getParameter("name"));

StudentDAO dao=new StudentDAO();
int row=dao.delete(s);
	if(row>0) {
	response.sendRedirect("Success.jsp");
	}
	else {
		response.sendRedirect("Fail.jsp");
	}
%>
</body>
</html>