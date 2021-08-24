package logic;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import entities.Question;

/**
 * Servlet implementation class PaperServlet
 */
@WebServlet("/paper")
public class PaperServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
	}

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		HttpSession session= request.getSession();
		
		String subAns = null;
		Map<Integer,Character> ansmap=(Map<Integer,Character>)session.getAttribute("answers");
		
		if(request.getParameter("qno") != null) //not for the first request
		{	
			if(request.getParameter("option") != null)  //when option is submitted
			{
				subAns = request.getParameter("option");
				ansmap.put(Integer.parseInt(request.getParameter("qno")),  subAns.charAt(0));
			}
			else  //when option is not submitted
				ansmap.put(Integer.parseInt(request.getParameter("qno")),  '-');
			
			session.setAttribute("answers", ansmap);
		}
			
		
		List<Question> qlist=(List<Question>)session.getAttribute("qlist");
		
		Integer qno=(Integer)session.getAttribute("qno");
		if(qno == null)
			qno=0;
		else
			qno++;
		
		if(qno == 5)
		{
			RequestDispatcher rd = request.getRequestDispatcher("/result.jsp");
			rd.forward(request, response);
		}
		else
		{
			Question q=qlist.get(qno);
			
			session.setAttribute("qno", qno);
			
			out.print("<form action='paper'>");
			out.print("<input type='hidden' name='qno' value='"+q.getQid()+"'/>");
			out.print("Q."+q.getQid()+ "&nbsp;" +q.getQtext() +"? <br/>");
			out.print("<input type='radio' name='option' value='a' /> "+ q.getOpt1() +"<br/>");
			out.print("<input type='radio' name='option' value='b' /> "+ q.getOpt2() +"<br/>");
			out.print("<input type='radio' name='option' value='c' /> "+ q.getOpt3()+"<br/>");
			out.print("<input type='radio' name='option' value='d' /> "+ q.getOp4() +"<br/>");
			out.print("<input type='submit' value='NEXT' /> ");
			out.print("</form>");
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}











