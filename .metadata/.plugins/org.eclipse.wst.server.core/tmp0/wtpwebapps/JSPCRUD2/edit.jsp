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
<h1><i>Editing the product name</i></h1>
<form action="EditController.jsp">
<input type="hidden" name="pid" value=<%=request.getParameter("pid") %>>
Name to be edited <input type="text" name="pname">
<input type="submit" value="Edit Now">

</form>

</body>
</html>