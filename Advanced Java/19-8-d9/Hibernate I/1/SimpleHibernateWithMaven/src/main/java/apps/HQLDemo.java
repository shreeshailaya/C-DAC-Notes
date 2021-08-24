package apps;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.query.Query;

import entities.Emp;

public class HQLDemo {

	public static void main(String[] args) {
		StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure().build();
		
		/*MetadataSources sources = new MetadataSources(registry);
		
		Metadata metadata = sources.getMetadataBuilder().build();*/
		
		Metadata metadata = new MetadataSources(registry).getMetadataBuilder().build();
		
		SessionFactory sf = metadata.getSessionFactoryBuilder().build();
		
		System.out.println("session factory created");
		
		Session session = sf.openSession();  //1 dialog with database
		
		/*Query q = session.createQuery("from Emp");   //HQL - class and properties

		List<Emp> allemps = q.getResultList();
		
		for(Emp e : allemps)
			System.out.println(e); */
		
		/*Query q = session.createQuery("select empid,ename from Emp where salary > 15000");
		
		List<Object []> emps = q.getResultList();
		
		for(Object [] emp : emps)
			System.out.println(emp[0]+" : "+emp[1]); */
		
		Query q = session.createNamedQuery("getEmpsBySalary");
		
		q.setParameter("sal", 17000.0f);
		
		List<Object []> emps = q.getResultList();
		
		for(Object [] emp : emps)
			System.out.println(emp[0]+" : "+emp[1]+" : "+emp[2]);
		
		session.close();
		
		sf.close();
		
	}

}
