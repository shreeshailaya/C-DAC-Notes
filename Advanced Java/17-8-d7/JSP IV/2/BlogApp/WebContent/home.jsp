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
<h2>Want to see comments?</h2>
<br/>
<c:forEach var="topic" items="${sessionScope.topiclist}">
<a href="selectedtopic?topicid=${topic.tid}">${topic.name}</a>
</c:forEach>
<br/>
<hr><br/>
<h2>Want to Add Comment?</h2>
<form action="/JSPUsingMVC/insertComments" method="post">
Topic Name : <select name="nm" id="nm">
			<c:forEach var="topic" items="${sessionScope.topiclist}">
			<option value="${topic.tid }">${topic.name}</option>
			</c:forEach>
			 </select><br/>
User ID : <select name="uid" id="uid">
			<c:forEach var="topic" items="${sessionScope.topiclist}">
			<option value="${topic.uid }">${topic.uid}</option>
			</c:forEach>
			 </select><br/>
Comment : <input type="text" name="comm" /><br/>
		  <input type="submit" value="Submit" /><br>
</form>
</body>
</html>