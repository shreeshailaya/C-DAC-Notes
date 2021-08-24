package controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import beans.User;

/**
 * Servlet implementation class ControllerServlet
 */
@WebServlet("/controller")
public class ControllerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uid = request.getParameter("uid");
		String pwd = request.getParameter("pwd");
		String fname = request.getParameter("fname");
		String lname = request.getParameter("lname");
		String email = request.getParameter("email");
		String contact = request.getParameter("contact");
		String area = request.getParameter("area");
		String city = request.getParameter("city");
		String pin = request.getParameter("pincode");
		
		String [] hobbies = request.getParameterValues("hobbies");
		
		request.setAttribute("hobbies", hobbies);
				
		User theUser = new User(uid, pwd, fname, lname, email, contact, area, city, pin);
		
		Cookie c = new Cookie("namecookie",fname+"_"+lname);
		response.addCookie(c);
		request.getSession().setAttribute("user", theUser);
		request.getRequestDispatcher("/view.jsp").forward(request, response);
		
	}

}
