package logic;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import entities.Question;



@WebServlet("/getQuestions")
public class GetQuestionsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Connection con;
	
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		con=(Connection)config.getServletContext().getAttribute("jdbccon");
	}

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PreparedStatement ps=null;
		ResultSet rs=null;
		int tid=Integer.parseInt(request.getParameter("topicid"));
		try
		{
			ps=con.prepareStatement("select * from questions where topicid = ?");
			ps.setInt(1, tid);
			rs = ps.executeQuery();
			int i=1;
			List<Question> qlist = new ArrayList<>();
			while(rs.next())
			{
				Question q= new Question(i,rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7).charAt(0));
				qlist.add(q);
				i++;
			}
			
			Map<Integer,Character> answers = new HashMap<>();
			request.getSession().setAttribute("qlist", qlist);
			request.getSession().setAttribute("answers", answers);
			
			RequestDispatcher rd= request.getRequestDispatcher("/paper");
			rd.forward(request, response);
		}
		catch(Exception e)
		{
			
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

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
