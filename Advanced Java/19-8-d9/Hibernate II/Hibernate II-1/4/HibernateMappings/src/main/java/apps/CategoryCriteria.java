package apps;

import java.util.List;

import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import entities.Category;
import entities.Product;
import entities.Question;
import entities.Subject;

public class CategoryCriteria {
public static void main(String[] args) {
StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure().build();
	
	Metadata metadata = new MetadataSources(registry).getMetadataBuilder().build();
	
	SessionFactory sf = metadata.getSessionFactoryBuilder().build();
	
	System.out.println("session factory created");
	
	Session session = sf.openSession();
	
	
	
	//create criteria builder
	CriteriaBuilder builder = session.getCriteriaBuilder();
	//create criteria query
			CriteriaQuery<Object []> query = builder.createQuery(Object[].class);
					
			//specify root ie from clause
			Root<Product> from = query.from(Product.class);
			
			//specify select clause, where clause
			query.multiselect(from.get("description"),from.get("name")).where(builder.equal(from.get("id"),1));
					
			//create query from criteria provided
			Query q = session.createQuery(query);  
			
			List<Object []> ques= q.getResultList();
			
			for(Object [] qu : ques)
				System.out.println(qu[0] + " : ");
		}
}
