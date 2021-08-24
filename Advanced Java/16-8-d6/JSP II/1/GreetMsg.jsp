<%@page import="java.util.Calendar"%>
<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Greet Message</title>
</head>
<body>
<% 
Date myDate = new Date();
Date dt = new Date();
Calendar c = Calendar.getInstance();
c.setTime(dt);
int hrs = c.get(Calendar.HOUR_OF_DAY);
out.print(hrs);
    String greet=null;

    if (hrs < 12)
        greet = "Good Morning";
    else if (hrs >= 12 && hrs <= 17)
        greet = "Good Afternoon";
    else if (hrs >= 17 && hrs <= 24)
        greet = "Good Evening";
out.print("Hello.."+greet);
   
    		%>        
</body>
</html>