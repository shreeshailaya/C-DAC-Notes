<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="f" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2> Create New Contact</h2>
	<%-- normal HTML form tags will not be used --%>
	<%-- we are using form tags provided in spring framework library --%>
	<f:form action="insert" modelAttribute="con">
		Enter name : <f:input path="name" /> <br/>  <!--  req param - bean property -->
		Enter email : <f:input path="email" /> <br/>
		Enter contact : <f:input path="contactno" /> <br/>
		<input type="submit" value="Insert Contact"/>  <!-- HTML tag -->
	</f:form>
</body>
</html>