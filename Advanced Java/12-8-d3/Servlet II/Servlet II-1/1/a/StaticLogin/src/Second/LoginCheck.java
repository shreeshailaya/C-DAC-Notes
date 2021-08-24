package Second;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/LoginCheck")
public class LoginCheck extends HttpServlet{
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
	String user=req.getParameter("user");
	String password=req.getParameter("pass");
	
	PrintWriter out=resp.getWriter();
	
	if(user.equals("object")&&password.equals("knowit"))
	{
	out.print("<h1>Welcome:"+user+" Successful Logged In...</h1>");	
	}
	else
	{
		out.print("<h1>Wrong User</h1>");
		out.print("<a href='Login.html'>back to home</a>");	
	}
}
}
