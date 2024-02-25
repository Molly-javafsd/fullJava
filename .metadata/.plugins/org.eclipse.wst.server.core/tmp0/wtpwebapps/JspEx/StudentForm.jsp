<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Student Registration</h1>
<form action="InsertController.jsp">
<h3>For Data Insertion:</h3>
Name: <input type="text" name="name"><br>
Email: <input type="email" name="email"><br>
Password: <input type="password" name="password"><br>
Ph.no: <input type="text" name="phono"><br><br>
<input type="submit" value="Submit">
</form>
<br><br>

<form action="UpdateController.jsp">
<h3>For Updation:</h3>
Updated Ph.no: <input type="text" name="phono"><br>
Update Email: <input type="email" name="email"><br>
OF Student Name: <input type="text" name="name"><br><br>
<input type="submit" value="Update">
</form>
<br><br> 

<form action="DeleteController.jsp">
<h3>For Deletion:</h3>
Enter Name of Student whose data needs to get deleted:<br> <input type="text" name="name"><br><br>
<input type="submit" value="Delete">
</form>

<br><br>
<form action="RetriveController.jsp">
<h3>Dislpay all the Contents:</h3>
<input type="submit" value="Retrive Data">

</form>

</body>
</html>