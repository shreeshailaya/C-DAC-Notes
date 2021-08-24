<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
    <%-- access the user attribute from request scope --%>
    <jsp:useBean id="user" class="beans.User" scope="request" />
    
    <h1> WELCOME  <jsp:getProperty name="user" property="fname" />
    <jsp:getProperty name="user" property="lname" />  </h1>
    Email : <jsp:getProperty name="user" property="email" /> <br/>
    Contact : <jsp:getProperty name="user" property="contact" /> <br/>
</body>
</html>