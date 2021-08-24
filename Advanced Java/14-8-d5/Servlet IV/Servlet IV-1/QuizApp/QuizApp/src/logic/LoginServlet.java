package logic;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Connection con;
	
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		con = (Connection)config.getServletContext().getAttribute("jdbccon");
	}

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uid = request.getParameter("uid");
		String pwd = request.getParameter("pwd");
		PreparedStatement ps= null;
		ResultSet rs = null;
		
		try
		{
			ps= con.prepareStatement("select * from users where u_id=? and password=?");
			ps.setString(1, uid);
			ps.setString(2, pwd);
			rs = ps.executeQuery();
			boolean flag=false;
			while(rs.next())
			{
				if(uid.equals(rs.getString(1)) && pwd.equals(rs.getString(2)))
				{
					flag =true;
					break;
				}
			}
			if(flag)
			{
				Cookie [] ck=request.getCookies();
			   	if(ck != null)
			   	{
			   	   for(Cookie c: ck)
			   	   {
			   		   if(c.getName().equals("loginerror"))
			   		   {
			   			   c.setMaxAge(0);
			   			   response.addCookie(c);
			   		   }
			   	   }
			   	}
				RequestDispatcher rd= request.getRequestDispatcher("/home");
				rd.forward(request, response);
			}
			else
			{
				//redirection
				Cookie c = new Cookie("loginerror","Wrong_ID/pwd._Try_Again");
				response.addCookie(c);
				
				response.sendRedirect("/QuizApp/login.jsp");
				//response.sendRedirect("http://www.google.com");
			}
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try {
				rs.close();
				ps.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}

}
