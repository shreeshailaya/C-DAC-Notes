package apps;





import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import entities.Address;
import entities.Category;
import entities.DACStudent;
import entities.DBDAStudent;
import entities.Product;
import entities.Question;
import entities.Student;

public class SaveProduct {

	public static void main(String[] args) 
	{
		StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure().build();
				
		Metadata metadata = new MetadataSources(registry).getMetadataBuilder().build();
		
		SessionFactory sf = metadata.getSessionFactoryBuilder().build();
		
		System.out.println("session factory created");
		
		Session session = sf.openSession();
		
		Category category = new Category("Computer");
        
        Product pc = new Product("DELL PC", "Quad-core PC", 1200, category);
         
        Product laptop = new Product("MacBook", "Apple High-end laptop", 2100, category);
         
        Product phone = new Product("iPhone 5", "Apple Best-selling smartphone", 499, category);
         
        Product tablet = new Product("iPad 3", "Apple Best-selling tablet", 1099, category);
         
        Set<Product> products = new HashSet<Product>();
        products.add(pc);
        products.add(laptop);
        products.add(phone);
        products.add(tablet);
         
        category.setProducts(products);
        Transaction tr= session.beginTransaction();
        session.save(category);
         
		
		tr.commit();
		
		System.out.println(" saved");
		
		session.close();
		sf.close();

	}

}

