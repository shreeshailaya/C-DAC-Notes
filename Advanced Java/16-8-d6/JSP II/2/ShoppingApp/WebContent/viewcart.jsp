<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.*,java.sql.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
  <% 
   RequestDispatcher rd =request.getRequestDispatcher("/header");
   rd.include(request, response);
   List<Integer> products = (List<Integer>)session.getAttribute("cart");
   if(products == null)
   { %>
	   <%= "<h2> No products are selected </h2>" %>
   <%
   }
   else
   {
	   Connection con = (Connection)application.getAttribute("jdbccon");
	   PreparedStatement ps = null;
	   ResultSet rs =null; %>
	   <table border="1">
	   <% 
	   int total = 0;
	   for(int pid : products)
	   {
		   ps = con.prepareStatement("select * from product product where p_id = ?");
		   ps.setInt(1,pid );
		   rs = ps.executeQuery();
		   rs.next();
		   total += Integer.parseInt(rs.getString(4));
		   %>
		   <tr>
		   <td> <%= rs.getString(2) %> </td>
		   <td> <%= rs.getString(3) %> </td>
		   <td> <%= rs.getString(4) %> </td>
		   </tr>
	   <% } %>
	   <tr> 
	      <td colspan="2"> Total price </td>
	      <td> <%= total %></td>
	   </tr>
	   </table>
	   <% 
	   session.setAttribute("totalcost", total);
   } %>
   <br/> 
   <a href="home"> Further Selection? </a> <br/>
   <a href="confirm"> confirm cart? </a> <br/>
</body>
</html>