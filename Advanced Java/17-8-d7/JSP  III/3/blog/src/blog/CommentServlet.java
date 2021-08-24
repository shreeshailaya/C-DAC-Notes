package blog;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

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

@WebServlet("/comments")
public class CommentServlet extends HttpServlet 
{
	private static final long serialVersionUID = 1L;

	Connection con;
	public void init(ServletConfig config) throws ServletException 
	{
		
		con=(Connection)config.getServletContext().getAttribute("blogcon");
		
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		PreparedStatement ps=null;
		ResultSet rs=null;
		List<Comments> comments=new ArrayList<>();
		int tid=Integer.parseInt(request.getParameter("tid"));
		HttpSession session=request.getSession();
		try
		{
			ps=con.prepareStatement("Select * from comments where topicid=?");
			ps.setInt(1, tid);
			rs=ps.executeQuery();
			while(rs.next())
			{
				Comments c=new Comments(rs.getInt(1),rs.getString(2),rs.getInt(3),rs.getString(4));
				comments.add(c);
			}
			session.setAttribute("comments", comments);
			RequestDispatcher rd=request.getRequestDispatcher("/Displaycomment.jsp");
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
