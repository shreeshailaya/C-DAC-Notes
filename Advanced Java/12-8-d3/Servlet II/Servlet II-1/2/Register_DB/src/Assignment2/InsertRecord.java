package Assignment2;

import java.io.IOException;
import java.sql.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.*;

@WebServlet("/InsertRecord")
public class InsertRecord extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String lname = request.getParameter("lname");
		String email = request.getParameter("email");
		
		String contact = request.getParameter("contact");
		
		Connection con = null;
		 PreparedStatement preparedStatement = null;
		 int id=0;
		 try
		 {
		 con = DB_Connect.getConnection();
		 String query = "insert into register values(?,?,?,?,?,?)"; //Insert user details into the table 'USERS'
		 preparedStatement = con.prepareStatement(query); //Making use of prepared statements here to insert bunch of data
		 preparedStatement.setInt(1,id);
		 preparedStatement.setString(2, username);
		 preparedStatement.setString(3, password);
		 preparedStatement.setString(4, lname);
		 preparedStatement.setString(5, email);
		 preparedStatement.setString(6, contact);
		 
		 int i= preparedStatement.executeUpdate();
		 
		 if (i!=0)  //Just to ensure data has been inserted into the database
		response.sendRedirect("success.html"); 
		 }
		 catch(Exception e)
		 {
		 e.printStackTrace();
		 }
	}
}
