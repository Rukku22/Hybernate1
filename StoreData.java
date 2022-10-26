package com.org.Hibernate1;

import org.hibernate.Session;    


import org.hibernate.SessionFactory;    
import org.hibernate.Transaction;  
import org.hibernate.boot.Metadata;  
import org.hibernate.boot.MetadataSources;  
import org.hibernate.boot.registry.StandardServiceRegistry;  
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;  
  
    
public class StoreData {    
public static void main(String[] args) {   
	
	Configuration cfg = new Configuration();
	cfg.configure("hibernate.cfg.xml"); 

	SessionFactory factory = cfg.buildSessionFactory();
	Session session = factory.openSession();
	
	Transaction t = session.beginTransaction();
	
            
    Employee e1=new Employee(); 
    e1.setId( 103);
    e1.setFirstName("prashanth");    
    e1.setLastName("gope");    
    session.save(e1); 
    session.flush();
    t.commit();  
    System.out.println("successfully saved");    
    session.close();  
    factory.close();  
     
        
}    
}   