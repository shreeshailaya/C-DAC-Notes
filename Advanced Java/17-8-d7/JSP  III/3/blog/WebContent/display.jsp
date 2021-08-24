<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
  <jsp:useBean id="user" class="model.User" scope="session"></jsp:useBean>
 
  <h1>Welcome<jsp:getProperty property="fname" name="user"/></h1>
</body>
</html>