package com.util;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import beans.Topic;

/**
 * Servlet implementation class GetTopics
 */
@WebServlet("/gettopics")
public class GetTopics extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Connection con =null;
	public void init(ServletConfig config) throws ServletException {
		con =(Connection)config.getServletContext().getAttribute("dbcon");
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Statement st = null;
		ResultSet rs = null;
		List<Topic>alltopic = new ArrayList<Topic>();
		String query = "select * from topic";
		try
		{
			st=con.createStatement();
			rs=st.executeQuery(query);
			while(rs.next())
			{
				alltopic.add(new Topic(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4)));
			}
			request.getSession().setAttribute("topiclist", alltopic);
			request.getRequestDispatcher("/home.jsp").forward(request, response);
		}
		catch(SQLException e)
		{
			e.printStackTrace();
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
