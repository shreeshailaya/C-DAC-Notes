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
<jsp:setProperty property="uid" name="user" param="uid"/>
<jsp:setProperty property="pwd" name="user" param="pwd"/>
<jsp:setProperty property="fname" name="user" param="fname"/>
<jsp:setProperty property="lname" name="user" param="lname"/>
<jsp:setProperty property="email" name="user" param="email"/>
<jsp:setProperty property="contact" name="user" param="contact"/>
<jsp:forward page="displayBean.jsp"/>
</body>
</html>