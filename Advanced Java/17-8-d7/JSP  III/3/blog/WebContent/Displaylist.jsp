<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="tp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<tp:forEach var="topic" items="${sessionScope.topics}">
<a href="comments?tid=${topic.topicid}">${topic.name}</a><br/><br/>
</tp:forEach>
</body>
</html>