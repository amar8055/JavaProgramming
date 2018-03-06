package com.hibernateDemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class MainFirstClass {

	public static void main(String[] args) {
		
		SessionFactory sf = HibernateConfig.getSessionFactory();// We r getting the SessionFactory 
		//object from  HibernateConfig 
		
		Session session = sf.openSession();
		//Here the openning a session with Session Object.
		
		Transaction tran =session.beginTransaction();
		//Now, we are actually beginning the transaction.
		
		Customer c=new Customer();
		/*c.setFirstname("Amar1");
		c.setLastname("Bhavanam");
		c.setMobile(7097);
		
		session.save(c);*/ //Save create a new record in db
		
		
//ALTER the Customer Record
		c=session.get(Customer.class, 1);
		c.setFirstname("Rohi");
		c.setLastname("Bhavanam");
		
		session.update(c);
		
		
		
		
		
		//c=session.load(Customer.class, 1);
		//load will load the objects in the customer class and returns customer
		//so, now we have to get it from customer.
		/*System.out.println(c.getFirstname());
		System.out.println(c.getLastname());
		System.out.println(c.getMobile());*/
		
		
		
		tran.commit();
		session.close();
		sf.close();
		
		
		

	}

}
