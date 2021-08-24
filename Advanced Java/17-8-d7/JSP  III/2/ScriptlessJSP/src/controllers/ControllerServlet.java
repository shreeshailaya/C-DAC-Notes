package controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import beans.Address;
import beans.User;

/**
 * Servlet implementation class ControllerServlet
 */
@WebServlet("/controller")
public class ControllerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//read all request parameters
		//create user object, set it as attribute
		//forward to request to view
		String uid = request.getParameter("uid");
		String fnm = request.getParameter("fname");
		String lnm = request.getParameter("lname");
		String contact = request.getParameter("contact");
		String email = request.getParameter("email");
		String area = request.getParameter("area");
		String city = request.getParameter("city");
		String pincode = request.getParameter("pincode");
		
		User u = new User(uid,fnm,lnm,contact,email,new Address(area,city,pincode));
		HttpSession session = request.getSession();
		session.setAttribute("userinfo",u);
		
		RequestDispatcher rd = request.getRequestDispatcher("/view.jsp");
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
