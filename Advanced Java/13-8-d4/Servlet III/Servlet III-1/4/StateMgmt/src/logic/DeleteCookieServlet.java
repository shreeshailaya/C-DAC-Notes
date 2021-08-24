package logic;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/deleteCookie")
public class DeleteCookieServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Cookie [] allc = request.getCookies();
		if(allc != null)
		{
			for(Cookie c : allc)
			{
				if(c.getName().equals("nmcookie"))
				{
					c.setMaxAge(0);
					response.addCookie(c);
				}
				if(c.getName().equals("mailcookie"))
				{
					c.setMaxAge(0);
					response.addCookie(c);
				}
			}
		}
		
		PrintWriter out = response.getWriter();
		out.print("<br/> Cookies are deleted ");
		out.println("<br/> <a href='viewCookie'> View the cookie ? </a>");
		out.println("<br/> <a href='cookieform.html'> Create Cookie again?</a> ");
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
