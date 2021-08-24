<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="user" class="beans.User" scope="session"/>
<h3> User ID : <jsp:getProperty property="uid" name="user"/></h3>
<h3>FName : <jsp:getProperty property="fname" name="user"/></h3>
<h3>LName : <jsp:getProperty property="lname" name="user"/></h3>

</body>
</html>