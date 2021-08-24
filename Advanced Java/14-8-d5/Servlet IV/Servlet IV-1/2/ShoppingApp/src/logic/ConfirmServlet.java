package logic;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import entities.User;

@WebServlet("/confirm")
public class ConfirmServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Connection con;

	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		super.init(config);
		con = (Connection)config.getServletContext().getAttribute("jdbccon");
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//insert the record of shopping summary in database
		//first column is AI
		//second column is uid
		RequestDispatcher rd =request.getRequestDispatcher("/header");
		rd.include(request, response);
		HttpSession session = request.getSession();
		User u  = (User)session.getAttribute("cuser");
		String uid = u.getUid();
		
		//current date and time - third column
		SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd");
		String cdate = sdf.format(Calendar.getInstance().getTime());
		
		//forth column - total cost
		int total = (Integer)session.getAttribute("totalcost");
				
		//create insert query for shopping table
		PreparedStatement ps = null;
				
		
		PrintWriter out = response.getWriter();
		
		out.println("UID : "+uid);
		out.println("date : "+cdate);
		out.println("total : "+total);
		out.println("<h3>Thanks for shopping with us<h3>");
		out.println("<p> Bill will be mailed at "+u.getEmail() +"</p>");
		out.println("<p> You will receive the message on "+u.getContact() +"before delivery</p>");
		out.println("<br/> <a href='logout'> LOGOUT </a> ");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
