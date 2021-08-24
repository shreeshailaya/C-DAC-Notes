package logic;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/visitcount")
public class VisitCountServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
	}

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		int count = 0;
		Cookie [] all = request.getCookies();
		if(all != null)
		{
			for(Cookie c : all)
			{
				if(c.getName().equals("visitcount"))
					count = Integer.parseInt(c.getValue());
			}
		}
		count++;
		Cookie c = new Cookie("visitcount",""+count);
		response.addCookie(c);
		out.print("<br/> Visit Count : "+count);
		out.print("<br/> <a href='visitcount'> REFRESH </a> ");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
