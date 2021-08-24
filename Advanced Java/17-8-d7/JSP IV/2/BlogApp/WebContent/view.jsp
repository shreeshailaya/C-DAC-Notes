<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<table>
	<tr>
	<td>User Id </td>
	<td>${user.uid }</td>
	</tr>
	<tr>
	<td>First Name</td>
	<td>${user.fname }</td>
	</tr>
	<tr>
	<td>Last Name </td>
	<td>${user.lname }</td>
	</tr>
	<tr>
	<td>Email </td>
	<td>${sessionScope.cuser.email}</td>
	</tr>
	<tr>
	<td>City </td>
	<td>${user.address.city }</td>
	</tr>
	<tr>
	<td>Hobbies </td>
	<td><core:forEach var="hob" items="${hobbies}"> ${hob}<br/></core:forEach></td>
	</tr>
	</table>
	<br/>
	Cookie : ${cookie.namecookie.value}<br/>
</body>
</html>