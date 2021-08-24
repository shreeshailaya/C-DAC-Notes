<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

    <%
        Cookie [] allc = request.getCookies();
    	if(allc != null)
    	{
    		for(Cookie c : allc)
    		{
    			if(c.getName().equals("loginerror"))
    				out.println("<p>"+c.getValue()+"</p>");
    		}
    	}
    %>
	<form action="http://localhost:8080/ShoppingApp/login" method="post">
		Enter uid : <input type="text" name="uid" /> <br/>
		Enter pwd : <input type="password" name="pwd" /> <br/>
		<input type="submit" value="LOGIN" />
	</form>
	<br/>
	<a href="http://localhost:8080/ShoppingApp/register.html"> New User? Register here </a>
	<br/>
	
</body>
</html>