package com.orm;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class select {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SessionFactory factory=new Configuration().configure("hibernete_cfg.xml").buildSessionFactory();
        
        System.out.println("Connected ! "+factory);
        
        Session session=factory.openSession();
        
        Student student =(Student) session.get(Student.class, 2);
        
//        System.out.println(student.getName()+"  ....And He is From "+student.getCity());
//        System.out.println(student);
	}

}
