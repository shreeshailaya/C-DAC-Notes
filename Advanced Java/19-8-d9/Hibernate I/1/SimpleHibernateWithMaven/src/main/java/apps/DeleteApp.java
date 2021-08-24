package apps;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import entities.Emp;

public class DeleteApp {

	public static void main(String[] args) 
	{
        StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure().build();
		
		/*MetadataSources sources = new MetadataSources(registry);
		
		Metadata metadata = sources.getMetadataBuilder().build();*/
		
		Metadata metadata = new MetadataSources(registry).getMetadataBuilder().build();
		
		SessionFactory sf = metadata.getSessionFactoryBuilder().build();
		
		System.out.println("session factory created");
		
		Session session = sf.openSession();  //1 dialog with database
		
		Emp e = session.get(Emp.class, 102);
		
		System.out.println("Emp retrieved");
		
		Transaction tr = session.beginTransaction();
		
		session.delete(e);
		
		tr.commit();
		
		System.out.println("Emp deleted");
		
		session.close();
		
		sf.close();

	}

}
