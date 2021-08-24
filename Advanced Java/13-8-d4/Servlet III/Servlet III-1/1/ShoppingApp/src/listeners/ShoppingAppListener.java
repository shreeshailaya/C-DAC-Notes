package listeners;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class ShoppingAppListener implements ServletContextListener {
	Connection con;
	
    public void contextInitialized(ServletContextEvent sce)  { 
        //establish the db connection
    	//db connection should be set as context level attribute
    	String driver = sce.getServletContext().getInitParameter("driverclass");
    	String url = sce.getServletContext().getInitParameter("url");
    	String user = sce.getServletContext().getInitParameter("user");
    	String pwd = sce.getServletContext().getInitParameter("password");
    	try
    	{
	    	Class.forName(driver);
	    	con = DriverManager.getConnection(url,user,pwd);
	    	sce.getServletContext().setAttribute("jdbccon", con);
	    	System.out.println("connection set as context attribute");
    	}
    	catch(Exception e)
    	{
    		e.printStackTrace();
    	}
    	
    }
    
    public void contextDestroyed(ServletContextEvent sce)  { 
        //close the db connection
    	try {
			con.close();
		} 
    	catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
	
}
