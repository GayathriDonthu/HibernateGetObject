package com.get;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	private static SessionFactory sessionFactory;
	private static Session session;
	
	static{
		try{
			sessionFactory = new Configuration().configure().buildSessionFactory();
			session = sessionFactory.openSession();
		}
		catch(Throwable e){
			new ExceptionInInitializerError(e);
		}
	}

	public static Session getSession() {
		return session;
	}
	
	public void shutDown(){
		getSession().close();
	}
	
}
