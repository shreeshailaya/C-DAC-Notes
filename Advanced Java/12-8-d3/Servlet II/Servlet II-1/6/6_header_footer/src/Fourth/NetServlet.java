package Fourth;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@WebServlet("/NetServlet")
public class NetServlet extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String center=getServletContext().getInitParameter("institution");
		PrintWriter out=resp.getWriter();
		out.print("<b>Institution Name:"+center+"</br><b>");
		RequestDispatcher rd=req.getRequestDispatcher("header.html");
		rd.include(req, resp);
		String subject=getServletConfig().getInitParameter("subject");
		out.print("Subject Name:"+subject+"</br>");
		out.print("Trainer:"+" Bakul Joshi"+"</br>");
		out.print("Module Start Date:"+" 2/10/2019"+"</br>");
		out.print("Module End Date:"+" 3/11/2019"+"</br>");
		
		RequestDispatcher rd1=req.getRequestDispatcher("footer.html");
		rd1.include(req, resp);
	}

}
