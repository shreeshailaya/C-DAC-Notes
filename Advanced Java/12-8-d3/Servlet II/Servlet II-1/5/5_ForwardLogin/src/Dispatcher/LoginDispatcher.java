package Dispatcher;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/LoginDispatcher")
public class LoginDispatcher extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String user=req.getParameter("user");
		String password=req.getParameter("pass");
		
		PrintWriter out=resp.getWriter();
		out.print("Welcome::"+user);
		RequestDispatcher rd=null;
		
		
		if(user.equals("object")&&password.equals("knowit"))
		{
			rd=req.getRequestDispatcher("success.html");
			//rd.forward(req, resp);
			rd.include(req, resp); //first check with include() then try for forward()... see the output difference
		}
		else
		{
			rd=req.getRequestDispatcher("error.html");
			rd.forward(req, resp);
		}
	}

}
