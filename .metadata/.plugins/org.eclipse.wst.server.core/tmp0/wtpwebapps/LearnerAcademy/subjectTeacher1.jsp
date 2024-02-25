<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ page import="com.example.pojo.*" %>
      <%@ page import="com.example.dao.*" %>
    <%@ page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
int cid=Integer.parseInt(request.getParameter("cid"));
Teacher t=new Teacher();
String ss=request.getParameter("teacher");
t.setT_FirstName(ss);

Subject s=new Subject();
String sq=request.getParameter("subject");
s.setSubject_Name(sq);

Classes c=new Classes();
ClassDAO dao=new ClassDAO();
c.setClass_ID(cid);
c.setSubject(s);
c.setTeacher(t);
dao.insert(c);


%>
<!--
<h1>Subject And Teacher List</h1>
<table border='1'>
<tr><th>Class_ID</th><th>Subject_Name</th><th>Teacher_Name</th><th>Delete</th></tr>
<%
ClassDAO dao3=new ClassDAO();
List<Classes> list3= dao3.display();
for(Classes cl:list3){
%>
<tr><td><%=cid%></td><td><%=cl.getSubject().getSubject_Name()%></td><td><%=cl.getTeacher().getT_FirstName()%></td><td><a href="deletesubteach.jsp?cid=<%=cl.getClass_ID()%>">Delete</a></td></tr>
<% } %>
</table><br><br>
  -->

</body>
</html>