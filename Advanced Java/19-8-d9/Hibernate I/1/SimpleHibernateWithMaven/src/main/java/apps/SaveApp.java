package apps;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import entities.Emp;

public class SaveApp {

	public static void main(String[] args) {
		Emp e = new Emp(104,"Sayali",13000,"Trainer");
		
		StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure().build();
		
		/*MetadataSources sources = new MetadataSources(registry);
		
		Metadata metadata = sources.getMetadataBuilder().build();*/
		
		Metadata metadata = new MetadataSources(registry).getMetadataBuilder().build();
		
		SessionFactory sf = metadata.getSessionFactoryBuilder().build();
		
		System.out.println("session factory created");
		
		Session session = sf.openSession();
		
		Transaction tr = session.beginTransaction();
		
		session.save(e);   //insert query
		
		tr.commit();    //DML will take effect permanently
		
		System.out.println("Emp saved");
		
		session.close();
		
		sf.close();
	}

}
