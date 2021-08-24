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

public class ProductCriteria {
public static void main(String[] args) {
	StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure().build();
	
	Metadata metadata = new MetadataSources(registry).getMetadataBuilder().build();
	
	SessionFactory sf = metadata.getSessionFactoryBuilder().build();
	
	System.out.println("session factory created");
	
	Session session = sf.openSession();
	
	
	
	//create criteria builder
	CriteriaBuilder builder = session.getCriteriaBuilder();
	
		//create criteria query
	CriteriaQuery<Category> query = builder.createQuery(Category.class);
	
	//specify root ie from clause
	Root<Category> from = query.from(Category.class);
	
	//specify select clause
	query.select(from);
	
	//create query from criteria provided
	Query q = session.createQuery(query);  //"from question"
	
	List<Category> qlist = q.getResultList();
	
	for(Category ques : qlist)
		System.out.println(ques.getProducts());
	
}}


