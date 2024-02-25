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
StudentDAO dao=new StudentDAO();
Student s=new Student();
s.setName(request.getParameter("name"));
s.setEmail(request.getParameter("email"));
s.setPassword(request.getParameter("password"));
s.setPhno(Integer.parseInt(request.getParameter("phono")));


int row=dao.insert(s);
	if(row>0) {
		response.sendRedirect("Success.jsp");
	}
	else {
		response.sendRedirect("Fail.jsp");
	}
%>
</body>
</html>