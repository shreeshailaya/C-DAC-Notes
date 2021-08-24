package logic;

import java.io.IOException;
import java.io.PrintWriter;
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

import entities.User;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Connection con;

	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		//not established but only retrieved from context attribute
		con = (Connection)config.getServletContext().getAttribute("jdbccon");
	}

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//login authentication will be done
		PrintWriter out = response.getWriter();
		String uid = request.getParameter("uid");
		String pwd = request.getParameter("pwd");
		PreparedStatement ps = null;
		ResultSet rs = null;
		try
		{
			ps = con.prepareStatement("select * from users where uid = ? and password = ?");
			ps.setString(1, uid);
			ps.setString(2, pwd);
			rs = ps.executeQuery();
			boolean flag = false;
			while(rs.next())
			{
				if(rs.getString(1).equals(uid) && rs.getString(2).equals(pwd))
				{
					flag = true;
					User u = new User(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6));
					request.getSession().setAttribute("cuser", u);
				}
			}
			if(flag) //success login
			{
				/*out.println("Login successful");
				out.println("<h2> Welcome "+ fnm+" "+lnm+"</h2>");*/
				
				//delete the loginerror cookie
				Cookie [] allc = request.getCookies();
		    	if(allc != null)
		    	{
		    		for(Cookie c : allc)
		    		{
		    			if(c.getName().equals("loginerror"))
		    			{
		    				c.setMaxAge(0);
		    				response.addCookie(c);
		    			}
		    		}
		    	}
				
				RequestDispatcher rd = request.getRequestDispatcher("/home");
				rd.forward(request, response);
			}
			else //failed login
			{
				/*out.println("Login failed"); */
				// relative URL - / means root of web application
				/*RequestDispatcher rd = request.getRequestDispatcher("/login.jsp");
				rd.forward(request, response);*/
				
				Cookie c = new Cookie("loginerror","Wrong_ID_or_PASSWORD");
				response.addCookie(c);
				//relative URL - / means the root of server
				response.sendRedirect("/ShoppingApp/login.jsp");
				
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
