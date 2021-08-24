package controllers;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import beans.Comments;
import beans.Topic;

/**
 * Servlet implementation class SelectedTopic
 */
@WebServlet("/selectedtopic")
public class SelectedTopic extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Connection con=null;
	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		con=(Connection)config.getServletContext().getAttribute("dbcon");
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id =Integer.parseInt(request.getParameter("topicid"));
		PreparedStatement ps =null;
		ResultSet rs =null;
		List<Comments>comm = new ArrayList<Comments>();
		try
		{
			ps = con.prepareStatement("select * from comments where topicid=?");
			ps.setInt(1, id);
			rs=ps.executeQuery();
			while(rs.next())
			{
				comm.add(new Comments(rs.getInt(1), rs.getString(2), rs.getInt(3),rs.getString(4)));
			}
			request.getSession().setAttribute("comments", comm);
			request.getRequestDispatcher("/displayComments.jsp").forward(request, response);
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				ps.close();
				rs.close();
			}
			catch(SQLException e)
			{
				e.printStackTrace();
			}
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
