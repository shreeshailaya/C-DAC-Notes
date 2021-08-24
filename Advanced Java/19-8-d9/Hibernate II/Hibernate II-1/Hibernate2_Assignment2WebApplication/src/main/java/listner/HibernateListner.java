package listner;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

/**
 * Application Lifecycle Listener implementation class HibernateListner
 *
 */
public class HibernateListner implements ServletContextListener {

    /**
     * Default constructor. 
     */
    public HibernateListner() {
        // TODO Auto-generated constructor stub
    }


	/**
     * @see ServletContextListener#contextDestroyed(ServletContextEvent)
     */
    public void contextDestroyed(ServletContextEvent sce)  { 
         // TODO Auto-generated method stub
    }


	/**
     * @see ServletContextListener#contextInitialized(ServletContextEvent)
     */
    public void contextInitialized(ServletContextEvent sce)  { 
    	StandardServiceRegistry sg = 
				new StandardServiceRegistryBuilder().configure().build();
		
		MetadataSources sources = new MetadataSources(sg);
		
		Metadata metaData = sources.getMetadataBuilder().build();
		
		SessionFactory sf = metaData.getSessionFactoryBuilder().build();
		
		sce.getServletContext().setAttribute("sessionFactory", sf);
		System.out.println("Setting connection object to context");
    }
	
}
