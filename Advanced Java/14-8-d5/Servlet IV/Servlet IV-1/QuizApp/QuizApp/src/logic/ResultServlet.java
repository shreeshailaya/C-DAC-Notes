package logic;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import entities.Question;

/**
 * Servlet implementation class ResultServlet
 */
@WebServlet("/result")
public class ResultServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
	}

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out =response.getWriter();
		response.setContentType("text/html");
		out.println("welcome to results page");
		
		HttpSession session =request.getSession();
		
		List<Question> qlist=(List<Question>)session.getAttribute("qlist");
		
		Map<Integer,Character> ansmap=(Map<Integer,Character>)session.getAttribute("answers");
		Set<Map.Entry<Integer,Character>> answers = ansmap.entrySet();
		
		int result = 0;
		
		out.println("<table border=1>");
		out.println("<tr> <th> Qno </th> <th> submitted ans </th> <th> Correct Ans </th> </tr>");
		for(Map.Entry<Integer, Character> entry : answers)
		{
			out.println("<tr>");
			int n = entry.getKey();
			char ans = entry.getValue();
			out.println("<td> "+n+"</td>");
			out.println("<td> "+ans+"</td>");
			char corAns = qlist.get(--n).getAns();
			out.println("<td> "+ corAns +"</td>");
			if(ans == corAns)
				result++;
			
			out.println("</tr>");
		}
		out.println("</table>");
		
		out.println("Result : "+result);
		// insert the record in exams table(userid,topicid,date,result)
		out.print("<a href='logout'> LOGOUT </a>");
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
