<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%--to print something on page --%>
<c:out value="${101}"></c:out>
<c:out value="${'Hi how are you'}"></c:out>

<br><br>

<%--declare a value --%>
<c:set var="a" value="${100 }"></c:set>
<c:out value="${a}"></c:out>

<br><br>
<c:set var="a" value="${100}"></c:set>
<p>before value is </p>
<c:out value="${a+10}"></c:out>
<c:remove var="a"/>
<p>after value is </p>
<c:out value="${a+10}"></c:out>

<br>
<br>
<%--if ->iff the condition is true --%>
<c:set var="a" value="${100}"></c:set>
<c:set var="b" value="${10}"></c:set>
<c:if test="${a>b}">
<p> value of a is > </p>
</c:if>

<%--choose when otherwise --%>
<c:set var="a" value="${-2}"></c:set>
<c:choose>
<c:when test="${a>=100}">
the value of a is greater
</c:when>
<c:when test="${a>=0 &&a<100}">
the value is between 0 and 99
</c:when>
<c:otherwise>
check the input value
</c:otherwise>
</c:choose>



<br>
<br>
<%-- catch --%>
<c:catch var="catchexc">

<%--<c:set var="a" value="50"></c:set>
<c:set var="b" value="0"></c:set>
<c:out value="${a/b}"></c:out>--%>

<%int a=50/0; %>
</c:catch>
<c:out value="${catchexc}"></c:out>



<%--for each example --%>
<c:set var="a" value="0"/>
<c:forEach var="i" begin="1" end="7">
<c:out value="${a+i}"></c:out>
<br>
</c:forEach>

<%
String s[]=new String[2];
s[0]="neha";
s[1]="nisha";
%>

<c:forEach items="<%=s%>" var="user">
<c:out value="${user}"></c:out>
</c:forEach>

<%--forTokens --%>
<c:set var="s" value="${'hi-how-are-u'}"></c:set>
<c:forTokens var="name" items="${s}" delims="-">
<c:out value="${name}"></c:out>
</c:forTokens>
<br>



<%--url management-->url and param--%>
 
<c:set var="id" value="${101}"></c:set>
<c:set var="name" value="${'kk'}"></c:set>
<c:url var="url" value="index.jsp">
<c:param name="id" value="${id}"></c:param>
<c:param name="name" value="${name}"></c:param>
</c:url>
${url}


<%--redirect--%>
<c:set var="a" value="${100}"></c:set>
<c:set var="b" value="${10}"></c:set>
<c:if test="${a>b}">
<c:redirect url="https://www.google.com/"></c:redirect>
</c:if>

</body>
</html>