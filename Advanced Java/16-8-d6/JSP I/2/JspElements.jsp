<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Jsp Elements</title>
</head>
<body>
<!-- Declaration in jsp -->
<%! int count =10; %>
<% out.println("The Number is " +count); %>
<br>
<!-- Scriplet Tag -->
<% int num1=10;
   int num2=40;
   int num3 = num1+num2;
   out.println("Scriplet Number is " +num3);
%>
<br>
<!-- Expression  -->
<% out.println("The expression number is "); %>
<% int num11=10; int num21=10; int num31 = 20; %>
<%= num11*num21+num31 %>
Today's date: <%= (new java.util.Date()).toLocaleString()%>
<br>
<!-- Implicit Objects in jsp -->
<%
         out.println("Your IP address is " + request.getRemoteAddr());
      %>
      
      <%! int day = 3; %> 
       <% if (day == 1 || day == 7) { %>
         <p> Today is weekend</p>
      <% } else { %>
         <p> Today is not weekend</p>
      <% } %>
</body>
</html>