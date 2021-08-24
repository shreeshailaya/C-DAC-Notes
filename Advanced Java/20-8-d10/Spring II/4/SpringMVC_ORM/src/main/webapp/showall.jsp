<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Search Contact</h1>
<form method="get" action="search">
        <input type="text" name="keyword" /> &nbsp;
        <input type="submit" value="Search" />
    </form>
	<h2> List of Contacts </h2>
	<table border="1">
		<tr>
			<th> ID </th>
			<th> NAME </th>
			<th> EMAIL </th>
			<th> CONTACTNO </th>
		</tr>
		<c:forEach var="contact" items="${allcontacts }">
			<tr>
				<td> ${contact.cid} </td>
				<td> ${contact.name} </td>
				<td> ${contact.email} </td>
				<td> ${contact.contactno} </td>
				<td> <a href="edit?cid=${contact.cid}">  EDIT </a> </td>
				<td> <a href="delete?cid=${contact.cid}">  DELETE </a> </td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>