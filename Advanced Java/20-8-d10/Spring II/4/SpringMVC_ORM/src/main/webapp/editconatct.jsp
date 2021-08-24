<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="f" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
  <h2> Edit Contact</h2>
  <f:form action="update" modelAttribute="contacttobeedited">
        ID : <f:input path="cid" disabled="true" /> <br/>
  	    Update name : <f:input path="name" /> <br/>  <!--  req param - bean property -->
		Update email : <f:input path="email" /> <br/>
		Update contact : <f:input path="contactno" /> <br/>
		<input type="submit" value="Update Contact"/>  <!-- HTML tag -->
  </f:form>
</body>
</html>