package listeners;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * Application Lifecycle Listener implementation class MyListener
 *
 */
@WebListener
public class MyListener implements ServletContextListener {

    Connection con;
    public void contextDestroyed(ServletContextEvent sce)  { 
         
    	// connection should be closed
    	
    	try {
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

	
    public void contextInitialized(ServletContextEvent sce)  { 
         //read the context parameters
    	  //establish the connection
    	 //set is as context level attribute
    	String driver = sce.getServletContext().getInitParameter("driverclass");
    	String url = sce.getServletContext().getInitParameter("jdbcurl");
    	String user = sce.getServletContext().getInitParameter("user");
    	String pwd = sce.getServletContext().getInitParameter("password");
    	
    	try
    	{
    		Class.forName(driver);
    		con = DriverManager.getConnection(url, user, pwd);
    		sce.getServletContext().setAttribute("jdbccon", con);
    		System.out.println("connection is set context level attribute");
    	}
    	catch(Exception e)
    	{
    		e.printStackTrace();
    	}
    	
    	
    }
	
}





