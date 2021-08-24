package com.model;



import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/HomeServlet")
public class HomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//Setting some attributes
		Person person = new Employee();
		person.setName("Sayali");
		
		request.setAttribute("person", person);
		
		Employee emp = new Employee();
		Address add = new Address();
		add.setAddress("India");
		emp.setAddress(add);
		emp.setId(1);
		emp.setName("Sayali Chougule");
		
		HttpSession session = request.getSession();
		session.setAttribute("employee", emp);
		
		response.addCookie(new Cookie("User.Cookie","Tomcat User"));
		getServletContext().setAttribute("User.Cookie","Tomcat User");
		
		RequestDispatcher rd = getServletContext().getRequestDispatcher("/home.jsp");
		rd.forward(request, response);
	}

}
