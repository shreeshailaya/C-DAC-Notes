<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*,entities.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
   <h2> Welcome to Result Page </h2>
   
   <%
      Map<Integer,Character> answers = (Map<Integer,Character>)session.getAttribute("answers");
      Set<Map.Entry<Integer,Character>>  ansset = answers.entrySet();
      
      List<Question> qlist = (List<Question>)session.getAttribute("qlist");
      int result=0;
      %>
      <table border="1">
      <tr> <th> Q No </th> <th> submitted ans </th>  <th> Correct ans </th>  </tr>
      <% 
      for(Map.Entry<Integer,Character> entry: ansset)
      {  %>
    		<tr>
    		    <% int n = entry.getKey();
    		       char subAns = entry.getValue();
    		       char corAns = qlist.get(--n).getAns() ;
    		       if(subAns == corAns)
    		    	   result++;   
    		    %>
    			<td> <%= n %>  </td>
    			<td> <%= subAns %>  </td>
    			<td> <%= corAns %>  </td>
    		</tr>  
      <% }
      %>
      </table>
      
      <%= "Result : "+result %>
      
      <br/>
      <a href='logout'> LOGOUT </a>
   
   
 
</body>
</html>