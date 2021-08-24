<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>Welcome ${param.fnm} ${param.lnm}</h1><br/><br/>

<h2>Your City is ${param.cy }</h2><br/><br/>

<h3>Your hobbies are  </h3><br/><br/>

<h4>${paramValues.hobbies["0"]}</h4>
<h4>${paramValues.hobbies["1"]}</h4>

</body>
</html>