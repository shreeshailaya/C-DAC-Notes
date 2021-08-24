package logic;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/viewCookie")
public class ViewCookieServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		Cookie [] allc = request.getCookies();
		if(allc != null)
		{
			for(Cookie c : allc)
			{
				if(c.getName().equals("nmcookie"))
					out.println("Name Cookie : "+c.getValue());
				if(c.getName().equals("mailcookie"))
					out.println("Mail Cookie : "+c.getValue());
			}
		}
		out.println("<br/> <a href='deleteCookie'> Delete Cookie </a>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
