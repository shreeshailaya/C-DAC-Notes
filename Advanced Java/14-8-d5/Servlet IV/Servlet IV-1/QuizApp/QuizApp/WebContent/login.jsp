<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
   ${cookie.loginerror.value }
   <%
   	   Cookie [] ck=request.getCookies();
   	   if(ck != null)
   	   {
   		   for(Cookie c: ck)
   		   {
   			   if(c.getName().equals("loginerror"))
   				   out.println(c.getValue());
   		   }
   	   }
   %>

	<form action="login" method="post">
		UID : <input type="text" name="uid" /> <br/>
		Pwd : <input type="password" name="pwd" />  <br/>
		<input type="submit" value="LOGIN" />
	</form>
</body>
</html>
