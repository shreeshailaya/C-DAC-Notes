package Nine;

import java.io.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/VisitCount")
public class VisitCount extends HttpServlet {

	static int i=1;
    public void doGet(HttpServletRequest request, HttpServletResponse response)
        throws IOException, ServletException
    {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        String k=String.valueOf(i);
        Cookie c = new Cookie("visit",k);
        response.addCookie(c);
        int j=Integer.parseInt(c.getValue());
        if(j==1)
        {
            out.println("Welcome");
        }
        else
        {
            out.println("You visited "+i+" times");
        }
                i++;                       
    }
}
