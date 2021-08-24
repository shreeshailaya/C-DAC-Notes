package apps;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import entities.Emp;

public class UpdateApp {

	public static void main(String[] args) {
		StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure().build();
		
		/*MetadataSources sources = new MetadataSources(registry);
		
		Metadata metadata = sources.getMetadataBuilder().build();*/
		
		Metadata metadata = new MetadataSources(registry).getMetadataBuilder().build();
		
		SessionFactory sf = metadata.getSessionFactoryBuilder().build();
		
		System.out.println("session factory created");
		
		Session session = sf.openSession();
		
		//e is representing the record in the database
		Emp e = session.get(Emp.class, 103);
		
		System.out.println("Emp retrieved from database");
		
		e.setSalary(20000);
		
		Transaction tr = session.beginTransaction();
		
		session.update(e);    //update query
		
		tr.commit();
		
		System.out.println("Emp update");
		
		session.close();
		
		sf.close();

	}

}
