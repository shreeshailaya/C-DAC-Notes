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
    <c:forEach var="topic" items="${alltopics}">
    	<a href="getComments?topicid=${topic.tid}"> ${topic.tname} </a> <br/>
    </c:forEach>
</body>
</html>