<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
       <%@ page import = "com.simpli.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
Teachers t=new Teachers();
t.settName(request.getParameter("name"));
t.settSub(request.getParameter("sub"));
t.settPh(Long.parseLong(request.getParameter("phono")));
t.settEmail(request.getParameter("email"));
t.settId(Integer.parseInt(request.getParameter("tid")));

TeachersDAO dao=new TeachersDAO();
int row=dao.update(t);
	if(row>0) {
		response.sendRedirect("Success.jsp");
	}
	else {
		response.sendRedirect("Fail.jsp");
	}
%>
</body>
</html>