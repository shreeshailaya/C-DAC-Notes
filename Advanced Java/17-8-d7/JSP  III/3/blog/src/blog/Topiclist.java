package blog;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/topiclist")
public class Topiclist extends HttpServlet 
{
	private static final long serialVersionUID = 1L;

	Connection con;
	public void init(ServletConfig config) throws ServletException 
	{
		
		con=(Connection)config.getServletContext().getAttribute("blogcon");
		
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		Statement stmt=null;
		ResultSet rs=null;
		List<Topics> topics=new ArrayList<>();
		HttpSession session=request.getSession();
		try
		{
			stmt=con.createStatement();
			rs=stmt.executeQuery("Select * from topic");
			while(rs.next())
			{
				Topics t=new Topics(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4));
				topics.add(t);
			}
			session.setAttribute("topics", topics);
			RequestDispatcher rd=request.getRequestDispatcher("/Displaylist.jsp");
			rd.forward(request, response);
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		doGet(request, response);
	}

}
