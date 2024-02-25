<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%!   					//for initialisation use <%!
int count=0;
int GetUsers(){
	
	return ++count;
}
%>

<% out.print("Count is "+GetUsers()); %>
<%="the count is: "+GetUsers() %>
</body>
</html>