<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
    <jsp:useBean id="userinfo" class="beans.User" scope="session" />
    <h1> Welcome <jsp:getProperty property="fname" name="userinfo"/> 
     <jsp:getProperty property="lname" name="userinfo"/> </h1>
     Email : <jsp:getProperty property="email" name="userinfo"/> 
     <br/>
     Address : <jsp:getProperty property="address" name="userinfo"/> 
</body>
</html>