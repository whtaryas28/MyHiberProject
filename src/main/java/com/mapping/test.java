package com.mapping;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class test
{
    public static void main( String[] args )
    {
        System.out.println( "Connecting ...!" );
        
       
        SessionFactory factory=new Configuration().configure("hibernete_cfg.xml").buildSessionFactory();
        
        System.out.println("Connected ! "+factory);
        
//        Question q1= new Question();
//		q1.setQid(123);
//		q1.setQuestion("What is Earth");
//		
//		Answer a1= new Answer();
//		a1.setAid(321);
//		a1.setAns("Earth is a Sperial Planet ...");
//		a1.setQuestion(q1);
//		
//		
//		Answer a1_1= new Answer();
//		a1_1.setAid(532);
//		a1_1.setAns("Earth Is living Planet Where Life Is Exist..");
//		a1_1.setQuestion(q1);
//		
//		
//		
//		
//		
//		Question q2= new Question();
//		q2.setQid(125);
//		q2.setQuestion("What is Sun");
//	
//		
//		Answer a2= new Answer();
//		a2.setAid(425);
//		a2.setAns("Sun is Large Object Star Which is Rotate on their Axis and all planet around the Sun   ...");
//		a2.setQuestion(q2);
//		
//		List<Answer> list=new ArrayList<Answer>();
//		list.add(a1);
//		list.add(a1_1);
//		q1.setAnswer(list);
		
	
		
        
        Session session =factory.openSession();
        Transaction tx=session.beginTransaction();
        
//        session.save(q1);
//        session.save(q2);
//        session.save(a1);
//        session.save(a2);
//        session.save(a1_1);
        
        
        Question q=(Question) session.get(Question.class, 123);
        System.out.println(q.getQuestion());
        
        for(Answer a:q.getAnswer()) {
        	System.out.println(a.getAns());
        }
        
        tx.commit();
        session.close();
        
    }
}
