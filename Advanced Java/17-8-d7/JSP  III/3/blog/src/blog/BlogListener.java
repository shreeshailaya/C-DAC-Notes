package blog;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;


@WebListener
public class BlogListener implements ServletContextListener 
{
	Connection con;
  
    public void contextDestroyed(ServletContextEvent sce)  
    { 
       try 
       {
		con.close();
       } 
       catch (SQLException e) 
       {
		e.printStackTrace();
       }
    }

	
    public void contextInitialized(ServletContextEvent sce) 
    { 
    	ServletContext cntx=sce.getServletContext();
        String driver=cntx.getInitParameter("driver");
        String url=cntx.getInitParameter("url");
        String user=cntx.getInitParameter("user");
        String pwd=cntx.getInitParameter("pwd");
        try 
        {
 			Class.forName(driver);
 			con=DriverManager.getConnection(url,user,pwd);
 			cntx.setAttribute("blogcon", con);
 			System.out.println("Started");
        } 
        catch (ClassNotFoundException | SQLException e) 
        {
     	   e.printStackTrace();
        }
    	 
    }
	
}
