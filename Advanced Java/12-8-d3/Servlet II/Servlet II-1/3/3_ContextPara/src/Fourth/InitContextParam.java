package Fourth;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class InitContextParam extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
	//	super.doPost(req, resp);
		String center=getServletContext().getInitParameter("institution");
		PrintWriter out=resp.getWriter();
		out.print("<b>Institution Name:"+center+"</br><b>");
		
		String subject=getServletConfig().getInitParameter("subject");
		out.print("Subject Name:"+subject+"</br>");
		out.print("Trainer:"+" Sayali Chougule"+"</br>");
		out.print("Module Start Date:"+" 1/9/2019"+"</br>");
		out.print("Module End Date:"+" 2/10/2019"+"</br>");
		
		out.print("Back to Home"+"<a href='showDetails.html'>Click here</a>");
	}
}
