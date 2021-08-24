package listeners;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * Application Lifecycle Listener implementation class DBConnection
 *
 */
@WebListener
public class DBConnection implements ServletContextListener {
	Connection con =null;
   
    public void contextDestroyed(ServletContextEvent sce)  { 
        try
        {
        	con.close();
        }
        catch(SQLException e)
        {
        	e.printStackTrace();
        }
    }

	/**
     * @see ServletContextListener#contextInitialized(ServletContextEvent)
     */
    public void contextInitialized(ServletContextEvent sce)  { 
        String driver = sce.getServletContext().getInitParameter("driver");
        String uname = sce.getServletContext().getInitParameter("uname");
        String pwd = sce.getServletContext().getInitParameter("pwd");
        String url = sce.getServletContext().getInitParameter("url");
        try
        {
        	Class.forName(driver);
        	con = DriverManager.getConnection(url,uname,pwd);
        	System.out.println("Connection established");
        	sce.getServletContext().setAttribute("dbcon", con);
        }
        catch(ClassNotFoundException | SQLException e)
        {
        	e.printStackTrace();
        }
    }
	
}
