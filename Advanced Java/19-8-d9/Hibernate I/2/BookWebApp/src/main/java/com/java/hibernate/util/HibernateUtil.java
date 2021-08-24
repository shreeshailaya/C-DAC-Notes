package com.java.hibernate.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class HibernateUtil {

    private static  SessionFactory sessionFactory;

    static {
        try {
        	StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure().build();
    		
    		/*MetadataSources sources = new MetadataSources(registry);
    		
    		Metadata metadata = sources.getMetadataBuilder().build();*/
    		
        	sessionFactory= new MetadataSources(registry).getMetadataBuilder().build().getSessionFactoryBuilder().build();
    		
    	//	= metadata.getSessionFactoryBuilder().build();
    		
        } catch (Throwable ex) {
            System.err.println("Initial SessionFactory creation failed." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static Session openSession() {
        return sessionFactory.openSession();
    }
}