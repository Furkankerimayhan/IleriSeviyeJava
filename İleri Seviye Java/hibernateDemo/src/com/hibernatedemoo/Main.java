package com.hibernatedemoo;


import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {
	public static void main(String[] args) {
	SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
			.addAnnotatedClass(Actor.class)
			.buildSessionFactory();
	//Unit of Work
	Session session = factory.getCurrentSession();
	
	try {
		session.beginTransaction();
		//HQL-->Hibernate Query Language
		//Select * from actor
		//from Actor a where a.lastname='DAVIS' AND a.name='SUSAN'
		//drom Actor a where a.lastname LIKE '%AY%'  //İçerisinde "AY" geçenleri verir. %AY ile bitenleri verir. AY% ile başlayanları verir.
		//ASC-Ascending
		//DESC-Descending
		
		/*List<Actor> actors = session.createQuery("from Actor a GROUP BY a.name").getResultList();
		
		for(Actor actor:actors) {
			System.out.println(actor.getName());*/
        
		/*
		 * List<String> lastnames =
		 * session.createQuery("select a.lastname from Actor a GROUP BY a.lastname").
		 * getResultList();
		 * 
		 * 
		 * for(String lastname:lastnames) { System.out.println(lastname); }
		 */
		
		//INSERT
//		Actor actor = new Actor();
//		actor.setName("Luna");
//		actor.setLastname("Ayhan");
//		actor.setId(203);
//		
//		session.save(actor);
		
		//UPDATE
		/*
		 * Actor actor = session.get(Actor.class, 202); actor.setName("Pırtık");
		 * 
		 * session.save(actor);
		 */
		
		//CRUD Create Read Update Delete
		
		//Delete
		Actor actor = session.get(Actor.class, 201);
		session.delete(actor);
		
		
		session.getTransaction().commit();	
		System.out.println("Actor silindi.");
	}finally {
		factory.close();
	}
}
}


