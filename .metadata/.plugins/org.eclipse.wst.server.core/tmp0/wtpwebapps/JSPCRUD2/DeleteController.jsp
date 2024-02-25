<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ page import="com.glvc.bean.*" %>
      <%@ page import="com.glvc.dao.*" %>
        <%@ page import="com.glvc.dbutil.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
Product p= new Product();
ProductDao dao= new ProductDao();
p.setPid(Integer.parseInt(request.getParameter("pid")));
int row=dao.delete(p);
if(row>0){
	response.sendRedirect("Success.jsp");
}
else{
	response.sendRedirect("Fail.jsp");
}
%>
</body>
</html>