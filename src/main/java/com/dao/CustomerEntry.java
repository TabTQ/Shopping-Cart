package com.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class CustomerEntry {
	public CustomerEntry(String name, String city, String add, String uname, String upass, String mobile, String email) {
		Configuration cfg=new Configuration().configure();
		
		SessionFactory factory=cfg.buildSessionFactory();
		
		Session session=factory.openSession();
		
		Query query=session.createQuery("select customer_no from customerEntity");
		List<Object[]> cust = query.list();
		int size = cust.size();
		
		User userentry = new User();
		userentry.setUname(uname);
		userentry.setUpass(upass);
		
		CustomerDTO obj = new CustomerDTO();
		obj.setCustomer_no(size);
		obj.setCustomer_name(name);
		obj.setCustomer_city(city);
		obj.setCustomer_address(add);
		obj.setMobile(mobile);
		obj.setEmail(email);
		obj.setUnamepass(userentry);
		
		userentry.setUser(obj);
		
		session.save(userentry);
		session.save(obj);
		session.beginTransaction().commit();
	}
}
