package Fourth;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DataServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
	//	super.doPost(req, resp);
		String center=getServletContext().getInitParameter("institution");
		PrintWriter out=resp.getWriter();
		out.print("<b>Institution Name:"+center+"</br><b>");
		
		String subject=getServletConfig().getInitParameter("subject");
		out.print("Subject Name:"+subject+"</br>");
		out.print("Trainer:"+" Trupti Sathe"+"</br>");
		out.print("Module Start Date:"+" 4/12/2019"+"</br>");
		out.print("Module End Date:"+" 3/1/2020"+"</br>");
		
		out.print("Back to Home"+"<a href='showDetails.html'>Click here</a>");
	}
}
