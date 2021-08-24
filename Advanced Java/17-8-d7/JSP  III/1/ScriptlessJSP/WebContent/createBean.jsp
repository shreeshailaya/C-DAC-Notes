<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
    <%-- Empty object(created using default constructor) is set as request level attribute --%>
    <jsp:useBean id="user" class="beans.User" scope="request"/>
    
    <%-- populate the bean properties using setter methods 
     <jsp:setProperty name="user" property="uid"  />
     <jsp:setProperty name="user" property="fname" param="fname" />
     <jsp:setProperty name="user" property="lname" param="lname" />
     <jsp:setProperty name="user" property="contact"  />
     <jsp:setProperty name="user" property="email"  />
     --%>
     <jsp:setProperty name="user" property="*"  />
          
     <jsp:forward page="/accessBean.jsp" />
     
     
</body>
</html>