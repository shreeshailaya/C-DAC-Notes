package com.util;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class InsertComments
 */
@WebServlet("/insertComments")
public class InsertComments extends HttpServlet {
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
		// TODO Auto-generated method stub
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PreparedStatement ps =null;
		String comment =  request.getParameter("comm");
		String userid = request.getParameter("uid");
		int tid = Integer.parseInt(request.getParameter("nm"));
		String query = "insert into comments(text,topicid,uid) values (?,?,?)";
		try
		{
			ps=con.prepareStatement(query);
			ps.setString(1, comment);
			ps.setInt(2, tid);
			ps.setString(3, userid);
			ps.executeUpdate();
			System.out.println("Record Inserted Successfully");
			request.getRequestDispatcher("/home.jsp").forward(request, response);
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
			} 
			catch (SQLException e) 
			{
				e.printStackTrace();
			}
		}
	}

}
