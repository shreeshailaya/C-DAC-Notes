<%@page import="java.util.List"%>
<%@page import="com.java.service.LoginService"%>
<%@page import="java.util.Date"%>
<%@page import="com.java.model.User"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	 <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	 <link rel="stylesheet" type="text/css" href="css/style.css"/>
	 <title>Result Page</title>	
</head>
<body>
<center>
	 <div id="container">
		 <h1>EBOOK</h1>
			 <b>Book Information</b><br/>
			 <%=new Date()%></br>
			 <%
				 User user = (User) session.getAttribute("user");
			 %>		
			 <b>Welcome <%= user.getUserId()%></b>		
			 <br/>
			 <a href="logout.jsp">Logout</a>
		 </p>

		 <table border="1">
			 <thead>
				 <tr>
					 <th>ISBN Number</th>
					 <th>Author</th>
					 <th>Publisher</th>
					
					 <th>Price</th>					
				 </tr>
			 </thead>
			 <tbody>
				 <%
					 LoginService loginService = new LoginService();
					 List<User> list = loginService.getListOfUsers();
					 for (User u : list) {
				 %>
				 <tr>
					 <td><%=u.getIsbn()%></td>
					 <td><%=u.getName()%></td>
					 <td><%=u.getPublisher()%></td>
						 <td><%=u.getPrice()%></td>
				 </tr>
				 <%}%>
			 <tbody>
		 </table>		
		 <br/>
	 </div>
	</center>	
</body>
</html>
