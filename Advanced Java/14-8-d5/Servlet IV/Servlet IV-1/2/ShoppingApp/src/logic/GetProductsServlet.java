package logic;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/getProducts")
public class GetProductsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Connection con;
	
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		super.init(config);
		con = (Connection)config.getServletContext().getAttribute("jdbccon");
	}

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//primary business logic
		int catid = Integer.parseInt(request.getParameter("catid"));
		PrintWriter out = response.getWriter();
		RequestDispatcher rd =request.getRequestDispatcher("/header");
		rd.include(request, response);
		//out.println("Selected category : "+catid);
		PreparedStatement ps = null;
		ResultSet rs = null;
		try
		{
			out.println("<form action='addtocart'>");
			out.println("Select product : ");
			out.println("<select name='product'>");
			ps = con.prepareStatement("select * from product where cat_id = ?");
			ps.setInt(1, catid);
			rs = ps.executeQuery();
			while(rs.next())
			{
				out.println("<option value='"+rs.getString(1)+"'>"+rs.getString(2)+"</option>");
			}
			out.println("</select> <br/>");
			out.println("<input type='submit' value='Add to Cart' />");
			out.println("</form>");
		}
		catch(Exception e)
		{
			e.printStackTrace();
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
