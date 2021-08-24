package logic;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/addtocart")
public class AddtocartServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		RequestDispatcher rd =request.getRequestDispatcher("/header");
		rd.include(request, response);
		int pid = Integer.parseInt(request.getParameter("product"));
		List<Integer> sProducts = null;
		//retrieve from session
		HttpSession session = request.getSession();
		sProducts = (List<Integer>)session.getAttribute("cart");
		if(sProducts == null)  //no cart is set
		{  
			sProducts = new ArrayList<>();
		}
		sProducts.add(pid);   //first product added in the cart
		session.setAttribute("cart", sProducts);
		out.println(pid+ " is added to the cart <br/>");
		out.println("<br/> <a href='home'> Go For further selection </a> ");
		out.println("<br/> <a href='viewcart.jsp'> View Cart? </a> ");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
