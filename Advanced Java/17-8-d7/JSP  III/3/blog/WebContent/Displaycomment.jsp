<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="cmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<ul>
<cmt:forEach var="ct" items="${sessionScope.comments}">
<li>
User name: ${ct.uid}<br/>
Comment:${ct.text}<br/>
</li>
</cmt:forEach>
</ul>
</body>
</html>