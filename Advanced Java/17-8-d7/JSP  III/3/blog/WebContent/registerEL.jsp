<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="DisplayEL.jsp" method="post">

Enter User ID :
<input type="text" name="uid"/>
<br/>
Enter Password :
<input type="password" name="pwd"/>
<br/>
Enter First Name :
<input type="text" name="fnm"/>
<br/>
Enter Last Name :
<input type="text" name="lnm"/>
<br/>
Enter Email ID :
<input type="text" name="eid"/>
<br/>
Enter Contact :
<input type="text" name="con"/>
<br/>
Enter Area :
<input type="text" name="ar"/>
<br/>
Enter City :
<input type="text" name="cy"/>
<br/>
Enter Pincode :
<input type="text" name="pc"/>
<br/>
Select Hobbies :
<select name="hobbies" multiple size="3">
<option value="drawing">Drawing</option>
<option  value="cooking">Cooking</option>
<option  value="singing">Singing</option>
<option  value="studying">Studying</option>
<option  value="dancing">Dancing</option>
</select>
<input type="submit" value="LOGIN"/>
</form>
<br/><br/>

</body>
</html>