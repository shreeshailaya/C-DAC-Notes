package logic;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/viewcart")
public class ViewcartServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Connection con;

	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		con = (Connection)config.getServletContext().getAttribute("jdbccon");
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//gets executed on click of hyperlink
		PrintWriter out = response.getWriter();
		RequestDispatcher rd =request.getRequestDispatcher("/header");
		rd.include(request, response);
		HttpSession session = request.getSession();
		List<Integer> products = (List<Integer>)session.getAttribute("cart");
		if(products == null)
		{
			out.println("<h2> No products are selected </h2>");
		}
		else
		{
			PreparedStatement ps = null;
			ResultSet rs = null;
			try
			{
				int total = 0;
				out.println("<table border=1>");
				for(int pid : products)
				{
					ps = con.prepareStatement("select * from product where p_id = ?");
					ps.setInt(1, pid);
					rs = ps.executeQuery();
					rs.next();
					out.println("<tr>");
					out.println("<td>"+rs.getString(2)+"</td>");
					out.println("<td>"+rs.getString(3)+"</td>");
					int price = Integer.parseInt(rs.getString(4));
					total = total + price;
					out.println("<td>"+price+"</td>");
					out.println("</tr>");
				}
				session.setAttribute("totalcost", total);
				out.println("<tr>");
				out.println("<td colspan='2'> Total Price </td>");
				out.println("<td>"+total+"</td>");
				out.println("</tr>");
				out.println("</table>");
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
		out.println("<br/> <br/>");
		out.println("<a href='home'> Go for Selection? </a>");
		out.println("<a href='confirm'> Confirm Cart? </a>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
