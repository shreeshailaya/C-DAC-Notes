package com.java.controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.java.model.User;
import com.java.service.RegisterService;


public class RegisterServlet extends HttpServlet {
	public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
	 response.setContentType("text/html;charset=UTF-8");
	 PrintWriter out = response.getWriter();
	 String isbn = request.getParameter("isbn");
	 String bname = request.getParameter("bname");
	 String author = request.getParameter("author");
	 String publisher = request.getParameter("publisher");
	 Long price = Long.parseLong(request.getParameter("price"));
	 
	 String userId = request.getParameter("userId");
	 String password = request.getParameter("password");
	 User user = new User(isbn,bname,author,publisher,price,userId, password);
			
	 try {	
		 RegisterService registerService = new RegisterService();
		 boolean result = registerService.register(user);		
		 out.println("<html>");
		 out.println("<head>");		
		 out.println("<title>Book Added Successful</title>");		
		 out.println("</head>");
		 out.println("<body>");
		 out.println("<center>");
		 if(result){
			 out.println("<h1>Thanks for Visiting:</h1>");
			 out.println("To login with new UserId and Password<a href=login.jsp>Click here</a>");
		 }else{
			 out.println("<h1> Failed</h1>");
			 out.println("To try again<a href=register.jsp>Click here</a>");
		 }
		 out.println("</center>");
		 out.println("</body>");
		 out.println("</html>");
	 } finally {		
		 out.close();
	 }
}

}