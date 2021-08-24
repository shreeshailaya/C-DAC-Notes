<html>
<head>
<title>Registration Form</title>
<style type="text/css">
h3{font-family: Calibri; font-size: 22pt; font-style: normal; font-weight: bold; color:SlateBlue;
text-align: center; text-decoration: underline }
table{font-family: Calibri; color:white; font-size: 11pt; font-style: normal;width: 50%;
text-align:; background-color: SlateBlue; border-collapse: collapse; border: 2px solid navy}
table.inner{border: 0px}
</style>
</head>
 
<body>
<h3>Student Registration Form</h3>
<form action="RegisterServlet" method="POST">
 
<table align="center" cellpadding = "10">
<tr>
<td>ISBN NUMBER:</td>
<td><input type="text" name="isbn" maxlength="30"/>
(max 30 characters a-z and A-Z)
</td>
</tr>
<tr>
<td>Book Name:</td>
<td><input type="text" name="bname" maxlength="30"/>
(max 30 characters a-z and A-Z)
</td>
</tr>
 
<tr>
<td>Author:</td>
<td><input type="text" name="author" maxlength="30"/>
(max 30 characters a-z and A-Z)
</td>
</tr>
 
<tr>
<td>Publisher</td>
<td><input type="text" name="publisher" maxlength="100" /></td>
</tr>
<tr>
<td>Price</td>
<td><input type="text" name="price" maxlength="100" /></td>
</tr>
<tr>
<td>User ID</td>
<td><input type="text" name="userId" maxlength="100" /></td>
</tr>
<tr>
<td>Password</td>
<td><input type="password" name="password" maxlength="100" /></td>
</tr>

<tr>
<td colspan="2" align="center">
<input type="submit" value="Submit">
<input type="reset" value="Reset">
</td>
</tr>
</table>
 
</form>
 
</body>
</html>