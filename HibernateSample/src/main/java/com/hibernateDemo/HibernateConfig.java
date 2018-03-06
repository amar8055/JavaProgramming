package com.hibernateDemo;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
 
public class HibernateConfig {
	
	private static SessionFactory sf;
	
	static {
		 sf = new Configuration().configure("hibernate.cfg.xml")
				 .buildSessionFactory();
	}
	
	public static SessionFactory getSessionFactory() {
		
		return sf;
		
	}
	
	
	
	
}


