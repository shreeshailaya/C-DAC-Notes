package controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.User;


@WebServlet("/register")
public class RegisterController extends HttpServlet 
{
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String uid = request.getParameter("uid");
		String pwd = request.getParameter("pwd");
		String fname = request.getParameter("fnm");
		String lname = request.getParameter("lnm");
		String email = request.getParameter("eid");
		String contact = request.getParameter("con");
		String area = request.getParameter("ar");
		String city = request.getParameter("cy");
		String pincode = request.getParameter("pc");
		User user = new User(uid,pwd,fname,lname,email, contact,area, city, pincode);
		
		HttpSession session = request.getSession();
		session.setAttribute("user", user);
		
		RequestDispatcher rd = request.getRequestDispatcher("display.jsp");
		rd.forward(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		doGet(req,resp);
	}

}
