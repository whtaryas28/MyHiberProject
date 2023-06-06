package com.orm;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Connecting ...!" );
        
       
        SessionFactory factory=new Configuration().configure("hibernete_cfg.xml").buildSessionFactory();
        
        System.out.println("Connected ! "+factory);
        
        Student student1 =new Student();
  
        student1.setName("Raja");
        student1.setCity("Morena");
        
        System.out.println(student1);
        
        Session session =factory.openSession();
        Transaction tx=session.beginTransaction();
        session.save(student1);
        tx.commit();
        session.close();
        
    }
}
