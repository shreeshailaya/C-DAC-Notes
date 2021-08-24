<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
      <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Blogging Application</title>
</head>
<body>
<h2>All Comments</h2>
<table border=1 style="border-collapse: collapse">
<tr><th>Comment</th><th>User</th></tr>
<c:forEach var="com" items="${sessionScope.comments}">
<tr>
<td>${com.text }</td>
<td>${com.uid }</td>
</tr>
</c:forEach>
</table>
</body>
</html>