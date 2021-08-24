package logic;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/createCookie")
public class CreateCookieServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		String nm = request.getParameter("nm");
		String email = request.getParameter("email");
		Cookie c1 = new Cookie("nmcookie",nm);
		response.addCookie(c1);
		Cookie c2 = new Cookie("mailcookie",email);
		response.addCookie(c2);
		 
		out.println("<br/> Cookie are created ");
		out.println("<br/> <a href='viewCookie'> View the cookie ? </a>");
		
		
		//forwarding the request to some other servlet, cookies will not be accessible
		
		//But cookies are accessible in redirected servlet
		
		//always write this code in some other servlet
		//that servlet should be requested by the user in the subsequent request
		/*Cookie [] allc = request.getCookies();
		if(allc != null)
		{
			for(Cookie c : allc)
			{
				if(c.getName().equals("nmcookie"))
					out.println("Name Cookie : "+c.getValue());
			}
		}*/	
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
