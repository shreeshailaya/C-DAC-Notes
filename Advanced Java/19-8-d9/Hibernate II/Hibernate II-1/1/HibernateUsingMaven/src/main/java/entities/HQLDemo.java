package entities;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.query.Query;

public class HQLDemo {

	public static void main(String[] args) {
		//create session factory
		StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure().build();
						
		MetadataSources sources = new MetadataSources(registry);
			
		Metadata metadata = sources.getMetadataBuilder().build();
				
		SessionFactory sf = metadata.getSessionFactoryBuilder().build();
								
		//create session
		Session session = sf.openSession();
		
		//query is using HQL
		/*Query q = session.createQuery("from Emp");
		
		List<Emp> emps = q.getResultList();
		
		for(Emp e : emps)
		{
			System.out.println(e.getEmpid()+" : "+e.getEname()+" : "+e.getDept()+" : "+e.getSalary());
		} */
		
		//query is using HQL - class and properties
		Query q = session.createQuery("select empid, salary from Emp where salary > 15000 and salary < 30000");
		
		List<Object []> emps = q.getResultList();
		
		for(Object [] e : emps)
		{
			System.out.println(e[0]+" : "+e[1]);
		}
		
		session.close();
		
		sf.close();

	}

}
